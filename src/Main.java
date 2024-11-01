import java.util.HashSet;

/*
Написать метод, проверяющий что в слове все буквы уникальные (не повторяются).
Строка состоит только из букв, без пробелов. При решении использовать HashSet.
public static boolean isUnique (String word)
Hello -> false
World -> true
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique("Привітусімпрограмістам!!")); // false
        System.out.println(areAllCharactersUnique("Привіт")); // true
    }
    //метод для перевірки чи всі символи у слові унікальні
    private static boolean areAllCharactersUnique(String world) {
        //перевірка на нал або пусте значення
        if (world == null || world.isEmpty()) {
            return true;
        }
        // Створюємо HashSet для зберігання унікальних символів
        HashSet<Character> characterSet = new HashSet<>();
        // Проходимо по кожному символу в слові
        for (char c : world.toCharArray()) {
            if (characterSet.contains(c)) {
                return false;
            }
            // Додаємо символ у множину
            characterSet.add(c);
        }
        return true;
    }
}