import java.util.Scanner;
public class Comparing_class {
    public static void main(String[] arg){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int userNumber = sc.nextInt();
                int givenNumber = 10;
                boolean isGreater = givenNumber > userNumber;
                System.out.println("Is " + givenNumber + " greater than " + userNumber + "? " + isGreater);
            }

}
