package com.kh.dic;

import java.util.*;

public class Dictionary {
  Scanner scanner = new Scanner(System.in);
  private TreeMap<String, String> dic;

  //생성자
  public Dictionary() {
    this.dic = new TreeMap<>();
  }


  String word = null;           //입력 받을 단어
  String meaning = null;        //입력 받을 의미

  /* 가장 긴 단어 뽑을 때 쓰이는 것들 */
  int max = 0;
  String max_word = null;
  String max_meaning = null;
  String max_word2 = null;          // 가장 긴 단어 겹칠 때
  String max_meaning2 = null;       // 가장 긴 단어 겹칠 때
  /* ------------------------- */

  // 1. 저장
  public void save() {

    System.out.println("입력할 단어를 입력하세요.");
    String word2 = scanner.nextLine();
    System.out.println("입력한 단어의 의미를 입력하세요.");
    String meaning2 = scanner.nextLine();

    // 중복체크
    if (dic.containsKey(word2)) {
      throw new RuntimeException("이미 등록되었습니다.");
    }
    //최대 5개
    if (dic.size() >= 5) {
      throw new RuntimeException("최대 5개 단어만 저장할 수 있습니다.");
    }
    this.dic.put(word2, meaning2);
    System.out.println("단어 저장 완료!");
    word = word2.toLowerCase();             //소문자로 변환
    meaning = meaning2.toLowerCase();
  }

  public String getWord() {
    return word;
  }

  // 2. 검색
  public void search() {

    Map<String, String> map = new HashMap<>();
    System.out.println("단어를 입력하세요.");
    String word2 = scanner.nextLine();
    word = word2.toLowerCase();
    map.put(word, meaning);
    if (map.size() == 0 || meaning == null) {
      throw new DictionaryException("단어를 검색할 수 없습니다.");
    }
    if (map.containsKey(word)) {
      System.out.println("단어 : " + word + " /" + "   의미 : " + meaning);

    } else {
      System.out.println(dic.floorEntry(word));
    }
  }

  // 3. 수정
  public void change() {
    System.out.println("의미를 수정할 단어를 입력하세요.");
    String word2 = scanner.nextLine();
    word = word2.toLowerCase();
    if (dic.replace(word, meaning) == null) {
      throw new RuntimeException("단어를 검색할 수 없습니다");
    } else {
      System.out.println("수정할 단어의 의미를 입력하세요.");
      meaning = scanner.nextLine();
      dic.replace(word, meaning);
      System.out.println("단어의 뜻을 수정 하였습니다.");
    }
  }

  // 4. 삭제

  public void delete() {
    System.out.print("단어입력 : ");
    String word2 = scanner.nextLine();
    word = word2.toLowerCase();
    if (dic.remove(word) == null) {
      throw new RuntimeException("단어를 검색할 수 없습니다.");
    } else {
      System.out.println("단어를 삭제 하였습니다.");
    }
  }

  // 5. 목록
  public Map<String, String> list() {

    Map<String, String> map = null;
    System.out.println("1.오름차순 / 2.내림차순");
    System.out.print("선택 >> ");
    String upDown = scanner.nextLine();

    switch (upDown) {
      case "1":  //오름차순
        map = dic;
        Map<String, String> ascending = map;
        System.out.println(ascending);
        break;
      case "2":  //내림차순
        map = dic.descendingMap();
        Map<String, String> descending = map;
        System.out.println(descending);
        break;
    }
    return map;
  }

  // 6. 색인
  public List<String> index() {
    System.out.println("한 글자를 입력해주세요. ");

    char inputIndex = scanner.nextLine().charAt(0);
    inputIndex = Character.toLowerCase(inputIndex);

    String from = String.valueOf(inputIndex);
    String to = String.valueOf( (char)(inputIndex + 1) );
    List<String> list = new ArrayList<>();

    Set set = dic.keySet();
    TreeSet treeSet = new TreeSet<>(set);
    NavigableSet subSet = treeSet.subSet(from, false, to, false);
    for (Object everything : subSet) {
      String word = (String)everything;
      list.add(word);
    }
    System.out.println(list);
    if (list.size() == 0) {
      throw new com.kh.dic2.DictionaryException("해당 정보를 찾을 수 없습니다.");
    }
    return list;
  }
  // 7. 통계
  public void statistics() {
    // 7-1) 저장된 단어 갯수
    System.out.println("1. 저장된 단어 갯수 : " + dic.size());
    // 7-2) 단어의 문자수가 가장 많은 단어.
//    for (int i = 0; i < dic.size()+1; i++) {
//      if (max < word.length()) {
//        max = word.length();
//        max_word = word;
//        max_meaning = meaning;
//      } else if (max == word.length()){
//        max_word2 = word;
//        max_meaning2 = meaning;
//      }
//    }
//    System.out.println("2. 제일 긴 단어는 : " + max_word + "  의미는  "+max_meaning + "입니다" );
//    if (max_word != max_word2 && max_word2 != null) {
//    System.out.println("같은 글자 수의 단어로 " + max_word2 + "  의미는  " + max_meaning2 +  " 가 있습니다.");
//    }
    // 7-3) 단어 글자수 내림자순 출력 (단어만)
    }
  }