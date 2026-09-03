public class Inheritanceex {
    public static void main (String [] args){

        AdvCalc obj = new AdvCalc();
        int r1= obj.add(5, 6);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5, 7);
        int r4 = obj.div(10, 3);

        System.out.println("Add is:"+ r1 + "  Sub is: " + r2+ "  Multi is: "+ r3+ "  Div is: "+ r4);

    }
}
