package oop.practice;

public class Employee extends Person {

    private int employeeId;
    private String address;

    public Employee(int employeeId, String name, String address, String dateOfBirth, String aadhaarNumber){
        //superClassConstructor()
        super(name,dateOfBirth,aadhaarNumber);
        this.employeeId = employeeId;
        this.address = address;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
