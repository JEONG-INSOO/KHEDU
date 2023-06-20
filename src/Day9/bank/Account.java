package Day9.bank;

public class Account {
    /*-----------------------------------------------------------------------*/

    private static String name;                // 예금주
    private int money;                  // 잔고
    private static int account;                // 계좌번호
    private String displayAccount;             // 계좌번호 (문자열로 001,002,003)

    // 예금주 이름 불러오기
    public String getName() {
        return name;
    }
    // 예금주 이름 설정하기

    public void setName(String name) {
        this.name = name;
    }
    // 잔고 확인하기

    public int getMoney() {
        return money;
    }
    //잔고 넣기

    public void setMoney(int money) {
        this.money = money;
    }
    // 계좌번호 확인

    public int getAccount() {
        return account;
    }
    /*-----------------------------------------------------------------------*/

    public void deposit(int deposit) {             // 입금
        if (deposit <= 0) {
            System.out.println("금액 입력 오류");
            return;
        }
        money += deposit;
    }

    public void withdraw(int withdraw) {            // 출금
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

    public void accountCheck() {        // 통장조회

    }

    public String accountsCheck() {       // 통장조회 (전체)
        return "예금주 명: "+ name+"계좌 번호: " +account+"잔고: "+money;
    }

    /*-----------------------------------------------------------------------*/
    // 계좌 생성자
    public Account(String name) {
        this.name = name;
        this.money = money;
        this.account++;
//        계좌번호 문자열 변환
//        displayAccount = changeAccount(account);
    }

//
//    //계좌번호 문자열 변환
//    private String changeAccount(int account) {
//        // 1) 계좌번호(정수) -> 계좌번호(문자열)
//        String accountToString = String.valueOf(account);
//        int lengthOfAccount = accountToString.length();
//
//        // 2) 계좌번호 전체자리수에서 "0"으로 채울 갯수 계산
//        String zero = "";
//        for (int i = 0; i < 3 - lengthOfAccount; i++) {
//            zero += "0";
//        }
//        return zero + accountToString;
//    }
//
//    public String getDisplayAccount() {
//        return displayAccount;
//    }
}