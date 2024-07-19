import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            String op = JOptionPane.showInputDialog(null, "Enter the operator (+, -, *, /) or type 'exit' to quit:");

            if (op == null || op.equals("exit")) {
                JOptionPane.showMessageDialog(null, "Exiting the calculator.");
                break;
            }

            String num1Str = JOptionPane.showInputDialog(null, "Enter number 1:");
            double num1 = Double.parseDouble(num1Str);

            String num2Str = JOptionPane.showInputDialog(null, "Enter number 2:");
            double num2 = Double.parseDouble(num2Str);

            double result = 0;
            boolean validOperation = true;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't divide by zero.");
                        validOperation = false;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid operation.");
                    validOperation = false;
            }

            if (validOperation) {
                JOptionPane.showMessageDialog(null, num1 + " " + op + " " + num2 + " = " + result);
            }
        }
    }
}
