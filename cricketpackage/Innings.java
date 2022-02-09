package cricketpackage;

public class Innings {
  public int doBatting() {
    int wickets = 10;
    int score = 0;
    int runsWicket;
    for (int i = 0; i < GameController.OVER * 6; i++) {
      runsWicket = GameController.RANDOM.nextInt(8);
      if (runsWicket == 7) {
        wickets -= 1;
      } else {
        score += runsWicket;
      }
      if (wickets == 0) {
        return score;
      }
    }
    return score;
  }

  public void resultOfTheMatch(
      int firstTeamRuns, String firstTeamCaptain, int secondTeamRuns, String secondTeamCaptain) {
    if (firstTeamRuns > secondTeamRuns) {
      System.out.println(
          firstTeamCaptain + " team's wins by " + (firstTeamRuns - secondTeamRuns) + " runs");
      return;
    }

    if (firstTeamRuns == secondTeamRuns) {
      System.out.println("The match is draw");
      return;
    }

    System.out.println(secondTeamCaptain + " team's wins the match");
  }
}
