package Exercise.Ex15;

import java.util.Stack;

public class Ex15 {
    public static String decimalToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binaryResult = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryResult.append(stack.pop());
        }

        return binaryResult.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 111; // Đổi số này để kiểm tra các giá trị khác nhau
        String binaryResult = decimalToBinary(decimalNumber);

        System.out.println("Chuyển đổi từ hệ thập phân sang hệ nhị phân:");
        System.out.println(decimalNumber + " = " + binaryResult + "B");
    }
}
