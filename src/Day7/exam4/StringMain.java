package Day7.exam4;

import java.util.Arrays;

public class StringMain {
  public static void main(String[] args) {
    String str = new String("울산KH정보교육원");

    int cnt = str.length();
    System.out.println(cnt);

    char ch = str.charAt(1);  //해당위치 글자 찾기
    System.out.println(ch);

    int position = str.indexOf("K"); // 글자 위치 찾기
    System.out.println(position);

    int position2 = str.indexOf("z", 5);
    System.out.println(position2);

    int position3 = str.lastIndexOf("K"); // 뒤에서부터 글자 찾기
    System.out.println(position3);

    String str2 = str.concat("5층"); //concatenate
    System.out.println(str2);

    String s = String.valueOf(3.14);// 자료형을 문자열로 만드는 메소드
    System.out.println(s);

    String str3 = new String("abcd");
    String upperCase = str3.toUpperCase();  //반대는 tolowercase
    System.out.println(upperCase);

    String s2 = str.replace("정보교육원", "학원"); // 글자 대체
    System.out.println(s2);

    String substring = str.substring(4);    // 해당 위치부터 뒤에 문장 소환
    System.out.println(substring);

    String substring1 = str.substring(4, 7); // 시작 위치부터 끝위치 전의 글자 소환
    System.out.println(substring1);

    String str4 = new String("울산 KH 정보-교 육 원  ");
    String trim = str4.trim();  // 양쪽 끝 공백 제거
    System.out.println(trim);

    String[] s1 = str4.split(" "); // 공백 기분으로 나눠서 보여줘
    for (int i = 0; i < s1.length; i++) {
      System.out.println(s1[i]);
    }
    String[] s42 = str4.split("-");  //dash 기준으로 나눠서 보여줘
    for (int j = 0; j < s42.length; j++) {
      System.out.println(s42[j]);
    }
    System.out.println(Arrays.toString(s1)); // 문자열을 만들어서 보여줌
  }
}
