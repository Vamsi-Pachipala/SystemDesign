package DesignProblems.Splitwise;

import java.util.List;

public class GroupService {


    GroupService() {

    }
   void split(Group group , Expense expense, SpliterStrategy spliterStrategy) {

        List<Split> splits = spliterStrategy.split(expense);

        for(Split split : splits){
            split.user.updateBalance(split , expense.paidBy);
        }

        group.updateTotalAmount(expense.amount);
        group.displayGroupBalanceSheet();
    }

}
