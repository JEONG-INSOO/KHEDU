package com.kh.dic;

import java.util.TreeMap;

public class Dictionary {
  private TreeMap<String, String> dic;

  public Dictionary(TreeMap<String, String> dic) {
    this.dic = dic;
  }

  //저장
  public void save(String word, String meaning) {
    // 중복체크
    if (dic.containsKey(word)) {
      throw new RuntimeException("중복입니다 !");
    }
    dic.put(word, meaning);
  }
}
