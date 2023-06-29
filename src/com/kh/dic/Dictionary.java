package com.kh.dic;

import java.util.Scanner;
import java.util.TreeMap;

public class Dictionary {
  Scanner scanner = new Scanner(System.in);
  public TreeMap<String, String> dic;


  public Dictionary() {
    this.dic = dic;
  }

  //저장
  public void save() {
    System.out.println("입력할 단어를 입력하세요.");
    String word = scanner.nextLine();
    System.out.println("입력한 단어의 의미를 입력하세요.");
    String meaning = scanner.nextLine();

    // 중복체크
    if (dic.containsKey(word)) {
      throw new RuntimeException("중복된 단어입니다.");
    }
    //최대 5개
    if (dic.size() >= 5) {
      throw new RuntimeException("단어는 최대 5개까지 가능합니다.");
    }
    this.dic.put(word, meaning);
    System.out.println("단어 저장 완료!");
  }
}
