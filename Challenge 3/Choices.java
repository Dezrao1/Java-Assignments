package Challenge 3;

import java.util.Scanner;

public class Choices {
    public static void main(String[] args) {

       System.out.println("Enter the day of the week: ");
       Scanner sc = new Scanner(System.in);
       String day = sc.nextLine();


      switch (day) {
              case "Sunday":
              System.out.println("Church day (:");
              break;
              case "Monday":
              System.out.println("Monday is here ):");
              break;
              case "Tuesday":
              System.out.println("Why is the week going so slow");
              break;
              case "Wednesday":
              System.out.println("Mid-week!");
              break;
              case "Thursday":
              System.out.println("Almost Friday!!");
              break;
              case "Friday":
              System.out.println("Friday is here ):");
              break;
              case "Saturday":
              System.out.println("Finally the weekend!! (:");
              break;
              default:
              System.out.println("Invalid day!");
              break;
      }
    }
}
