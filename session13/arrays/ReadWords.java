package ro.siit.session13.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadWords {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many words?");
        int wordsCount = keyboard.nextInt();
        String words [] = new String[wordsCount];
        for (int i = 0; i < words.length ; i++) {
            System.out.println("Word number " + i + "?");
            words[i] = keyboard.next();
        }

        Arrays.stream(words)
                .sorted()
                .forEach((word) -> System.out.print(word + " "));

//        Arrays.sort(words);
//        for (String word: words) {
//            System.out.print(word + " ");
//        }
    }
}
