package person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Steven Jobs","Apple");
        System.out.println(person.toString());
        Student student = new Student("Java",2018,11000,"Storm","Mỹ Đình");
        System.out.println(student.toString());
        Staff staff = new Staff("CodeGym",20000,"Bill","Cầu Giấy");
        System.out.println(staff.toString());
    }
}
