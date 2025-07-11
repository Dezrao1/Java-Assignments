package Challenge 4;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are a child! Cannot receive an ID");
        }
        else if(age>120 || age<=0) {
            System.out.println("Invalid age! Please try again");
        }

        else{
            System.out.println("You are an adult!");
        }

    }
}
