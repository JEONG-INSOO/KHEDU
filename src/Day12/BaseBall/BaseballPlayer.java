package Day12.BaseBall;
/*
변수들
	name: 야구선수의 이름
	position: 야구선수의 위치
	numHits: 야구선수의 안타수
	numWalks: 야구선수의 4구수

메소드들
	생성자메소드: 야구선수의 이름을 넘겨 받아 객체를 생성한다
	getName: 야구선수의 이름을 반환한다
	getPosition: 야구선수의 위치를 반환한다
	getNumHits: 야구선수의 안타수를 반환한다
	getNumWalks: 야구선수의 4구수를 반환한다
	setName: 야구선수의 이름을 주어진 값으로 변경한다
	setPosition: 야구선수의 위치를 주어진 값으로 변경한다
	setNumHits: 야구선수의 안타수를 주어진 값으로 변경한다
	setNumWalks: 야구선수의 4구수를 주어진 값으로 변경한다

*/

public class BaseballPlayer {
    //	getName: 야구선수의 이름을 반환한다
    public String getName() {
        return name;
    }
    //	setName: 야구선수의 이름을 주어진 값으로 변경한다
    public void setName(String name) {
        this.name = name;
    }
    //	getPosition: 야구선수의 위치를 반환한다
    public String getPosition() {
        return position;
    }
    //	setPosition: 야구선수의 위치를 주어진 값으로 변경한다
    public void setPosition(String position) {
        this.position = position;
    }
    //	getNumHits: 야구선수의 안타수를 반환한다
    public int getNumHits() {
        return numHits;
    }
    //	setNumHits: 야구선수의 안타수를 주어진 값으로 변경한다
    public void setNumHits(int numHits) {
        this.numHits = numHits;
    }
    //	getNumWalks: 야구선수의 4구수를 반환한다
    public int getNumWalks() {
        return numWalks;
    }
    //	setNumWalks: 야구선수의 4구수를 주어진 값으로 변경한다
    public void setNumWalks(int numWalks) {
        this.numWalks = numWalks;
    }

    private String name;            //	name: 야구선수의 이름
    private String position;        //	position: 야구선수의 위치
    private int numHits;            //	numHits: 야구선수의 안타수
    private int numWalks;           //	numWalks: 야구선수의 4구수

    //	생성자메소드: 야구선수의 이름을 넘겨 받아 객체를 생성한다
    public BaseballPlayer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", numHits=" + numHits +
                ", numWalks=" + numWalks +
                '}';
    }
}
