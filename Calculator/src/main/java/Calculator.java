import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static double result;
    private static double a;
    private static double b;
    static char op;

    public Calculator(double a, double b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOp() {

        return op;
    }

    public void setOp(char op) {
        this.op = op;

    }

    public double getResult() {
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                throw new IllegalArgumentException("Error");
            } else {
                result = a / b;
            }
        }
        return result;
    }
}