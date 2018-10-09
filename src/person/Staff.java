package person;

public class Staff extends Person {
    private String school;
    private double pay = 20000;

    public Staff(){}

    public Staff(String school, double pay){
        this.school =school;
        this.pay = pay;
    }

    public Staff(String school, double pay, String name, String address){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return this.school;
    }

    public double getPay(){
        return this.pay;
    }

    public void setSchool(String school){
        this.school =school;
    }

    public void setPay(double pay){
        this.pay =pay;
    }

    @Override
    public String toString(){
        return "A staff has a school: " + getSchool() + " and pay: " + getPay() + super.toString();
    }
}
