package oop.practice;

public class Client{

    public static void main(String[] args){
//        Person snehal = new Person("Snehal","15-05-1997","5339 4347 0678");
//        Person ruturaj = new Person("Ruturaj","25-11-1997","6356 6236 6352");
//
////        System.out.println(snehal.getName());
//
//        Person[] people = new Person[2];
//        people[0] = snehal;
//        people[1] = ruturaj;
//
//        System.out.println(people[1].getName());

        Payment payment = new Icici();
        payment.checkBalance("12345");
    }

}
/**
people = [0 = Person{snehal},
        1= Person{ruturaj}]

ruturaj.name = people[1].name
 **/
