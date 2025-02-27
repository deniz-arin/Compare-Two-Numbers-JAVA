import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        try (Scanner scanner = new Scanner(System.in)) {
            // Kullanıcıdan iki sayı ve bir işlem operatörü al
            System.out.print("Birinci sayıyı girin: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("İkinci sayıyı girin: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Bir işlem operatörü girin (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            double result = 0;
            boolean validOperator = true;
            
            // Girilen operatöre göre işlem yapma
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Bir sayı sıfıra bölünemez!");
                        validOperator = false;
                    }
                }
                default -> {
                    System.out.println("Geçersiz operatör girdiniz!");
                    validOperator = false;
                }
            }
            
            // Sonucu yazdır
            if (validOperator) {
                System.out.println("Sonuç: " + result);
            }
        }
    }
}
