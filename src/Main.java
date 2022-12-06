public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int [] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
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
                if (weights[i] !=weightsCopy[i]) {
                    arraysAreEqual = false;
                }
                
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        }
        else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
            
        }
    }
}