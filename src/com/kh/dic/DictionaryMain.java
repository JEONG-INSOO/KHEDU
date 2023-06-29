package com.kh.dic;

import com.kh.dic.Dictionary;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {
    com.kh.dic.Dictionary dic = new Dictionary();
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    while (!stop) {
      try {
        System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
        System.out.print("선택 >> ");
        String menu = scanner.nextLine();

        String word = null;     //단어
        String meaning = null;  //의미
        switch (menu) {
          case "1": //저장
            try {
            dic.save();
            } catch (RuntimeException e) {
              System.out.println(e.getMessage());
            }
            break;
          case "2": //검색
            break;
          case "3": //수정
            break;
          case "4": //삭제
            break;
          case "5": //목록
            break;
          case "6": //색인
            break;
          case "7": //통계
            break;
          case "8": // 종료
            stop = true;
            continue;
          default:
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println("프로그램 종료!");
  }
}