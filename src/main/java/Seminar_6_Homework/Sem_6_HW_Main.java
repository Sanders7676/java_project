package Seminar_6_Homework;

import java.util.List;
import java.util.Scanner;

public class Sem_6_HW_Main {
    public static void main(String[] args) {
        Sem_6_HW_Notebook Aser_A123 = new Sem_6_HW_Notebook("Acer", "A123", "черный",
                15.6, "LCD", 8, 256, "HDD");
        Sem_6_HW_Notebook Dell_D987 = new Sem_6_HW_Notebook("Dell", "D987", "черный",
                15.6, "LCD", 8, 512, "SSD");
        Sem_6_HW_Notebook Lenovo_L432 = new Sem_6_HW_Notebook("Lenovo", "L432", "зеленый",
                17.0, "TFT", 16, 512, "SSD");
        Sem_6_HW_Notebook Apple_Ap258 = new Sem_6_HW_Notebook("Apple", "Ap258", "красный",
                15.6,"OLED", 32, 2048, "HDD");
        Sem_6_HW_Notebook Asus_S234 = new Sem_6_HW_Notebook("Asus", "S234", "белый",
                15.6,"TFT", 16, 1024, "SSD");
        Sem_6_HW_Notebook Aser_A125 = new Sem_6_HW_Notebook("Acer", "A125", "белый",
                17.0,"LED", 16, 2048, "SSD");
        Sem_6_HW_Notebook Dell_D777 = new Sem_6_HW_Notebook("Dell", "D777", "красный",
                14.0,"TFT", 8, 512, "HDD");
        Sem_6_HW_Notebook Lenovo_L235 = new Sem_6_HW_Notebook("Lenovo", "L235", "черный",
                15.6,"OLED", 8, 1024, "HDD");
        Sem_6_HW_Notebook Apple_Ap456 = new Sem_6_HW_Notebook("Apple", "Ap456", ",белый",
                17.0,"LCD", 16, 1024, "SSD");
        Sem_6_HW_Notebook Asus_S147 = new Sem_6_HW_Notebook("Asus", "S147", "черный",
                14.0,"LED", 8, 512, "HDD");

        List<Sem_6_HW_Notebook> notebookList = List.of(Aser_A123, Dell_D987, Lenovo_L432, Apple_Ap258, Asus_S234,
                Aser_A125, Dell_D777, Lenovo_L235, Apple_Ap456, Asus_S147);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("""
                Выберите интересующий Вас параметр ноутбука:\s
                1 - бренд\s
                2 - цвет\s
                3 - размер экрана\s
                4 - тип экрана\s
                5 - размер оперативной памяти\s
                6 - объем памяти\s
                7 - тип жесткого диска""");

        int usersChoice = scannerUser.nextInt();

        if (usersChoice == 1) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой бренд Вас интересует? \n" +
                    "В наличии: Aser, Dell, Lenovo, Apple, Asus");
            String usersParameter = getUsersParameter.nextLine();
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(usersParameter)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (usersChoice == 2) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой цвет Вас интересует? \n" +
                    "В наличии: черный, белый, красный, зеленый");
            String usersParameter = getUsersParameter.nextLine();
            for (Sem_6_HW_Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(usersParameter)) {
                    System.out.println(color.printInfo());
                }
            }
        } else if (usersChoice == 3) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой минимальный размер экрана (в дюймах) Вас интересует?");
            double usersParameter = Integer.parseInt(getUsersParameter.nextLine());
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getScreenSize() >= usersParameter) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (usersChoice == 4) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой тип экрана Вас интересует? \n" +
                    "В наличии: TFT, LCD, OLED");
            String usersParameter = getUsersParameter.nextLine();
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getScreenTechnology().equalsIgnoreCase(usersParameter)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (usersChoice == 5) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой минимальный размер оперативной памяти (в Гб) Вас интересует?");
            int usersParameter = Integer.parseInt(getUsersParameter.nextLine());
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getRam() >= usersParameter) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (usersChoice == 6) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой минимальный размер жесткого диска (в Мб) Вас интересует?");
            int usersParameter = Integer.parseInt(getUsersParameter.nextLine());
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getRom() >= usersParameter) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (usersChoice == 7) {
            Scanner getUsersParameter = new Scanner(System.in);
            System.out.println("Укажите какой тип жесткого диска Вас интересует? \n" +
                    "В наличии: SSD или HDD");
            String usersParameter = getUsersParameter.nextLine();
            for (Sem_6_HW_Notebook brand : notebookList) {
                if (brand.getTypeDisk().equalsIgnoreCase(usersParameter)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка! Необходимо выбрать параметр ноутбука в соответствии " +
                    "с предложенным в меню выбора");
        }
    }
}
