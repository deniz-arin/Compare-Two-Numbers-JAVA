import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {
        // Ay isimlerini içeren string
        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";

        int monthNumber;
        try ( // Kullanıcıdan giriş al
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number (1-12): ");
            monthNumber = scanner.nextInt();
        }

        // Geçerli bir giriş olup olmadığını kontrol et
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid input! Please enter a number between 1 and 12.");
            return;
        }

        // Her ay ismi 9 karakter uzunluğunda yerleştirildi (boşluklar dahil)
        int startIndex = (monthNumber - 1) * 9;
        String monthName = months.substring(startIndex, startIndex + 9).trim(); // Boşlukları temizle

        // Sonucu ekrana yazdır
        System.out.println("Month: " + monthName);
    
    }
}
