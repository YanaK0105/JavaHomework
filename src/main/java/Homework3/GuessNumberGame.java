package Homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        game.startGame();
    }

    public void startGame() {
        Scanner scannerMinMax = new Scanner(System.in);
        System.out.println(" Введите начало диапазона: ");
        int minNumber = scannerMinMax.nextInt();
        //Scanner scannerMax = new Scanner(System.in);
        System.out.println(" Введите окончание диапазона: ");
        int maxNumber = scannerMinMax.nextInt();
        //количество жизней
        int maxLives = 10;

        Random random = new Random();
        int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        //проверка
        System.out.println(secretNumber);

        Scanner scanner = new Scanner(System.in);
        int lives = maxLives;

        while (lives > 0) {
            System.out.print("Введите число: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("esc")) {
                System.out.println("Игра завершена.");
                break;
            }

            int guessedNumber = Integer.parseInt(input);

            if (guessedNumber == secretNumber) {
                System.out.println("Вы угадали!");
                break;

            } else if (guessedNumber > secretNumber - 2 && guessedNumber < secretNumber + 2) {
                System.out.println("Вы находитесь рядом!");
            }
            else {
                System.out.println("Вы не рядом!");
            }

            lives--;

            if (lives == 0) {
                System.out.println("К сожалению, вы проиграли!");
                break;
            }
        }
    }
}


