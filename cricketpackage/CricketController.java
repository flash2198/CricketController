package cricketpackage;

import java.util.Scanner;

public class CricketController {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the names of the captains");
    String firstCaptainName = sc.nextLine();
    String secondCaptainName = sc.nextLine();
    Captians captainNames = Captians.of(firstCaptainName, secondCaptainName);

    System.out.println("Enter the number of overs");
    GameController.OVER = sc.nextInt();
    GameController.run(captainNames);
    //
  }
}
