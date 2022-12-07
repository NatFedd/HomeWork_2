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
    // Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2. Задача 2");
        int minSum = 100_000;
        int maxSum = minSum + 100_000;
            //if (int i = 0; i < arr.length - 1 && arr[i + 1] != 0; i++);
            //if (i = minSum; i < maxSum; minSum++);
            {
            }
            System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

        }
        //System.out.println("Домашнее задание 2. Задача 3");
        int averageValue = 0;
        //for (int i = 0; i <0; averageValue++) ;

        //System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
        {
            System.out.println("Домашнее задание 2. Задача 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            char correctFullMName = 0;
            //for (char correctFullMName = 0; reverseFullName.length = 0; reverseFullName[]--) {

            }
            //System.out.println(correctFullMName);
            //System.out.println("Ivanov Ivan");
        }


