package Day11.exam2;
/*
2.	CD 클래스 설계
변수들
	title: 		제목
	artist:		연주자
	cost:		구입가격

메소드들
	생성자 메소드: 제목, 연주자와 구입가격을 주어진 값으로 초기화하면서 새로운 CD 객체를 생성한다
	setTitle: CD의 제목을 주어진 값으로 변경한다
	setArtist: CD의 연주자를 주어진 값으로 변경한다
	setCost: CD의 구입 가격을 주어진 값으로 변경한다
	getTitle: CD의 제목을 반환한다
	getArtist: CD의 연주자를 반환한다
	getCost: CD의 구입 가격을 반환한다
	toString: 현 CD 객체의 상태를 문자열로 반환한다

*/
public class CD {
    private String title;           //	title: 		제목
    private String artist;          //	artist:		연주자
    private int cost;               //	cost:		구입가격
    //	생성자 메소드: 제목, 연주자와 구입가격을 주어진 값으로 초기화하면서 새로운 CD 객체를 생성한다
    public CD(String title, String artist, int cost) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
    }
    //	getTitle: CD의 제목을 반환한다
    public String getTitle() {
        return title;
    }
    //	setTitle: CD의 제목을 주어진 값으로 변경한다
    public void setTitle(String title) {
        this.title = title;
    }
    //	getArtist: CD의 연주자를 반환한다
    public String getArtist() {
        return artist;
    }
    //	setArtist: CD의 연주자를 주어진 값으로 변경한다
    public void setArtist(String artist) {
        this.artist = artist;
    }
    //	getCost: CD의 구입 가격을 반환한다
    public int getCost() {
        return cost;
    }
    //	setCost: CD의 구입 가격을 주어진 값으로 변경한다
    public void setCost(int cost) {
        if ( cost < 0 ) return;
        this.cost = cost;
    }
    //	toString: 현 CD 객체의 상태를 문자열로 반환한다
    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", cost=" + cost +
                '}';
    }
}
