public class Main {


    public static void leapYearCheak(int year) {

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");}
    }

    public static void printOsVersion(int clientOS, int clientDeviceYear) {


        if (clientOS == 1) {
            System.out.println("Клиент пользуется операционной системой IOS");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 0) {
            System.out.println("Клиент пользуется операционной системой Android");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }}


    }

    public static int daysToDelivery (int deliveryDistance) {

        int deliveryday = 1;
        int deliveryday2 = 2;
        int deliveryday3 = 3;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryday );
            return deliveryday;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:  " + deliveryday2 );
            return deliveryday2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:  " + deliveryday3 );
            return deliveryday3;
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");

        }
        return deliveryday;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        leapYearCheak(2023);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        printOsVersion(1,2015);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        daysToDelivery(95);
    }
}