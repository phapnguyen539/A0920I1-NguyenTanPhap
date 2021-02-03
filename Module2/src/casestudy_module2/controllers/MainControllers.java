package casestudy_module2.controllers;

import casestudy_module2.commons.Regex;
import casestudy_module2.models.House;
import casestudy_module2.models.Room;
import casestudy_module2.models.Villa;

import java.util.Scanner;

import static casestudy_module2.commons.ReadWriteFile.writerfile;

public class MainControllers {
    private static Scanner scanner=new Scanner(System.in);


    public static  void addNewSivices() {
        System.out.println("1.Add new Villa.\n" +
                "2.Add new House.\n" +
                "3.Add new Room.\n" +
                "4.Back to Menu.\n" +
                "5.Exit.");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                addNewVilla();
                addNewSivices();
                break;
            case 2:
                addNewHouse();
                addNewSivices();
                break;
            case 3:
                addNewRoom();
                addNewSivices();
                break;
            default:
                System.out.println("Mời nhập lại:");
        }
    }
    public static void showServices(){
        System.out.println("1.Show all Villa.\n" +
                "2.Show all House.\n" +
                "3.Show all Room.\n" +
                "4.Show all name Villa Not Duplicate.\n" +
                "5.Show all name House Not Duplicate.\n" +
                "6.Show all name Room Not Duplicate\n" +
                "7.Back to menu." +
                "8.Exit.");
    }
    public static void addNewRoom(){
        String name;
        String id;
        String areaSd;
        String cost;
        String maxPeople;
        String typeRent;
        String free;
        System.out.println("Nhập tên:");
        name= scanner.nextLine();
        System.out.println("Nhập Id:");
        id=scanner.nextLine();
        System.out.println("Nhập Dt sử dụng:");
        areaSd=scanner.nextLine();
        System.out.println("Nhập chi phí thuê:");
        cost=scanner.nextLine();
        System.out.println("Nhập số người:");
        maxPeople=scanner.nextLine();
        System.out.println("Nhập loại thuê:");
        typeRent=scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí:");
        free=scanner.nextLine();
        Room room= new Room(name,id,Double.parseDouble(areaSd),Integer.parseInt(cost),Integer.parseInt(maxPeople),
                typeRent,free);
        String temp= room.showInfor();
        writerfile("Module2/src/casestudy_module2/models/Room.java",temp,true);
    }
    public static void addNewHouse(){
            String name;
            String id;
            String areaSd;
            String cost;
            String  maxPeople;
            String typeRent;
            String standardRoom;
            String convenient;
            String floor;
        System.out.println("Nhập tên:");
        name= scanner.nextLine();
        System.out.println("Nhập Id:");
        id=scanner.nextLine();
        System.out.println("Nhập Dt sử dụng:");
        areaSd=scanner.nextLine();
        System.out.println("Nhập chi phí thuê:");
        cost=scanner.nextLine();
        System.out.println("Nhập số người:");
        maxPeople=scanner.nextLine();
        System.out.println("Nhập loại thuê:");
        typeRent=scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:");
        standardRoom=scanner.nextLine();
        System.out.println("Nhập tiện nghi:");
        convenient=scanner.nextLine();
        System.out.println("Nhập số tầng:");
        floor=scanner.nextLine();
        House house= new House(name,id,Double.parseDouble(areaSd),Integer.parseInt(cost),Integer.parseInt(maxPeople),
                typeRent,standardRoom,convenient,Integer.parseInt(floor));
        String temp= house.showInfor();
        writerfile("Module2/src/casestudy_module2/models/House.java",temp,false);

    }
    public static void addNewVilla(){
            String name;
            String id;
            String areaSd;
            String cost;
            String maxPeople;
            String typeRent;
            String standardRoom;
            String convenient;
            String areaPool;
            String floor;

            do {
                System.out.println("Nhập tên:");
                name= scanner.nextLine();
            }
            while (!Regex.validateName(name));

           do {
               System.out.println("Nhập Id:");
               id=scanner.nextLine();
           }
           while (!Regex.validateid(id));
            System.out.println("Nhập Dt sử dụng:");
            areaSd=scanner.nextLine();
            System.out.println("Nhập chi phí thuê:");
            cost=scanner.nextLine();
            System.out.println("Nhập số người:");
            maxPeople=scanner.nextLine();
            System.out.println("Nhập loại thuê:");
            typeRent=scanner.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng:");
            standardRoom=scanner.nextLine();
            System.out.println("Nhập tiện nghi:");
            convenient=scanner.nextLine();
            System.out.println("Nhập diên tích phòng:");
            areaPool=scanner.nextLine();
            System.out.println("Nhập số tầng:");
            floor=scanner.nextLine();

            Villa villa = new Villa(name,id,Double.parseDouble(areaSd),Integer.parseInt(cost),Integer.parseInt(maxPeople),
                    typeRent,standardRoom,convenient,Double.parseDouble(areaPool),Integer.parseInt(floor));
           String temp= villa.showInfor();

        writerfile("C:\\a0920i1-Nguyen_Tan_Phap\\Module2\\src\\casestudy_module2\\data\\villa.csv",temp,true);

        }


    public static void addNewCustomer() {

    }

    public static void showInformationCustomer() {

    }

    public static void addNewBooking() {

    }

    public static void showInformationEmployee() {

    }
    public static void displayMainMenu() {
        System.out.println("_MENU_\n" +
                "1.Add new Services.\n" +
                "2.Show Services.\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee" +
                "7.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời chọn menu:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addNewSivices();
                displayMainMenu();
                break;
            case 2:
                showServices();
                displayMainMenu();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showInformationCustomer();
                displayMainMenu();
                break;
            case 5:
                addNewBooking();
                displayMainMenu();
                break;
            case 6:
                showInformationEmployee();
                displayMainMenu();
                break;
        }

    }

    public static void main(String[] args) {
        addNewSivices();
    }
}

