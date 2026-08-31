package ex_03_Constructor;

public class Lab01_OOPs_Constructor {
    static void main(String[] args) {
        Baby b1=new Baby();
        new Baby();
        Baby b2;



    }

}

class Baby {
// Attribute / Instance variable / Member variables, Data variables
String name;


// Behaviour


    void cry(){
        System.out.println("Cry!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    Baby(){

        System.out.println("This is called Default contructor");

        // Fetch the data from SQL database
        // Read from csv file, XLSX
        // Open a file and read the data (json, testData.XLSX, txt file)


    }



}





