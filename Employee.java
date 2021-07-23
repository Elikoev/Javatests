package Javatests;

public class Employee {


    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private byte age;


    public Employee(String fullName, String position, String email, String phoneNumber, int salary, byte age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void doPrintEmployee (){
        System.out.printf (String.format("\t Employee name : [%s] %n" +
                "\t Employee position : [%s] %n" +
                "\t Employee email : [%s] %n" +
                "\t Employee phone number : [%s] %n" +
                "\t Employee salary : [%s] %n" +
                "\t Employee age : [%s] %n" +
                        "\t =================================\n",fullName,position,email,phoneNumber,
                salary,age));

    }

}

