class JavaParametizedConstructor {
    
    String languages;
    
    JavaParametizedConstructor (String lang){
        languages = lang;
        System.out.println(languages + " Programming Language");
    }
    public static void main(String[] args){
        JavaParametizedConstructor obj1 = new JavaParametizedConstructor ("Java");
        JavaParametizedConstructor obj2 = new JavaParametizedConstructor ("Python");
        JavaParametizedConstructor obj3 = new JavaParametizedConstructor ("C");
    }
}