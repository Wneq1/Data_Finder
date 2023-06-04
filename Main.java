import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
class Main {
  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
    
      LocalDate localDate1 = LocalDate.now();
      System.out.println("Obecna data: " + localDate1);
      System.out.println("Podaj date urodzenia w formacie rr-mm-dd: ");
     int year = scan.nextInt();
     int month = scan.nextInt();
     int day = scan.nextInt();
    
     LocalDate localDate2 = LocalDate.of(year, month, day);
     System.out.println(localDate2);

   Period period1 = Period.between(localDate1, localDate2);
  System.out.println("Obecnie masz:"+period1);
    
  }
}