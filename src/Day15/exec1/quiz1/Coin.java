package Day15.exec1.quiz1;

import java.util.Random;

public class Coin {
  private int face;             //현재면
  private final int HEAD = 1;   //앞면
  private final int TAIL = 2;   //뒷면
  public Coin(){
    super();
  }

  public void flip() {
    Random random = new Random();
    face = random.nextInt(2) + 1;
  }

  public int getFace() {
    return face;
  }

  public String facetoString() {
    return (face == HEAD) ? "앞면" : "뒷면";
  }
}
