package mintoyears;
import java.util.Scanner;
public class Mintoyears {
    public static void main(String[] args) {
        int a,b,c,d,z ;
        System.out.println("Enter number of minutes to be converted ");
        Scanner s = new Scanner(System.in);
        z = s.nextInt();
        a = (365*24*60) ;
        b = (z/a) ;
        c = (z-(b*a)) ;
        d = ((365*c)/a) ;
        System.out.println("It is approximately "+ b + " Years and " + d + " Days") ;
    }
    
}
