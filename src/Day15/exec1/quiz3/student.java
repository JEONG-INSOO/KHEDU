package Day15.exec1.quiz3;

public class student {
  student() {
    super();
  }

  private String clubType = null;
  private String sNmae = null;
  private int sNumber = 0;

  public student(String clubType, String sNmae, int sNumber) {
    this.clubType = clubType;
    this.sNmae = sNmae;
    this.sNumber = sNumber;
  }

  public String getClubType() {
    return clubType;
  }

  public void setClubType(String clubType) {
    this.clubType = clubType;
  }

  public String getsNmae() {
    return sNmae;
  }

  public void setsNmae(String sNmae) {
    this.sNmae = sNmae;
  }

  public int getsNumber() {
    return sNumber;
  }

  public void setsNumber(int sNumber) {
    this.sNumber = sNumber;
  }
}
