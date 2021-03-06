package basic_of_software_code_development;

// Даны два числа.Определить цифры,входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Cycles_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the  first number ");
        int firstNumber = sc.nextInt();
        while (firstNumber != 0) {
            arr[firstNumber % 10]++;
            firstNumber /= 10;
        }
        System.out.println("Enter the  second number: ");
        int secondNumber = sc.nextInt();
        while (secondNumber != 0) {
            if (arr[secondNumber % 10] != 0) {
                System.out.println("The digit is: " + (secondNumber % 10));
            }
            secondNumber /= 10;
        }
    }
}
