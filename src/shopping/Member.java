package shopping;

public class Member {
    private String name; //고객명
    private int age; //나이
    private String address; //주소


    public Member() {};

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
