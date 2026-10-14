package Mock2;

import java.util.HashMap;
import java.util.Queue;

import static Mock2.Snake.ladder;
import static Mock2.Snake.snake;


public class Snake {
    int r;
    int c;

    int rd;
    int cd;

    public Snake(int r, int c) {
        this.r = r;
        this.c = c;
    }

    static HashMap<Integer, Integer> snake = new HashMap<>();
    static HashMap<Integer, Integer> ladder = new HashMap<>();
    public static void main(String[] args) {

        Queue<User> users = new java.util.LinkedList<>();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Manager manager = new Manager(new int[100]);

        snake.put(14, 7);
        snake.put(50, 2);
        snake.put(45, 16);

        ladder.put(5 , 25);
        ladder.put(20 , 40);
        users.add(user1);
        users.add(user2);
        while(true){
            User currentuser = users.poll();

            int dice = manager.rollDice(currentuser);

            System.out.println(currentuser.name + " rolled a " + dice);

            boolean end = manager.move(currentuser, dice);
            if(end){
               // System.out.println("Game is finished and winner is " + currentuser.name);
                break;
            }
            users.add(currentuser);
        }

    }
}
class Ladder {
    int r;
    int c;

    public Ladder(int r, int c) {
        this.r = r;
        this.c = c;
    }
}


class User{
    String name;
    int pos;
    public User(String name) {
        this.name = name;
    }
}

class Cell{
    int pos;
    Snake Snake;
    Ladder ladder;

    Cell(int pos , boolean snake , boolean ladder , int cur , int back){
        this.pos = pos;
        if(snake){
            this.Snake = new Snake(cur , back);
        }
        if(ladder){
            this.ladder = new Ladder(cur , back);
        }
    }
    boolean isSnake(){
        return this.Snake != null;
    }
    boolean isLadder(){
        return this.ladder != null;
    }
}

class Manager{

    int[] board;

    public Manager(int[] board) {
        this.board = board;
    }

    public int rollDice(User user){
        int dice = (int)(Math.random()*6)+1;
        return dice;
    }

    public boolean move(User user, int dice){

        System.out.println("current position of " + user.name + " is " + user.pos);

        int curPos = user.pos;
        int newPos = curPos + dice;

        if(snake.containsKey(newPos)){
            int snakePos = snake.get(newPos);
            System.out.println("Snake found at position " + newPos + ". Moving back to position " + snakePos);
            newPos = snakePos;
        }
        else if(ladder.containsKey(newPos)){
            int ladderPos = ladder.get(newPos);
            System.out.println("Ladder found at position " + newPos + ". Moving up to position " + ladderPos);
            newPos = ladderPos;
        }
        if(newPos == 100){
            System.out.println("Game is finished and winner is " + user.name);
            return true;
        }
        else if(newPos > 100){
            System.out.println("Cannot move beyond position 100. Staying at position " + curPos);
            newPos = curPos;
        }
        user.pos = newPos;
        System.out.println("new position of " + user.name + " is " + user.pos);
        return false;

       /* boolean iSSnake = cell.isSnake();
        boolean isLadder = cell.isLadder();
        int curPos = cell.pos;
        int newPos = 0;
        if(iSSnake){
            int snakePos = getSnakePos();
            int ladderPos = cell.ladder.c;
            //print statements
            newPos = curPos + ladderPos;
        }
        else if(isLadder){
            int ladderPos = cell.ladder.c;
            //print statements
            newPos = curPos + ladderPos;
        }
        // new pos user
        User.pos =
        boolean finsish = isGameFinish(newR);
        if(finsish){
            System.out.println("Game is finsished and winner is " + user.name);
            return;
        }*/

    }
  //  int getSnakePos(int )
}


























