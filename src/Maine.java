public class Maine {

    public static void main(String[] args) {

        int age = 19;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить, но недостаточно взрослый, чтобы пить алкоголь");
        }

        if (age < 7 || age > 18) {
            System.out.println("Я думаю ты не ходишь в школу");
        }


        int Android = 1;
        if (Android == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        double IOS = 1.0;
        if (IOS == 1.0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        int clientDeviceYearAndroid = 2015;
        if (clientDeviceYearAndroid <= 2015) {
            System.out.println("Установите версию для Android по ссылке ");
            if (clientDeviceYearAndroid >= 2014) {
                System.out.println("Установите облегченную версию Android по ссылке");
            }
        }
        int clientDeviceYearIOS = 2015;
        if (clientDeviceYearIOS <= 2015) {
            System.out.println("Установите версию для IOS по ссылке ");
            if (clientDeviceYearIOS >= 2014) {
                System.out.println("Установите облегченную версию IOS по ссылке");
            }
        }


        int year = 2021;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня доставки");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Сезон зимний");
                break;
            case 3, 4, 5:
                System.out.println("Сезон весенний");
                break;
            case 6, 7, 8:
                System.out.println("Сезон летний");
                break;
            case 9, 10, 11:
                System.out.println("Сезон осенний");
                break;
            default:
                System.out.println("Нет такого месяца в сезонах)");
        }

        int Age = 19;
        int salary = 58_000;
        if (Age >= 23 && salary < 50_000) {
            System.out.println("Твой лимит равен трем твоим зп");
        }
    }
}









