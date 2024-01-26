package Exercise.Ex4;

import java.util.Scanner;
import java.util.Stack;

public class Ex4 {
    public static void main(String[] args) {
        Stack newStack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng từ");
        int numberOfWords=sc.nextInt();
        printReverseStack(newStack,numberOfWords);

    }
    public static void printReverseStack(Stack stack, int num){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<num;i++){
            System.out.println("Nhập từ thứ "+(i+1)+":");
            String word=sc.nextLine();
            stack.push(word);
        }
        for (int i=num-1;i>=0;i--){
            System.out.println("Từ thứ "+(num-i)+": "+stack.remove(i));
        }


    }

}
