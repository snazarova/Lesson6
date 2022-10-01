package ru.skyeng;

public class homework { public static void main(String[] args) {
    System.out.println("Заданиея");
    // task1

    int clientOS = 0;
    if (clientOS == 1) {
        System.out.println("Установите приложение для Android версии по ссылке");
    }
    if (clientOS == 0) {
        System.out.println("установите версию для IOS по сыллке");
    }
    // task2

    int clientDeviceYear = 2015;
    if (clientOS == 1 && clientDeviceYear > 2015) {
        System.out.println("Скачайте скачайте приложение для Андройд по ссылке ");
    } else if (clientOS == 0 && clientDeviceYear >2015) {
        System.out.println("Скачайте приложение для IOS  поссылке");
    } else if (clientOS == 1 && clientDeviceYear <= 2015) {
        System.out.println("Скачайте облегченую версию для Андроид по ссылке");
    } else if (clientOS == 0 && clientDeviceYear <= 2015) {
        System.out.println("Скачайте облегченную версию для IOS  по ссылке");
    }
// task 3

   int year = 2022;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + "год является високосным");
    }else {
        System.out.println(year + " год не является високосным ");
    }
// task 4

    int deliveryDays = 1;
    int deliveryDistance = 95;
    if (deliveryDistance > 20) {
        deliveryDays++;
    }
     if (deliveryDistance > 60) {
         deliveryDays++;
     }
System.out.println("Потребуется дней " + deliveryDays);

     //task 5

      int monthNumber = 12;
      switch (monthNumber) {
          case 12:
          case 1:
          case 2:
              System.out.println("Зима");
              break;
          case 3:
          case 4:
          case 5:
              System.out.println("Весна");
              break;
          case 6:
          case 7:
          case 8:
              System.out.println("Лето");
              break;
          case 9:
          case 10:
          case 11:
              System.out.println("Осень");
              break;
          default:
              System.out.println("Не корректное значение" + monthNumber);

      }
}
}
