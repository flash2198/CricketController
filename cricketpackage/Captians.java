package cricketpackage;

public class Captians {
  private final String firstCaptainName;
  private final String secondCaptainName;

  public static Captians of(String firstCaptainName, String secondCaptainName) {
    return new Captians(firstCaptainName, secondCaptainName);
  }

  private Captians(String firstCaptainName, String secondCaptainName) {
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
