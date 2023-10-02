class ExNo2 {
    String name;
    
    ExNo2(){
        System.out.print("Constructor called: ");
        name = "Program OOP";
        
    }
    public static void main(String[] args){
        
        ExNo2 obj = new ExNo2();
        
        System.out.println("The name is: " + obj.name);
    }
}