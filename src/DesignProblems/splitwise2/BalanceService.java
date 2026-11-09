package DesignProblems.splitwise2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class BalanceService {

    Map<Integer , Map<User , Map<User , Double>>> balances;

    BalanceService() {
        balances = new HashMap<>();
    }

    public void updateBalance(int groupid , User paidBy, List<Split> splits) {

        for(Split split : splits) {
            User owedBy = split.user;
            double amount = split.amount;

            if(owedBy.id == paidBy.id) {
                continue; // Skip if the user is the one who paid
            }

            balances.putIfAbsent(groupid, new HashMap<>());
            Map<User , Map<User , Double>> groupBalances = balances.get(groupid);

            groupBalances.putIfAbsent(owedBy, new HashMap<>());
            Map<User , Double> owedByBalances = groupBalances.get(owedBy);
            owedByBalances.put(paidBy, owedByBalances.getOrDefault(paidBy, 0.0) + amount);
        }
    }

    public void showBalanceSheet(int groupId) {
        Map<User , Map<User , Double>> groupBalances = balances.get(groupId);
        if (groupBalances == null) {
            System.out.println("No balances found for group " + groupId);
            return;
        }

        for (Map.Entry<User, Map<User, Double>> entry : groupBalances.entrySet()) {
            User user = entry.getKey();
            Map<User, Double> userBalance = entry.getValue();

            for (Map.Entry<User, Double> balanceEntry : userBalance.entrySet()) {
                User owedTo = balanceEntry.getKey();
                double amount = balanceEntry.getValue();

                if (amount > 0) {
                    System.out.println(user.name + " owes " + owedTo.name + ": " + amount);
                }
            }
        }
    }

    public void nettingBalanceSheet(int groupId) {
        Map<User , Map<User , Double>> groupBalances = balances.get(groupId);
        if (groupBalances == null) {
            System.out.println("No balances found for group " + groupId);
            return;
        }

        System.out.println("Netted Balances for group " + groupId + ":");
        // please do the netting like if A has B and B has A
        // do the netting and show the final balance

        Map<User, Map<User, Double>> nettedBalances = new HashMap<>();

        for (Map.Entry<User, Map<User, Double>> entry : groupBalances.entrySet()) {
            User user = entry.getKey();
            Map<User, Double> userBalance = entry.getValue();

            for (Map.Entry<User, Double> balanceEntry : userBalance.entrySet()) {
                User owedTo = balanceEntry.getKey();
                double amount = balanceEntry.getValue();

                if (amount > 0) {
                    nettedBalances.putIfAbsent(user, new HashMap<>());
                    nettedBalances.putIfAbsent(owedTo, new HashMap<>());

                    double reverseAmount = nettedBalances.get(owedTo).getOrDefault(user, 0.0);
                    double netAmount = amount - reverseAmount;

                    if (netAmount > 0) {
                        nettedBalances.get(user).put(owedTo, netAmount);
                        nettedBalances.get(owedTo).put(user, 0.0);
                    } else {
                        nettedBalances.get(user).put(owedTo, 0.0);
                        nettedBalances.get(owedTo).put(user, -netAmount);
                    }
                }
            }
        }


        // Now print the netted balances
        for (Map.Entry<User, Map<User, Double>> entry : nettedBalances.entrySet()) {
            User user = entry.getKey();
            Map<User, Double> userBalance = entry.getValue();

            for (Map.Entry<User, Double> balanceEntry : userBalance.entrySet()) {
                User owedTo = balanceEntry.getKey();
                double amount = balanceEntry.getValue();

                if (amount > 0) {
                    System.out.println(user.name + " owes " + owedTo.name + ": " + amount);
                }
            }
        }
    }
}
