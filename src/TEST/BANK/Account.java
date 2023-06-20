package TEST.BANK;

public class Account {
    /*-----------------------------------------------------------------------*/

    private String name;                // 예금주
    private int money;                  // 잔고
    private String account;                // 계좌번호
    private static String displayAccount;             // 계좌번호 (문자열로 001,002,003)

    // 계좌 생성자
    public Account(String name, int money, String account) {
        this.name = name;
        this.money = money;
        this.account = account;
    }
    // 이름 불러오기
    public String getName() {
        return name;
    }
    // 계좌번호 불러오기

    public String getAccount() {
        return account;
    }


    /*-----------------------------------------------------------------------*/
    // 입금
    public void deposit(int deposit) {
        if (deposit <= 0) {
            System.out.println("금액 입력 오류");
            return;
        }
        money += deposit;
    }
    // 출금
    public void withdraw(int withdraw) {
        if (withdraw > money) {
            System.out.println("잔액 부족");
            return;
        }
        if (withdraw <= 0) {
            System.out.println("금액 입력 오류");
            return;
        }
        money -= withdraw;
    }
    // 계좌정보조회
    public String getAccountInfo() {
        return "계좌번호" + account + "/ 예금주명: " + name + " / 잔고: " + money;
    }
    // 잔고 조회
    public int getMoney() {
        return money;
    }
}
    /*-----------------------------------------------------------------------*/

