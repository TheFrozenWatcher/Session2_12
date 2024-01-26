package Exercise.Ex6;

import java.util.Stack;

public class Ex6 {
    public static boolean checkBrackets(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (char symbol : expression.toCharArray()) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bracketStack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (bracketStack.isEmpty()) {
                    return false; // Dấu đóng mà không có dấu mở tương ứng
                }

                char leftBracket = bracketStack.pop();

                if ((leftBracket == '(' && symbol != ')') ||
                        (leftBracket == '[' && symbol != ']') ||
                        (leftBracket == '{' && symbol != '}')) {
                    return false; // Dấu mở và đóng không khớp
                }
            }
        }

        return bracketStack.isEmpty(); // Nếu bracketStack rỗng, biểu thức hợp lệ
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s – a) * s – b) * (s – c)";
        String expression4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(checkBrackets(expression1)); // Kết quả: true
        System.out.println(checkBrackets(expression2)); // Kết quả: true
        System.out.println(checkBrackets(expression3)); // Kết quả: false
        System.out.println(checkBrackets(expression4)); // Kết quả: false
    }
}
