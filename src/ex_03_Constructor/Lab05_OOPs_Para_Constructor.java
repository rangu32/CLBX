package ex_03_Constructor;

public class Lab05_OOPs_Para_Constructor {

    static void main(String[] args) {

    Car2 c1=new Car2();
    Car2 c2=new Car2();
        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3=new Car2("Tesla", "Model 3", 2015);

        System.out.println(c3.name);

        Car2 c4=new Car2("Mahindra", "Scorpio", 2020);

        System.out.println(c4.name);




    }



}

class Car2
{

    String name;
    String model;
    int year;



    Car2() {

        model="XXX";
        name="Unknown Car";
        year=1990;

    }

    // Parameterized Constructor
Car2(String name_oc_arg, String model_oc_arg, int year_oc_arg) {
        this.name=name_oc_arg;
        this.model=model_oc_arg;
        this.year=year_oc_arg;





}






}
