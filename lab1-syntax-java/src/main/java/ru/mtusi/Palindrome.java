package ru.mtusi;

/*
    Этот класс определяет является ли строка палиндромом или нет.

    Строка для проверки:
    java Palindrome.java "madam" "racecar" "apple" "kayak" "song" "noon"
 */

public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " is Palindrome.");
            } else {
                System.out.println(s + " is not Palindrome.");
            }
        }
    }

    // Переворачивает строку. Делает первый символ последним, второй - предпоследним и т.д.
    public static String reverseString(String s) {
        // Используем StringBuilder, чтоб не создавать каждый раз новую строку и рационально использовать память.
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = s.length() - 1; j >= 0; j--) {
            stringBuilder.append(s.charAt(j));
        }
        return stringBuilder.toString();
    }

    // Проверяет является ли строка палиндромом.
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

}
