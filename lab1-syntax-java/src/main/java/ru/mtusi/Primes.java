package ru.mtusi;

/*
Этот класс выводит простые числа от 2 до 100.
 */

public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            // Проверка на простое число.
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Этот метод отвечает является ли чисто простым.
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
