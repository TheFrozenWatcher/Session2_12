package Exercise.Ex14;

import java.util.Stack;

public class Ex14 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Bước 2 và 3: Hàm kiểm tra chuỗi số nguyên tố
    public static boolean isPrimeSequence(String inputStr) {
        Stack<Character> stack = new Stack<>();

        // Bước 2: Duyệt qua từng ký tự trong chuỗi
        for (char c : inputStr.toCharArray()) {
            // Kiểm tra xem ký tự có phải là số hay không
            if (Character.isDigit(c)) {
                stack.push(c);
            }
        }

        // Bước 3: Kiểm tra số nguyên tố
        while (!stack.isEmpty()) {
            // Lấy từng ký tự từ stack và chuyển thành số nguyên
            int num = Character.getNumericValue(stack.pop());

            // Kiểm tra số nguyên tố
            if (!isPrime(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Kiểm tra
        String inputSequence = "2357"; // Đổi chuỗi này để kiểm tra các trường hợp khác
        boolean result = isPrimeSequence(inputSequence);

        if (result) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }
    }

}
