import java.util.HashSet;
import java.util.Set;

/**
 * Задача 2 средняя:
 * Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
 */
public class Task2 {
    public static void main(String[] args) {
        String testString="Hello";
        Set<Character> charSet = new HashSet<>();
        for (char ch : testString.toCharArray()) {
            if (!charSet.add(Character.toLowerCase(ch))) {
                System.out.println(ch);
                break;
            }
        }

    }
}
