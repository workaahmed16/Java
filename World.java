class Cat {

    public String[] names;
    private int age;

    Cat(){
        
    }
    
    Cat(String[] names, int age){
        this.names = names;
        this.age = age;
    }

    }

class World {
    public static void main(String[] args){
       Cat cat = new Cat(); 
       System.out.println("output: " + cat.age);
    }
}
