public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2. Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Домашнее задание 2. Задача 2
        System.out.println("Домашнее задание 2. Задача 2");
        int minSum = arr[1];
        int maxSum = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                maxSum = arr[i];
            } else if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");


        // Домашнее задание 2. Задача 3
        System.out.println("Домашнее задание 2. Задача 3");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int averageValue = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        // Домашнее задание 2. Задача 4
        System.out.println("Домашнее задание 2. Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
            
        }
        }
    }


