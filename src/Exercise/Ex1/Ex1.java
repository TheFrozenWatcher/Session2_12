package Exercise.Ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Queue<String> newQueue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập danh sách các phần tử (cách nhau bằng dấu phẩy): ");
        String input = sc.nextLine();
        String[] inputArray = input.split(",");
        for (String element : inputArray) {
            newQueue.add(element.trim());
        }
        while (!newQueue.isEmpty()) {
            System.out.println(newQueue.poll());
        }
        sc.close();
    }
}
