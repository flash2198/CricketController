package cricketpackage;

public class Toss {
  private final Player player;
  private String tossWinner;
  private String tossLoser;

  public static Toss of(Player player) {
    return new Toss(player);
  }

  private Toss(Player player) {
    this.player = player;
  }

  public void tossTheCoin() {
    int toss = GameController.RANDOM.nextInt(2);
    if (toss == 0) {
      tossWinner = player.getFirstCaptainName();
      tossLoser = player.getSecondCaptainName();
      return;
    }
    tossWinner = player.getSecondCaptainName();
    tossLoser = player.getFirstCaptainName();
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
