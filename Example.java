class Computer
{
    public void playmusic(){
     System.out.println("Music is Playing");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10){
            return "pen";
        }
        else{
            return "Nothing";
        }
    }
}




public class Example {
    public static void main(String[] args) {
        Computer obj1 = new Computer();
        obj1.playmusic();
        String str = obj1.getMeAPen(10);
        System.out.println(str);
    }
}
