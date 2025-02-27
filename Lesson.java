import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı al
        try (Scanner scanner = new Scanner(System.in)) {
            // Kullanıcıdan iki sayı al
            System.out.print("Birinci sayıyı girin: ");
            int num1 = scanner.nextInt();
            
            System.out.print("İkinci sayıyı girin: ");
            int num2 = scanner.nextInt();
            
            // Büyük sayıyı bulma
            if (num1 > num2) {
                System.out.println("Birinci sayı (" + num1 + ") daha büyüktür.");
            } else if (num2 > num1) {
                System.out.println("İkinci sayı (" + num2 + ") daha büyüktür.");
            } else {
                System.out.println("Her iki sayı eşittir.");
            }
        }
    }
}
