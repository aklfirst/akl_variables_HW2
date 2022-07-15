public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Please install iOS version using the following link:");
        } else {
            System.out.println("Please install Android version using the following link:");
        }
// Задание 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Please install iOS version using the following link:");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Please install Android version using the following link:");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Please install LIGHT iOS version using the following link:");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Please install LIGHT Android version using the following link:");
        } else {
            System.out.println("the version or your phone model or operating system is out of the coverage");
        }

// Задание 3
        int year = 2012;
        int divisor1 = 4;
        int divisor2 = 100;
        int divisor4 = 400;
        double checkLeapYear1 = year / (divisor1 * 1.0);
        double checkRoundYear1 = year / divisor1;
        double checkLeapYear2 = year / (divisor2 * 1.0);
        double checkRoundYear2 = year / divisor2;
        double checkLeapYear4 = year / (divisor4 * 1.0);
        double checkRoundYear4 = year / divisor4;
        boolean leapYearCheck1 = checkLeapYear1 == checkRoundYear1;
        boolean leapYearCheck2 = checkLeapYear2 != checkRoundYear2;
        boolean leapYearCheck3 = checkLeapYear2 == checkRoundYear2;
        boolean leapYearCheck4 = checkLeapYear4 == checkRoundYear4;
        if (leapYearCheck1 && leapYearCheck2) {
            System.out.println("This is a Leap Year!");
        } else if (leapYearCheck3 && leapYearCheck4) {
            System.out.println("This is a Leap Year!");
        } else {
            System.out.println("This is NOT a leap year!");
        }

// Задание 4 - int округляет "вниз", поэтому к значению переменной проверяющей кол-во дополнительных дней (checkDaysSurplus)
// которая считает кратность от 40 км - можно добавлять +1 и получится искомый результат?
        int deliveryDistance = 95;
        int standardDistance = 20;
        int distanceDivisor = 40;
        int checkDaysSurplus = ((deliveryDistance - standardDistance) / (distanceDivisor));
        int addDeliveryTime = (checkDaysSurplus + 1);
        if (deliveryDistance <= standardDistance) {
            System.out.println("Delivery will take 1 day and 1 night");
        } else {
            System.out.println("Days for delivery: 1 day and 1 night + " + addDeliveryTime + " days");
        }
//Задание 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("This is Winter month");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is Spring month");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is Summer month");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is Autumn month");
                break;
            default:
                System.out.println("Not a valid month");
                        }
    }

}


