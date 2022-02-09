package cricketpackage;

public class Player {
  private final String firstCaptainName;
  private final String secondCaptainName;

  public static Player of(String firstCaptainName, String secondCaptainName) {
    return new Player(firstCaptainName, secondCaptainName);
  }

  private Player(String firstCaptainName, String secondCaptainName) {
    this.firstCaptainName = firstCaptainName;
    this.secondCaptainName = secondCaptainName;
  }

  public String getFirstCaptainName() {
    return firstCaptainName;
  }

  public String getSecondCaptainName() {
    return secondCaptainName;
  }
}
