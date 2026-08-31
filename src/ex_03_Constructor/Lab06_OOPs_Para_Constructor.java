package ex_03_Constructor;

public class Lab06_OOPs_Para_Constructor {

    static void main(String[] args) {
        Person p1=new Person("Amit", 123456890,"Chennai");
        Person p2=new Person("Raj",987654321,"Delhi");
        Person p3=new Person();

        p3.name="Shika";
        System.out.println(p3.name);

        Person p4=new Person("Lucky", 987614321);

        System.out.println(p4.address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();

    }
}
    class  Person{

        String name;
        long phone;
        String address;


        Person(){

        }


        Person(String name_arg, long phone_arg, String address_arg){

        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;

        }

        Person(String name_arg, long phone_arg) {
            this.name=name_arg;
            this.phone=phone_arg;
        }

        void eat(){
            System.out.println(this.name + " is eating!");
        }



    }



