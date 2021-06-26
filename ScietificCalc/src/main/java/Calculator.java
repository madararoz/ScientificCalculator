import java.util.Scanner;

public class Calculator {

Scanner scanner = new Scanner(System.in);

       public double getNum1() {
            System.out.println("Please enter the first number - x :");
            return scanner.nextDouble();
        }

        public double getNum2() {
            System.out.println("Please enter the second number - y:");
            return scanner.nextDouble();
        }

        public double getDegree() {
            System.out.println("Please enter degrees:");
            return scanner.nextDouble(); }

        public double getValue() {
            System.out.println("Please enter value:");
            return scanner.nextDouble(); }

        public static void printGreeting() {
            System.out.println();
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("+ Scientific calculator  +");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println();
        }

        public static void printOptions() {
            System.out.println("===================================");
            System.out.println("Please choose one of the following operations: ");
            System.out.println("+ - addition");
            System.out.println("- - subtraction");
            System.out.println("/ - division");
            System.out.println("* - multiplication");
            System.out.println("sin - sin");
            System.out.println("cos - cosine");
            System.out.println("tng - tangent");
            System.out.println("cot - cotangent");
            System.out.println("log - log10(x)");
            System.out.println("ln - loge(x)");
            System.out.println("pow - x^y");
            System.out.println("sqr - square root(x)");
            System.out.println("exp - exponential");
            System.out.println("=================================");
        }


        void add(double num1, double num2) {
            num1 = getNum1();
            num2 = getNum2();
            double result = num1 + num2;
            System.out.println( num1 + " + " + num2 + " = " + result);
        }


        void subtract(double num1, double num2) {
            num1 = getNum1();
            num2 = getNum2();
            double result = num1 - num2;
            System.out.println(num1 + " + " + num2 + " = " + result);

        }

        void divide(double num1, double num2) {
            num1 = getNum1();
            num2 = getNum2();
            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result); }


        void multiply(double num1, double num2) {
            num1 = getNum1();
            num2 = getNum2();
            double result = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + result);}



        void cos(double degree) {
            degree = getDegree();
            double result = Math.cos(Math.toRadians(degree));
            System.out.println("Cosine from " + degree + " is " + result);
        }
        void sin(double degree) {
            degree = getDegree();
            double result = Math.sin(Math.toRadians(degree));
            System.out.println("Sinus from " + degree + " is " + result);
        }

        void tan(double degree) {
            degree = getDegree();
            double result = Math.tan(Math.toRadians(degree));
            System.out.println("Tangent from " + degree + " is " + result);
        }

        void cot(double degree) {
            degree = getDegree();
            double result = 1/Math.tan(Math.toRadians(degree));
            System.out.println("Cotangent from " + degree + " is " + result);
        }


        void log(double value) {
            value = getValue();
            double result = Math.log10(value);
            System.out.println("Log(10) from " + value + " is " + result);
        }

        void ln(double value) {
            value = getNum1();
            double result = Math.log(value);
            System.out.println("Log(e) from " + value + " is " + result);
        }

        void pow(double num1, double num2) {
            num1 = getNum1();
            num2 = getNum2();
            double result = Math.pow(num1,num2);
            System.out.println( num1 + "^" + num2 + " = " + result);
        }

        void sqr(double value) {
            value = getValue();
            double result = Math.sqrt(value);
            System.out.println("Squarerooot from " + value + " is " + result);
        }

        void exp(double value) {
            value = getValue();
            double result = Math.getExponent(value);
            System.out.println("Exponent from " + value + " is " + result);
        }







    }


