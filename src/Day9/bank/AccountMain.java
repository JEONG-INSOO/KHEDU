/*
package Day9.bank;
*//*

*/
/*
    라이브러리 클래스명: Account / 실행 클래스 : AccountMain
    1) 신규
            계좌는 예금주 이름을 입력 받아 생성한다
            총 개설할 수 있는 계좌는 5개로 제한, 1인당 1계좌 개설가능(동명이인X)
            초기 계좌 개설시 잔액은 0
            계좌는 3자리, 순차적으로 중복없이 자동 생성
    2) 폐지
            잔액이 남아있는 경우 폐지 불가능
    3) 입금
            계좌번호로 조회 후 입금한다.
            1회 입금한도는 4만원을 초과할 수 없다
            예치금액은 10만원 이하로 제한
    4) 출금
            계좌번호로 조회 후 출금
    5) 조회 (개별)
            계좌번호로 조회할 수 있다.
    6) 조회 (전체)
            전체 계좌번호 예금주 이름, 잔고, 사용중인 계좌수, 잔여계좌수 출력
    7) 종료 ("X")
            프로그램 실행을 종료한다.

    [Account class 필수 멤버] 속성: 예금주 이름, 잔고, 계좌
                             기능: 입금, 출금, 조회
*//*



        import java.sql.SQLOutput;
        import java.util.Scanner;


public class AccountMain {

    // 계좌 갯수 제한
    static Account[] accounts = new Account[4];
    static int index = 0;

    // 계좌 번호 확인
    public static int retryAccountNumber(int accountNumber) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccount() == accountNumber) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean banksvc = false;
        while(!banksvc){
            // 초기 화면
            System.out.println("------------------------------------------------------------------");
            System.out.println("1.신규 | 2.폐지 | 3.입금 | 4.출금 | 5.조회(개별) | 6.조회(전체) | X.종료");
            System.out.println("------------------------------------------------------------------");
            System.out.printf("선택 >> ");
            int choice = scanner.nextInt();
            String neme = scanner.nextLine();
            switch (choice) {
                case 1:     //계좌 개설
                    createAccount();
                    break;
                case 2:     //계좌 폐지

                    break;
                case 3:     //입금
                    inmoney();
                    break;
                case 4:     //출금
                    outmoney();
                    break;
                case 5:     //조회(개별)
                    AccountCheck();
                    break;
                case 6:     //조회(전체)
                    AccountsCheck();
                    break;
            }
        }
    }
    // 계좌 개설
    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("예금주 이름을 입력하시오.");
        String neme = scanner.nextLine();
        accounts[index] = new Account(neme);
        index++;
        System.out.println("계좌 개설이 완료됐습니다.");
//        String uN = String.format("%03d", acc1.getAccount());
//        System.out.println();
//        System.out.println("설정된 예금주 이름: " + acc1.getName());
//        System.out.println("계좌 번호: " +uN);
//        System.out.println("계좌 잔액: " + acc1.getMoney());
    }


    //입금
    public static void inmoney() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입금하실 계좌번호를 입력하세요.");
        int accountNumber = scanner.nextInt();
        System.out.print("입금금액 : ");
        int depositMoney = scanner.nextInt();

        int index = retryAccountNumber(accountNumber);
        if (index != -1) {
            accounts[index].deposit(amount);
        } else {
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }

    //출금
    public static void outmoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금하실 계좌번호를 입력하세요.");
        int accountNumber = scanner.nextInt();
        System.out.println("출금하실 금액을 입력하세요.");
        int amount = scanner.nextInt();

        int index = retryAccountNumber(accountNumber);
        if (index == -1) {
            System.out.println("계좌번호가 존재하지 않습니다.");
        } else {
            accounts[index].withdraw(amount);
            System.out.printf("%d원이 인출됐습니다.%n", amount);
        }
    }

    public static void AccountCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("확인하실 계좌번호를 입력하세요.");
        int accountNumber = scanner.nextInt();

        int index = retryAccountNumber(accountNumber);
        if (index != -1) {
            System.out.printf("계좌번호 %d%m", accounts[index].getMoney());
        } else {
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }

    public static void AccountsCheck() {
        for (int i = 0; i < index; i++) {
            System.out.printf("%s %n", accounts[i].accountsCheck());
        }
    }
}
//boolean num = false;
//        switch (num) {
//            case 1: // 신규
//                // 동명이인 판정
//                boolean equal = false;
//                // 계좌가 5개 이상일 시
//                if(count >= 5) {
//                    System.out.println("계좌를 더 이상 생성할 수 없습니다.");
//                    continue;
//                }
//                // 예금주 이름
//                System.out.println("예금주 이름을 입력하시오.");
//                String accountName = scanner.nextLine();
//
//                // 모든 계좌를 탐색하여 동명이인 파악
//                for (Account account: accounts) {
//                    if(account == null) continue;
//                    if(account.getAccountName().equals(accountName)) {
//                        System.out.println("동명이인이므로 계좌를 생성할 수 없습니다.");
//                        equal = true;
//                        break;
//                    }
//                }
//                // 동명이인 발견 시 break
//                if(equal) break;
//
//                // 계좌리스트를 탐색하여 null인 자리에 새 계좌 생성
//                for (int i = 0; i < accounts.length; i++) {
//                    if(accounts[i] == null) {
//                        accounts[i] = new Account(accountNumber, accountName);
//                        accountNumber++;
//                        break;
//                    }
//                }
//                count++;
//
//                System.out.println("계좌를 성공적으로 개설하였습니다.");
//                break;
//        }
*/
