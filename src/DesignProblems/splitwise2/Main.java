package DesignProblems.splitwise2;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Ravi");
        User user2 = new User(2, "Rahul");
        User user3 = new User(3, "Ramesh");

        Group group = new Group(1, "Friends");

        GroupService groupService = new GroupService();

        groupService.createGroup(group.id, group.name);

        groupService.addUserToGroup(group.id, user1);
        groupService.addUserToGroup(group.id, user2);
        groupService.addUserToGroup(group.id, user3);

        groupService.addExpense(group.id, 1, "Dinner", 300.0, user1, SplitType.EQUAL);
        groupService.addExpense(group.id, 2, "Movie", 150.0, user2, SplitType.EQUAL);
        groupService.addExpense(group.id, 3, "Movie", 150.0, user2, SplitType.EQUAL);

        groupService.showBalance(group.id);

    }
}
