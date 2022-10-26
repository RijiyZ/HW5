public class Main {
    public static void main(String[] args) {
        int clientOC = 1; // 1-2 zadanie
        System.out.println("1-2 Задание:");
        int clientDeviceYear = 2022;
        if (clientOC == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOC == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOC == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int year = 1488; // 3 zadanie
        System.out.println("3 Задание:");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " Не я вляется високосным годом");
        }

        int deliveryDistance = 95; // 4 задание
        System.out.println("4 Задание:");
        int deliveryTime = 0;
        deliveryTime = deliveryDistance / 40;
        deliveryTime ++;
        System.out.println("Потребуется дней: " + deliveryTime);

        /*Второй вариант кода
        int deliveryDistance = 95; // 4 задание
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
        deliveryTime = deliveryDistance / 40;
           deliveryTime ++;
           System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryDistance / 40;
            deliveryTime ++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            deliveryTime = deliveryDistance / 40;
            deliveryTime ++;
            System.out.println("Потребуется дней: " + deliveryTime);
        }*/

        int monthNumber = 3; // 5 zadanie
        System.out.println("5 Задание:");
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка! Введите значение от 1 до 12");
        }
    }
}