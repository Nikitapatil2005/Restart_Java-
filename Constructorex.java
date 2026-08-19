class Human {
private int age ;
private String name ;

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

public class Constructorex
{
    public static void main (String [] args)
    {
        Human obj = new Human ();
       // Human obj1 = new Human (21 , " Niks"); 
       // obj.setAge(21);
        //obj.setName("Nikita");
        System.out.println("Name is : "+ obj.getName() + ", Age is : "+ obj.getAge());
       //System.out.println("Name :" + obj1.getName()+ "  Age is " + obj1.getAge());

    }
}