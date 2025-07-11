package Challenge 5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        while(number!=0){
            System.out.println(number);
            number--;
        }

    }
}
