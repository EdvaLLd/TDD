package se.edvard.lektion1;

public class CalculatorService {

    public double add(double a, double b) {
        return a+b;
    }

    public double subtract(double a, double b) {
        return Math.round((a-b)*1000.0)/1000.0;
    }

    public double divide(double a, double b) {
        if(b == 0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }
}
