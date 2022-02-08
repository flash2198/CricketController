package Mypackage;

import java.util.ArrayList;
import java.util.Random;

public class Toss {
    Player player1=Player.of("Ms Dhoni");
    Player player2=Player.of("Virat Kholi");

    private String tossWinner;
    private String tossLoser;
    private String chooseBatBowl;

    private Random random;
    public Toss(Random random){
        this.random=random;
    };

    public ArrayList<String> tossResult(){
        ArrayList<String> array=new ArrayList<>();
        int toss= random.nextInt(2);
        if(toss==0){
            tossWinner=player1.getPlayerName();
            tossLoser=player2.getPlayerName();
        }
        else{
            tossWinner=player2.getPlayerName();
            tossLoser=player1.getPlayerName();
        }
        array.add(tossWinner);
        array.add(tossLoser);
        return array;
    }

    public String batOrBowl(){
        int batBowl=random.nextInt(2);
        if(batBowl==0){
            chooseBatBowl="bat";
        }
        else{
            chooseBatBowl="ball";
        }
        return chooseBatBowl;
    }
}
