package Exercise.Ex8;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex8 {
    public static TreeMap<String, Integer> countWords(String text){
        TreeMap<String,Integer> wordCountMap=new TreeMap<>();
        String[] words=text.split("\\s+");
        for (String word:words){
            word=word.toLowerCase();
            if (!word.isEmpty()){
                wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
            }
        }
        return wordCountMap;
    }
    private static void displayWordCount(TreeMap<String, Integer> wordCountMap) {
        for (var entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập văn bản:");
        String inputText = scanner.nextLine();

        TreeMap<String, Integer> wordCountMap = countWords(inputText);

        System.out.println("Kết quả:");
        displayWordCount(wordCountMap);
    }

}
