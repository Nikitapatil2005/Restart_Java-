class Human{

    private int age ;
    private  String name ;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class EncapsulationDemo{
    
    public static void main (String [] args){

        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Nikita");
        System.out.println("Name is : "+obj.getName());
        System.out.println("Age is : "+obj.getAge());
    }
}
