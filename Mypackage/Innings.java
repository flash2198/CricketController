package Mypackage;

import java.util.Random;

public class Innings {
    private int score;

    public void firstBatting(Random random){
        int wickets=10;
        int runsWicket;
        for(int i=0;i<20;i++){
            for(int j=0;j<6;j++){
                runsWicket=random.nextInt(8);
                if(runsWicket==7){
                    wickets-=1;
                }
                else{
                    score+=runsWicket;
                }

                if(wickets==0){
                    break;
                }
                if(wickets==0){
                    break;
                }
            }
        }
    }

    public String secondInningsAndResult(Random random){
        int runsWickets;
        int wickets=10;
        for(int i=0;i<20;i++){
            for(int j=0;i<6;j++){
                runsWickets=random.nextInt(8);
                if(runsWickets==7){
                    wickets-=1;
                }
                else{
                    score-=runsWickets;
                }

                if(score<0){
                    return "Wins";
                }
                else if(wickets==0 && score==0){
                    return "Draw";
                }
                else if(wickets==0){
                    return "Lost";
                }

            }
        }

        if(score==0){
            return "Draw";
        }
        return "Lost";
    }

    public int getRuns(){
        return score;
    }
}
