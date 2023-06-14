package Day5;
/*
  무한 루프 빠져나오기
*/

public class Exam9 {
  public static void main(String[] args) {
    int i = 0;
      //case 1) break 사용
//    while (true) {
//      i++;
//      System.out.println(i);
//      // i 값이 10이면 반복문 빠져나오기.
//      if (i == 10) {
//        break;
//      }
//    }
      //case2) flag 사용
//    boolean stop = false;
//    while (!stop) {
//      i++;
//      System.out.println(i);
//      // i 값이 10이면 반복문 빠져나오기.
//      if (i == 10) {
//        stop = true;
//      }
//    }
      //case3) 중첩 반복문 break label;
//    outer:
//    while (true) {
//      System.out.println(i++);
//      int j = 0;
//        while(true){
//          System.out.println(j++);
//          // j값이 10일 때 제일 바깥쪽 while 문 빠져나오기
//          if (j == 10) {
//            break outer;
//          }
//        }
//    }
      //case 4) 중첩반복문 flag
    boolean outerstop = false;
    while (!outerstop) {
            System.out.println(i++);
      int j = 0;
      boolean innertstop = false;
        while(!innertstop){
          System.out.println(j++);
          // j값이 10일 때 제일 바깥쪽 while 문 빠져나오기
          if (j == 10) {
            innertstop = true;
            outerstop = true;
          }
        }
    }

  }
}
