import java.util.Scanner;
public class Encrypt_grade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the grade to be encrypted: ");
            char grade = sc.next().charAt(0);
            char encryptedGrade = (char) (grade + 8);
            System.out.println("Encrypted grade: " + encryptedGrade);
            char decryptedGrade = (char) (encryptedGrade - 8);
            System.out.println("Decrypted grade: " + decryptedGrade);
        }
}
