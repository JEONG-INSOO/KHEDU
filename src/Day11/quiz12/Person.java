package Day11.quiz12;

public class Person {
    /*
1.	Person 클래스 설계
 변수들
	lastName: 성
	firstName: 이름

메소드들
	getLastName: 성을 반환한다
	getFirstName: 이름을 반환한다
	getLength: 성과 이름 안에 포함된 문자들의 총 수를 반환한다

*/

    private String lastName;            //성
    private String firstName;           //이름

    public Person() {
        super();
    }

    public Person(String lastName, String firstName) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {       //성을 반환한다
        return lastName;
    }
    public String getFirstName() {      //이름을 반환한다.
        return firstName;
    }

    public int getLength() {
        int lenOfFirstName = getFirstName().length();
        int lenOfLastName = getLastName().length();

        return lenOfFirstName + lenOfLastName;
    }


}
