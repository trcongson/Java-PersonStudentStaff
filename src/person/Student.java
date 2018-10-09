package person;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(){}

    public Student(String program, int year,double fee){
        this.program =program;
        this.year =year;
        this.fee = fee;
    }

    public Student(String program, int year, double fee, String name, String address){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }

    public int getYear(){
        return this.year;
    }

    public double getFee(){
        return this.fee;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setFee(double fee){
        this.fee =fee;
    }

    @Override
    public String toString(){
        return "A student has a program " + getProgram() + getYear() + " and fee: " + getFee() + super.toString();
    }
}
