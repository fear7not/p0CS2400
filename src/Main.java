/* Simon Nasser
Final Exam long programming question 5/19
5/19 */
import java.util.Scanner;
public class Main {
    public static void main (String args[]) //2
    {
        Scanner sc = new Scanner(System.in);
        instructions();
        double num1 = sc.nextDouble(); double num2 = sc.nextDouble();
        Calculator c = new Calculator(); System.out.println(c.getValue());
        c.add(num1); System.out.println(c.getValue());
        c.multiply(3); System.out.println(c.getValue());
        c.subtract(num2); System.out.println(c.getValue());
        c.divide(2); System.out.println(c.getValue());
        c.clear(); System.out.print(c.getValue());
    }
    private static void instructions() {
        System.out.println("Given two double input values num1 and num2, the program outputs the following values:\n" +
                "1.\tThe initial value of the instance field, value\n" +
                "2.\tThe value after adding num1\n" +
                "3.\tThe value after multiplying by 3\n" +
                "4.\tThe value after subtracting num2\n" +
                "5.\tThe value after dividing by 2\n" +
                "6.\tThe value after calling the clear() method\n" +
                "Ex: If the input is:\n" +
                "10.0 5.0\n" +
                "the output is:\n" +
                "0.0\n" +
                "10.0\n" +
                "30.0\n" +
                "25.0\n" +
                "12.5\n" +
                "0.0");
    }
}
