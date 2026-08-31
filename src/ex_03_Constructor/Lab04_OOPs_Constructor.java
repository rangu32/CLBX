package ex_03_Constructor;

public class Lab04_OOPs_Constructor {

    static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println("-------------------");
        Car c2=new Car();

        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

    }

}



class Car{
    String name;
    String model;
    int year;

    //DC

    Car(){
        name= "Tesla";
        model="XXX";
        year=1991;



    }



}