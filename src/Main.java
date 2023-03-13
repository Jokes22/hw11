public class Main {


    public static int year() {
        int year = 2023;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");}
        return year;
    }

    public static int OS() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
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


        return clientOS;
    }

    public static int bank() {
        int deliveryDistance = 95;

        int deliverydays = 1;
        int deliverydays2 = 2;
        int deliverydays3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliverydays);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliverydays2);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliverydays3);
        }
        if (deliveryDistance >100) {
            System.out.println("Свыше 100 км доставки нет");

        }
        return deliveryDistance;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        year();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        OS();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        bank();
    }
}