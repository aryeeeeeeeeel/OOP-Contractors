class Company{
//A.
String name;

public Company(){
    name = "Programiz";
    
    }
}

class Main{
    public static void main(String[] args){
        
        Company obj = new Company();
        System.out.println("Comapany name = " + obj.name);
    }
}