public class Main {
    public static void main(String[] args) {
        // Домашнее задание. Задача 1
        System.out.println("Домашнее задание. Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName =  firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        // Домашнее задание. Задача 2
        String fullName1 = "Ivanov Ivan Ivanovich";
        fullName1 = fullName1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);
        // Домашнее задание. Задача 3
        String fullName2 = "Иванов Семён Семёнович";

        if (fullName2.contains("ё")) {
            String[] nameParts = fullName2.split("ё");
            String fullNameTemp = "";
            for (String namePart : nameParts) {
                if (fullNameTemp.length() > 0 ) {
                    fullNameTemp = fullNameTemp + "e";
                }
                fullNameTemp = fullNameTemp + namePart;
            }
            fullName2 = fullNameTemp;
        }
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}


