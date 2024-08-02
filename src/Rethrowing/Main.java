package Rethrowing;

public class Main {

    public int performDivision(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0)
            throw new ArithmeticException("Denominator can not be 0");

        return numerator / denominator;

    }


    public int calculate(int numerator, int denominator) throws ArithmeticException {
        return performDivision(numerator, denominator);
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            int calculate = main.calculate(12, 0);
            System.out.println(calculate);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
