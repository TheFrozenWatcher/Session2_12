package Exercise.Ex10;

import java.util.Stack;

public class Ex10 {
    public static void main(String[] args) {

        String inputExpression = "3 + 4 * 2 - 8 / 2";

        try {
            double result = evaluateExpression(inputExpression);
            System.out.println("Kết quả của biểu thức là: " + result);
        } catch (
                Exception e) {
            System.out.println("Lỗi trong quá trình tính toán: " + e.getMessage());
        }
    }

    private static double evaluateExpression(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Không đủ toán hạng cho toán tử " + token);
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 == 0) {
                            throw new ArithmeticException("Chia cho 0");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Toán tử không hợp lệ: " + token);
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Biểu thức không hợp lệ");
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
