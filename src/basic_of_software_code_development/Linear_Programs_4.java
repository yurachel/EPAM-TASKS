package basic_of_software_code_development;

/* Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях)
Поменять местами дробную и целую части числа и вывести полученное значение числа. */

public class Linear_Programs_4 {

    public static void main(String[] args) {
        double number = 768.254;
        double reverseNumber = (number * 1000) % 1000 + (int) number / 1000.0;
        System.out.println("Our answer is: " + reverseNumber);
    }
}
