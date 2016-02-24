package nhnnext.org.gingeraebi.firstapp;

/**
 * Created by JaeWon on 2016-02-18.
 */
public class Person {
    private int age;
    private String address;
    private String name;
    private String phoneNum;

    public Person(int age, String address, String name, String phoneNum) {
        this.age = age;
        this.address = address;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
