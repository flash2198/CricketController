package Mypackage;

import java.util.ArrayList;
import java.util.Random;

public class GameController {
    public static void run(){
        Random random=new Random();
        Toss toss=new Toss(random);


        ArrayList<String> result=toss.tossResult();
        String tossWinner=result.get(0);
        String tossLoser=result.get(1);
        String tossDecesion=toss.batOrBowl();

        System.out.println(tossWinner+ " wins the toss and chooses to "+tossDecesion+ " first");
        System.out.println(tossLoser+ " losses the toss");

        String firstTeamCaptain;
        String secondTeamCaptain;

        if(tossDecesion=="bat"){
            firstTeamCaptain=tossWinner;
            secondTeamCaptain=tossLoser;
        }
        else{
            secondTeamCaptain=tossWinner;
            firstTeamCaptain=tossLoser;
        }


        Innings innings=new Innings();
        innings.firstBatting(random);
        int firstInningsRuns=innings.getRuns();
        System.out.println(firstTeamCaptain+ " team's scored " + firstInningsRuns+" runs");


        String secondTeamResult=innings.secondInningsAndResult(random);
        int secondInningsRuns=firstInningsRuns-innings.getRuns();
        if(secondTeamResult=="Wins"){
            System.out.println(secondTeamCaptain + " team's wins the match");;
        }
        else if(secondTeamResult=="Lost"){
            System.out.println(firstTeamCaptain + " team's wins the match by " + innings.getRuns()+ " runs");
            System.out.println(secondInningsRuns+" runs scored by "+secondTeamCaptain+ " team");
        }
        else{
            System.out.println("The match is draw");
        }
    }
    }

