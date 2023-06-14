package Day5;
/*
  무한루프
*/

public class Exam8 {
  public static void main(String[] args) {
    int i = 0;

//    //case 1)
//    for (; ; ) {
//      System.out.println(i++);
//    }

//    //case2)
//    for (; true; ) {
//      System.out.println(i++);
//    }

//      //case3)
//    while (true) {
//      System.out.println(i++);
//    }
        //case4)
    do{
      System.out.println(i++);
    }while(true);
  }
}