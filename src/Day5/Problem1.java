package Day5;
/*
  문제) 교실에 앉아있는 교육생 자리를 참고하여 2차원 정방행열을 만들고
  반장 1명, 각 테이블에서 조장을 1명 랜덤하게 산출하는 프로그램을 구하시오.
*/

public class Problem1 {
  public static void main(String[] args) {

    int[][] arr = new int[5][];
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[3];
    arr[3] = new int[3];
    arr[4] = new int[3];

    //2차원 정방행열
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
      }
    }

    //case 1
    String[][] students = {
        {"고형창", "박정현", "정인수"},
        {"곽문경", "최민석", "김재민", "김병국"},
        {"김기덕2", "유재성", "박수미"},
        {"김기덕1", "김영환", "박정연"},
        {"권기준", "김지열", "김홍섭"}
    };

    //case 2
    String[][] students2 = new String[5][];
    students2[0] = new String[]{"고형창", "박정현", "정인수"};
    students2[1] = new String[]{"곽문경", "최민석", "김재민", "김병국"};
    students2[2] = new String[]{"김기덕2", "유재성", "박수미"};
    students2[3] = new String[]{"김기덕1", "김영환", "박정연"};
    students2[4] = new String[]{"권기준", "김지열", "김홍섭"};

    //case 3
    String[][] students3 = new String[][]{
        {"고형창", "박정현", "정인수"},
        {"곽문경", "최민석", "김재민", "김병국"},
        {"김기덕2", "유재성", "박수미"},
        {"김기덕1", "김영환", "박정연"},
        {"권기준", "김지열", "김홍섭"}

    };
    // 반장 뽑기
    int row = (int) (Math.random() * students.length);
    int mate = (int) (Math.random() * students[row].length);
    System.out.println("우리반의 반장은 " + students[row][mate] + " 입니다.");
    students[row][mate] = null;
    // 조장 뽑기
    for (int i = 0; i < students.length; i++) {
      boolean stop = false;
      // 반장으로 선출되면 조장에서 제외
      while (!stop) {
        int classLeader = (int) (Math.random() * students[i].length);
        if (students[i][classLeader] == null) {
          continue;
        } else {
          stop = true;
        }
        System.out.println((i + 1) + "조의 조장은 " + students[i][classLeader] + " 입니다.");
      }
    }
  }

}
