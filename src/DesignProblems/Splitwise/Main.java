package DesignProblems.Splitwise;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1 , "Ramesh" , "1234567");
        User user2 = new User(2 , "Suresh" , "1234567");
        User user3 = new User(3 , "Mahesh" , "1234567");

        Group group = new Group(List.of(user1, user2, user3));

        Expense expense1 = new Expense(group, user1, 1000);
        Expense expense2 = new Expense(group, user2, 500);

        GroupService groupService = new GroupService();

        groupService.split(group, expense1, new EqualSplitStartegy());
        groupService.split(group, expense2, new EqualSplitStartegy());



    }
}
