package person;

public class Person {
    private  String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return getName()+" có địa chỉ tại "+getAddress();
    }
}
