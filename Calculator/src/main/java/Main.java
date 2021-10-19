import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator(5,6,'*');
        calculator.setA(console.nextDouble());
        calculator.setB(console.nextDouble());
        System.out.println("\nEnter an operator (+, -, *, /): ");
        calculator.setOp(console.next().charAt(0));
        System.out.println("Final");
        System.out.println(calculator.getResult());
    }
}