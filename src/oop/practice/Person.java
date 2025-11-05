package oop.practice;

public class Person {

    private String name;
    private String dateOfBirth;
    private String aadhaarNumber;

    public Person(String name, String dateOfBirth, String aadhaarNumber){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
