package Day12.coin;
import java.util.Random;
public class Coin {
    private String HEADS;               //HEADS: 앞면을 나타내는 상수
    private String TAILS;               //TAILS : 뒷면을 나타내는 상수
    private int face;                   //face: 동전의 현재 면

    //생성자 메소드: 동전을 던짐으로써 Coin 객체를 생성한다
    public Coin(String HEADS, String TAILS, int face) {
        this.HEADS = HEADS;
        this.TAILS = TAILS;
        this.face = face;
    }

    //flip: 동전의 면을 임의로 선택하기 위해 동전을 던진다
    public void flip() {
       face = (int)Math.random()*2+1;
    }
    //getFace: 동전의 현재 면을 정수로 반환한다
    public int getFace() {
        return face;
    }
    //toString: 동전의 현재 면을 문자열로 반환한다
    @Override
    public String toString() {
        return "Coin{" +
                "HEADS='" + HEADS + '\'' +
                ", TAILS='" + TAILS + '\'' +
                ", face=" + face +
                '}';
    }
}
