package Day16.exam1;

public class Account {
  private int balance;      //잔액

  //입금
  public void deposit(int money) throws NoMinusException, ShortOfBalanceException {

    if (money <= 0) {
//      System.out.println("마이너스 입금불가");
      throw new NoMinusException("마이너스 입금불가");           //CheckedException
//      return;
    }
    if (balance - money < 0) {
      throw new ShortOfBalanceException("잔액이 모자랍니다.");    //UnCheckedException
    }
    balance += money;
  }

  //출금
  public void withdraw(int money) throws NoMinusException {
    balance -= money;
  }

  //잔액
  public int getBalance() {
    return balance;
  }
}
