
import java.util.*;

 public class Calculator {
        public void Calci() {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            // nextDouble() reads the next double from the keyboard
            double first = reader.nextDouble();
            double second = reader.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.println("Error! operator is not correct");
                    return;
            }
            System.out.println(first + " " + operator + " " + second + " = " + result);
        }

 }


