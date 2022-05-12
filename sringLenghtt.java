import java.util.*;

import javax.print.event.PrintJobListener;
public class sringLenghtt {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name = s.next();
        System.out.println("welcom" + name);
        int l=name.length();

        System.out.println("charecters in your name is ="+ name.length());

        System.out.println("your name in Lower case= "+ name.toLowerCase());
        System.out.println("your name in uper case = "+ name.toUpperCase());
    
    }
    
}