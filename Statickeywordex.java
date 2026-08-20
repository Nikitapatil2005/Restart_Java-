class Mobile {

    String brand ;
    int price ;
    static String name;

    public void show ()
    {
    System.out.println(brand + ":" + price +":"+name);
   }
   
}


public class Statickeywordex {
    public static void main (String args []){

        Mobile obj = new Mobile();
        obj.brand = "Realme";
        obj.price = 100000;
        Mobile.name = "Phone";
        

    
    }
}
