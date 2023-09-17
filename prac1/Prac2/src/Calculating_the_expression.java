import java.util.Scanner;
public class Calculating_the_expression {
        public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of v: ");
        double v = sc.nextDouble();
        System.out.print("Enter the value of u: ");
        double u = sc.nextDouble();
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of s: ");
        double s = sc.nextDouble();
        double result = (v*v - u*u)/(2*a*s);
        System.out.println("(v^2 - u^2)/2as = " + result);
    }
}
