public abstract class Streample {
    public static void main (String [] args){
        // String s = "Nikita";
        // s = s +" Patil";
        // System.out.println(s);
        StringBuffer sb = new StringBuffer("Nikita");
        sb.append("Patil");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.deleteCharAt(2);
        sb.insert(0,"Java");
        System.out.println(sb);
        

    }
}
