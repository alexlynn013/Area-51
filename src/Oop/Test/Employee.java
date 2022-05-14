package Oop.Test;

public class Employee {

    int id;
    String name;
    Address address;

    Employee(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        address = ad;
    }
   void display(){

       System.out.println(id +" "+ name+" " + address.city+" " + address.state+" " + address.country);

    }

    public static void main(String[] args) {

        Employee employee = new Employee(34,"Lynn",new Address("South Dagon","Yangon", "Myanmar"));

        employee.display();

    }
}

//hasareleationship
// overloading
// overriding
