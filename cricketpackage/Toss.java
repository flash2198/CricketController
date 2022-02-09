package cricketpackage;

public class Toss {
  private final Captians captainNames;
  private String tossWinner;
  private String tossLoser;

  public static Toss of(Captians captainNames) {
    return new Toss(captainNames);
  }

  private Toss(Captians captainNames) {
    this.captainNames = captainNames;
  }

  public void tossTheCoin() {
    int toss = GameController.RANDOM.nextInt(2);
    if (toss == 0) {
      tossWinner = captainNames.getFirstCaptainName();
      tossLoser = captainNames.getSecondCaptainName();
      return;
    }
    tossWinner = captainNames.getSecondCaptainName();
    tossLoser = captainNames.getFirstCaptainName();
  }

  public String getTossWinner() {
    return tossWinner;
  }

  public String getTossLoser() {
    return tossLoser;
  }

  public String batOrBowl() {
    int batBowl = GameController.RANDOM.nextInt(2);
    if (batBowl == 0) {
      return "bat";
    }
    return "ball";
  }
}
