public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] numbers3 = {8, 5, 9, 65, 3};
        // Домашнее задание 1. Задача 2
        System.out.println("Домашнее задание 1. Задача 2");
        int[] numbers4 = new int[3];
        numbers4[0] = 1;
        numbers4[1] = 2;
        numbers4[2] = 3;
        double[] numbers5 = {1.57, 7.654, 9.986};
        int[] numbers6 = {8, 5, 9, 65, 3};
        System.out.println(numbers4[0] + "," + numbers4[1] + "," + numbers4[2]);
        System.out.println(+numbers5[0] + "," + numbers5[1] + "," + numbers5[2]);
        System.out.println(+numbers6[0] + "," + numbers6[1] + "," + numbers6[2] + "," + numbers6[3] + "," + numbers6[4]);
        // Домашнее задание 1. Задача 3
        System.out.println("Домашнее задание 1. Задача 3");
        System.out.println(numbers4[2] + "," + numbers4[1] + "," + numbers4[0]);
        System.out.println(+numbers5[2] + "," + numbers5[1] + "," + numbers5[0]);
        System.out.println(+numbers6[4] + "," + numbers6[3] + "," + numbers6[2] + "," + numbers6[1] + "," + numbers6[0]);
        // Домашнее задание 1. Задача 4
        System.out.println("Домашнее задание 1. Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
            System.out.println(numbers[i]);
        }
    }
}