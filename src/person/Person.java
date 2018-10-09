package person;

public class Person {
    private String name;
    private String address;

    public Person(){}

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void  setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "A person has name =" + getName() + " and address =" + getAddress();
    }
}
