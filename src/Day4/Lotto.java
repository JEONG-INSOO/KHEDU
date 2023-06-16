package Day4;

/*
Lotto 프로그램 구현하시오.
단) 1~45 사이의 중복없는 6자리 숫자 생성
Math.random() : 0.0 <= x <1 임의의 실수 생성

1. 1~45 사이의 랜덤 정수 발생
2. 중복체크
*/
public class Lotto {
  public static void goLotto(){
    final int SIZE = 6;
    int[] lotto = new int[SIZE];

    int dupCnt = 0; // 중복 발생 카운트
    //로또 번호 6개 생성
    for (int i = 0; i < SIZE; i++) {

      boolean stop = false;
      int num = 0;

      while(!stop){
        // 1) 번호 추출
        num = (int)(Math.random()*45)+1;

        // 2) 중복 체크
        boolean isDup = false;
        for (int j = 0; j < i; j++) {
          if (lotto[j] == num) {
            isDup = true;
            dupCnt++;
            System.out.printf("중복 숫자 [%d] %d \n", j, num);
            break;
          }
        }
        // #) 중복이 없는 경우 stop = true
        if(!isDup) stop = true;
      }
      lotto[i] = num;
    }
    // 중복 발생 횟수 출력
    System.out.println("중복발생 횟수: " + dupCnt);
    //로또 번호 출력
    for (int i = 0; i < lotto.length; i++) {
      if (i != lotto.length - 1) {
        System.out.printf("%d,", lotto[i]);
      } else {
        System.out.printf("%d", lotto[i]);
      }
    }
  }


  public static void main(String[] args) {
    goLotto();
  }
}