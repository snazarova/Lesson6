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




}
}
