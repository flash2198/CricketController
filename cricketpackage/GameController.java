package cricketpackage;

import java.util.Random;

public class GameController {
  static final Random RANDOM = new Random();
  static int OVER;

  public static void run(Player player) {
    Toss toss = Toss.of(player);

    toss.tossTheCoin();
    String tossWinner = toss.getTossWinner();
    String tossLoser = toss.getTossLoser();
    String tossWinnerDecision = toss.batOrBowl();
    System.out.println(
        tossWinner + " wins the toss and chooses to " + tossWinnerDecision + " first");

    String firstTeamCaptain;
    String secondTeamCaptain;
    if (tossWinnerDecision.equals("bat")) {
      firstTeamCaptain = tossWinner;
      secondTeamCaptain = tossLoser;
    } else {
      secondTeamCaptain = tossWinner;
      firstTeamCaptain = tossLoser;
    }

    Innings innings = new Innings();

    int firstInningsRuns = innings.doBatting();
    System.out.println(firstInningsRuns + " runs were scored by " + firstTeamCaptain + "'s team");

    int secondInningsRuns = innings.doBatting();
    innings.resultOfTheMatch(
        firstInningsRuns, firstTeamCaptain, secondInningsRuns, secondTeamCaptain);
  }
}
