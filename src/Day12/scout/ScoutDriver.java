package Day12.scout;
/*
(b) 클래스 설계
A. 필요한 클래스: ScoutDriver
B. ScoutDriver 클래스 설계
	변수들: 없음
	메소드: main 메소드
C. main 메소드 설계
변수들
	gscout: 걸스카우트 단원들의 배열
	gscoutname: 걸스카우트 단원의 이름
	saleweeks: 판매 기간
	saleperweek: 주별 판매 상자수

알고리즘
1.	세 명의 걸스카우트 단원들의 이름들을 읽어 들여 세 개의 걸스카우트 단원 객체들을 생성한다.
2.	과자 판매가 계속되는 주들의 수를 읽어 들인다.
3.	매 주 각 걸스카우트 단원이 판매한 과자 상자 수들을 입력받는다.
4.	각 걸스카우트 단원에 대해 이름과 총 판매 상자 수를 출력한다.
*/

import java.util.Scanner;

public class ScoutDriver {
    public static void main(String[] args) {
        String gscoutName;      //	gscoutname: 걸스카우트 단원의 이름
        int saleWeeks = 0;      //	saleweeks: 판매 기간
        int salePerWeek = 0;    //	saleperweek: 주별 판매 상자수
        Scanner scanner = new Scanner(System.in);
        int cnt = 0 ;           // 총 판매 갯수
        //1.	세 명의 걸스카우트 단원들의 이름들을 읽어 들여 세 개의 걸스카우트 단원 객체들을 생성한다.
        Scout[] gscout = new Scout[3];  //	gscout: 걸스카우트 단원들의 배열
        for (int i = 0; i < gscout.length; i++) {
            System.out.println("단원 이름 >>");
            gscoutName = scanner.nextLine();
            gscout[i] = new Scout(gscoutName);
        }

        //2. 과자 판매가 계속되는 주들의 수를 읽어 들인다.
        System.out.println("과자 판매 기간은 몇 주? >>");
        saleWeeks = scanner.nextInt();

        //3.	매 주 각 걸스카우트 단원이 판매한 과자 상자 수들을 입력받는다.
        for (int i = 0; i < saleWeeks; i++) {
            System.out.println((i + 1) + "번째주 상자 수를 입력하세요");
            for (int j = 0; j < gscout.length; j++) {
                System.out.print(gscout[j].getName() + "님의" + (i+1) + "주에 판매한 과자 상자 수 >> ");
                int cntOfBox = scanner.nextInt();
                salePerWeek = cntOfBox;
                gscout[j].updateSales(cntOfBox);
            }

        }

        //4.	각 걸스카우트 단원에 대해 이름과 총 판매 상자 수를 출력한다.
        for (int i = 0; i < gscout.length; i++) {
            System.out.println(gscout[i]);
        }
    }
}
