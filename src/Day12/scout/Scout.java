package Day12.scout;
/*
변수들
	name: 이름
	boxesSold: 판매한 과자 상자 수

메소드들
	생성자메소드: 걸스카우트 단원의 이름을 넘겨 받아 걸스카우트 단원 객체를 생성한다
	getName: 걸스카우트 단원의 이름을 반환한다
	updateSales: 판매한 과자 상자 수를 넘겨 받아 판매한 과자 상자 수를 변경한다
	toString: 객체 변수들의 값들을 반환한다
*/

public class Scout {
    private String name;                //	name: 이름
    private int boxesSold;              //	boxesSold: 판매한 과자 상자 수

    //	생성자메소드: 걸스카우트 단원의 이름을 넘겨 받아 걸스카우트 단원 객체를 생성한다
    public Scout(String name) {
        this.name = name;
    }

    //	updateSales: 판매한 과자 상자 수를 넘겨 받아 판매한 과자 상자 수를 변경한다
    public void updateSales(int boxesSold) {
        this.boxesSold += boxesSold;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Scout{" +
                "name='" + name + '\'' +
                ", boxesSold=" + boxesSold +
                '}';
    }
}
