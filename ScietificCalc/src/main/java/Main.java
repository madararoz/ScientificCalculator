import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    while (true) {

                Calculator calculator = new Calculator();
                Calculator.printGreeting();

                double num1 = 0;
                double num2 = 0;
                double value = 0;
                double degree = 0;
                String option;


                Scanner scanner = new Scanner(System.in);
                Calculator.printOptions();
                option = scanner.next();

                switch (option) {
                    case "+":
                        calculator.add(num1, num2);
                        break;
                    case "-":
                        calculator.subtract(num1, num2);
                        break;
                    case "/":
                        calculator.divide(num1, num2);
                        break;
                    case "*":
                        calculator.multiply(num1, num2);
                        break;
                    case "sin":
                        calculator.sin(degree);
                        break;
                    case "cos":
                        calculator.cos(degree);
                        break;
                    case "tan":
                        calculator.tan(degree);
                    case "cot":
                        calculator.cot(num1);
                        break;
                    case "log":
                        calculator.log(value);
                    case "ln":
                        calculator.ln(value);
                    case "pow":
                        calculator.pow(num1, num2);
                    case "sqr":
                        calculator.sqr(value);
                        break;
                    case "exp":
                        calculator.exp(value);
                        break;
                    default:
                        System.out.println("Invalid input. Try again.");
                        break;
                }


                System.out.println("For new calculations press 1, to Exit press 0");
                int playAgainOption;
                playAgainOption = scanner.nextInt();
                if (playAgainOption == 0) {
                    break;}
            }


        }



    }

