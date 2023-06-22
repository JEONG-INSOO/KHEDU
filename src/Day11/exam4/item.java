package Day11.exam4;
/*
4.	Item 클래스 설계
 변수들
	name: 상품의 이름
	price: 상품의 가격
	quantity: 상품의 수량

메소드들
	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Item 객체를 생성한다
	toString: 상품의 현 상태를 반환한다
	getPrice: 상품의 가격을 반환한다
	getName: 상품의 이름을 반환한다
	getQuantity: 상품의 수량을 반환한다
	setPrice: 상품의 가격을 주어진 값으로 변경한다
	setName: 상품의 이름을 주어진 값으로 변경한다
	setQuantity: 상품의 수량을 주어진 값으로 변경한다

*/

public class item {
    private String name;            //	name: 상품의 이름
    private int price;              //	price: 상품의 가격
    private int quantity;           //	quantity: 상품의 수량
    //	toString: 상품의 현 상태를 반환한다
    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    //	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Item 객체를 생성한다
    public item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //	getName: 상품의 이름을 반환한다
    public String getName() {
        return name;
    }
    //	setName: 상품의 이름을 주어진 값으로 변경한다
    public void setName(String name) {
        this.name = name;
    }
    //	getPrice: 상품의 가격을 반환한다
    public int getPrice() {
        return price;
    }
    //	setPrice: 상품의 가격을 주어진 값으로 변경한다
    public void setPrice(int price) {
        this.price = price;
    }
    //	getQuantity: 상품의 수량을 반환한다
    public int getQuantity() {
        return quantity;
    }
    //	setQuantity: 상품의 수량을 주어진 값으로 변경한다
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
