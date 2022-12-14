import java.time.LocalDate;

public class Main {
       public static void printYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год - висосный");
        } else {
            System.out.println(year + " - не висосный год");
        }
    }
    public static  void chooseApps(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            System.out.println("Установите по ссылке приложениe для iOS");
        }
        else {
            System.out.println("Установите по ссылке приложениe для Android ");
        }
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            System.out.println("в lite-версии");
        } else if (clientDeviceYear == currentYear) {
            System.out.println(" ");
        }
    }

    public static void deliverBankCard(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDays + " день для доставки карты");
        } else {
            System.out.println("Потребуется " + (((deliveryDistance - 20) / 40 + deliveryDays + 1)) + " дня(-ей) для доставки карты");
        }
    }
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2000;
        printYear(year);
        //Задача 2
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2022;
        chooseApps(clientOS, clientDeviceYear);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 100;
        int deliveryDays = 1;
        deliverBankCard(deliveryDistance, deliveryDays);
    }
}

