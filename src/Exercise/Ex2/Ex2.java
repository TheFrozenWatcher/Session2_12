package Exercise.Ex2;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static boolean checkParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Nếu stack rỗng, không có dấu ngoặc mở tương ứng
                if (stack.isEmpty()) {
                    return false;
                }
                // Lấy phần tử trên cùng của stack
                char top = stack.pop();

                // Kiểm tra tính đúng đắn của cặp dấu ngoặc
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Nếu stack không rỗng, vẫn còn dấu ngoặc mở không đóng
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String input = sc.nextLine();

        // Kiểm tra và in kết quả
        if (checkParenthesis(input)) {
            System.out.println("Chuỗi ngoặc đúng.");
        } else {
            System.out.println("Chuỗi ngoặc không đúng.");
        }
    }

}


