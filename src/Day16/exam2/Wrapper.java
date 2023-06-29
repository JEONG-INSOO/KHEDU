package Day16.exam2;
/*
  Wrapper클래스 : 기본 타입을 객체화 하기 위한 클래스
  byte0   -> Byte
  short   -> Short
  char    -> Character
  int     -> Integer
  long    -> Long
  float   -> Float
  double  -> Double
  boolean -> Boolean

  answkduf -> 기본타입의 값으로 변환 할 때 wrapper클래스 parse로 시작하는 메소드 사용
  기본타입 -> 문자열 : String.valueOf ( 기본타입 값 )
*/

public class Wrapper {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    if (Boolean.parseBoolean("true")) {
      System.out.println("참");
    }
    int y = 10;
    Integer x = y;
    System.out.println(x);
  }
  }
