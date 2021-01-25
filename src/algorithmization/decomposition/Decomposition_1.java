package algorithmization.decomposition;

/* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
кратного двух натуральных чисел.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(reader.readLine());
        System.out.println("The nod is: " + nod(firstNumber, secondNumber));
    }


    static int nod(int firstNumber, int secondNumber) {
        int nod = 0;
        int biggest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        int count = biggest;
        while (count > 0) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                nod = count;
                break;
            } else {
                count--;
            }
        }
        return nod;
    }
}
