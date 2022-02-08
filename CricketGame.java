
import java.util.Random;
import java.util.Scanner;


class Players{
    private String name;
    public Players(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Play{
    private Random random;
    public Play(Random random){
        this.random=random;
    }

    public int bat(){
        return random.nextInt(8);
    }

}
class GameController{
    static void run(){
        //
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        while (true){
            System.out.println("do you want to play?");
            String answer=sc.nextLine();

            if(answer.equals("yes")){
                System.out.println("enter the player name");
                String name=sc.nextLine();

                Players player=new Players(name);

                Play play=new Play(random);
                int score=0;
                for(int i=0;i<6;i++){
                    System.out.println("type: Swing");
                    sc.nextLine();
                    int result=play.bat();
                    if(result==7){
                        System.out.println("Oops! " + player.getName()+ " got out!");
                        break;
                    }
                    else{
                        score+=result;
                        System.out.println(player.getName()+ " hits "+result+" runs!");

                    }
                }
        System.out.println(player.getName()+" scored "+score+" runs in one over!");
            }
            else{
                break;
            }

        }
    }
}

public class CricketGame {
  public static void main(String[] args) {
      GameController.run();
  }
}
