package TEST.BANK;

import java.sql.SQLOutput;
import java.util.Scanner;


public class AccountMain {
    // 계좌 갯수 제한
    private static Account[] accounts = new Account[5];
    private static int index = 0;
    private static int accountsCount = 1;
    // 계좌 번호 확인
    public static int retryAccountNumber(String accountNumber) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccount().contentEquals(accountNumber)) {
                return i;
            }
        }
        return -1;
    }
    //계좌 개설
    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("예금주 이름을 입력하시오.");
        String name = scanner.nextLine();
        System.out.println("계좌번호를 입력하시오.");
        String accountNum = scanner.nextLine();

        accounts[index] = new Account(name, 0,accountNum);
        index++;
        System.out.println("계좌 개설이 완료됐습니다.");
    }

    public static void retryMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계좌번호를 입력해주세요");
        String account = scanner.nextLine();

        int index = retryAccountNumber(account);
        if (index != -1) {
            System.out.printf("계좌번호 %d%n", accounts[index].getMoney());
        } else {
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }
    //폐지
    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        if (accounts[index] == null) {
            System.out.println("계좌 등록 먼저 부탁바랍니다.");
        } else {  System.out.println("폐지하실 계좌번호를 입력하세요.");
            String accountNumber = scanner.nextLine();

        }
    }
    //입금
    public static void inmoney () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입금하실 계좌번호를 입력하세요.");
        String accountNumber = scanner.nextLine();
        System.out.print("입금금액 : ");
        int depositMoney = scanner.nextInt();
        if (depositMoney > 40000) {
            System.out.println("최대 입금 금액은 4만원입니다.");
            return;
        }
        int index = retryAccountNumber(accountNumber);
        if (index != -1) {
            accounts[index].deposit(depositMoney);
        } else {
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }

    //출금
    public static void outmoney () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금하실 계좌번호를 입력하세요.");
        String  accountNumber = scanner.nextLine();
        System.out.println("출금하실 금액을 입력하세요.");
        int amount = scanner.nextInt();
        if (amount > 40000) {
            System.out.println("최대 출금 금액은 4만원입니다.");
            return;
        }

        int index = retryAccountNumber(accountNumber);
        if (index == -1) {
            System.out.println("계좌번호가 존재하지 않습니다.");
        } else {
            accounts[index].withdraw(amount);
            System.out.printf("%d원이 인출됐습니다.%n", amount);
        }
    }
    //조회 ( 개별 )
    public static void AccountCheck () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("확인하실 계좌번호를 입력하세요.");
        String accountNumber = scanner.nextLine();

        int index = retryAccountNumber(accountNumber);
        if (index != -1) {
            System.out.printf("계좌번호: %s / 예금주: %s / 잔고: %d ",accounts[index].getAccount(),accounts[index].getName(), accounts[index].getMoney());
            System.out.println();
        } else {
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }
    //조회 ( 전체 )
    public static void AccountsCheck () {
        for (int i = 0; i < index; i++) {
            System.out.printf("%s %n", accounts[i].getAccountInfo());
            int x = index;
            int y = 5 - index;
            System.out.println("사용중인 계좌수:" + x +"           "+ "잔여계좌수 : "+ y);
        }
    }

    //실행메소드
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean banksvc = false;
        while (!banksvc) {
            // 초기 화면
            System.out.println("------------------------------------------------------------------");
            System.out.println("1.신규 | 2.폐지 | 3.입금 | 4.출금 | 5.조회(개별) | 6.조회(전체) | X.종료");
            System.out.println("------------------------------------------------------------------");
            System.out.printf("선택 >> ");
            String  choice = scanner.nextLine();
            switch (choice) {
                case "1":     //계좌 개설
                    createAccount();
                    break;
                case "2":     //계좌 폐지

                    break;
                case "3":     //입금
                    inmoney();
                    break;
                case "4":     //출금
                    outmoney();
                    break;
                case "5":     //조회(개별)
                    AccountCheck();
                    break;
                case "6":     //조회(전체)
                    AccountsCheck();
                    break;
                case "X":
                    banksvc = true;
                    System.out.println("프로그램 종료!!");
                    break;
                default:
                    System.out.println("올바른 값을 입력하시오");
                    break;
            }
        }
    }
}
