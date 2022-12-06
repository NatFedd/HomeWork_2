public class Main{

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        // Домашнее задание 1. Задача 1
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("Домашнее задание 1. Задача 1");
        for (int i = 0; i < generateRandomArray().length -1; i++) {
           // int sum = generateRandomArray()[i] + generateRandomArray()[i + 1];
            System.out.println("Сумма трат за месяц составила " + arr[i+1] + " рублей");
        }


                int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
                int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
                int januaryWeight = weights[0];
                System.out.println(januaryWeight);
                System.out.println(weights[0]);
                System.out.println(weights[4]);
                int january = 0;
                System.out.println(weights[january]);
                for (int i = 0; i < weights.length; i++) {
                    System.out.println(weights[i]);

                }
                boolean arraysAreEqual = true;
                arraysAreEqual = weights.length == weightsCopy.length;
                if (arraysAreEqual) {
                    for (int i = 0; i < weights.length; i++) {
                        if (weights[i] != weightsCopy[i]) {
                            arraysAreEqual = false;
                        }

                    }
                }
                if (arraysAreEqual) {
                    System.out.println("Массивы одинаковые");
                } else {
                    System.out.println("Массивы разные");
                }
                for (int i = 0; i < weightsCopy.length; i++) {
                    System.out.println(weightsCopy[i]);

                }
                int maxWeight = -1;
                for (final int current : weights) {
                    if (current > maxWeight) {
                        maxWeight = current;
                    }

                }
                System.out.println(maxWeight);
                for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
                    System.out.println(weights[i + 1] - weights[i]);
                }
            }
        }
