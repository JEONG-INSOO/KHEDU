package Day1;

import java.sql.SQLOutput;

public class Exam7 {
  public static void main(String[] args) {
    int kor = 95;
//    boolean flag = kor >=90;
    //단순 if
//    if(kor >=90){
//      System.out.println("90 이상이다");
    //if else
    if(kor >= 90){
      System.out.println("90 이상이다");
    }else {
      System.out.println("90 미만이다");
    }
    //if else if else
    if(kor >= 90) {
      System.out.println("수");
    } else if (kor >= 80) {
      System.out.println("우");
    } else if (kor >= 70) {
      System.out.println("미");
    } else if (kor >= 60) {
      System.out.println("양");
    } else {
      System.out.println("가");
    }
  }
}