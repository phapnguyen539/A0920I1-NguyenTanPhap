package casestudy_module2.models;

import casestudy_module2.commons.Regex;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ComonServices {
    private static Regex regex;

    public void addCinemaServices(){
        Queue<String> queue= new PriorityQueue<>();
        queue.add("1.A");
        queue.add("2.B");
        queue.add("3.C");
    }
    public Services inputSevices(int typeSevices){
        String rentCost;
        String id;
        String name;
        String areaUsed;
        String maxPeople;
        String typeRent;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập Id Service.");
        id=scanner.nextLine();
        while(!regex.validateid(id)){
            System.out.println("Vui lòng nhập lại");
            id=scanner.nextLine();
        }
        System.out.println("Nhập chi phí thuê:  ");
        rentCost = (scanner.nextLine());
        while(!regex.validateRentCost(rentCost)){
            System.out.println("Nhập lại. ");
            rentCost = (scanner.nextLine());
        };
        System.out.println("Nhập tên Services.");
        name=scanner.nextLine();
        while (!regex.validateName(name)){
            System.out.println("Nhập lại");
            name=scanner.nextLine();
        }
        System.out.println("Nhập diện tích sử dụng Services.");
        areaUsed=scanner.nextLine();
        while (!regex.validateAreaPool(areaUsed)){
            System.out.println("Nhập lại.");
            areaUsed=scanner.nextLine();
        }
        System.out.println("Nhập số người .");
        maxPeople=scanner.nextLine();
        while (!regex.validateMaxPeople(maxPeople)){
            System.out.println("Vui lòng nhập lại");
            maxPeople=scanner.nextLine();
        }
        System.out.println("Nhập loại dịch vụ thuê");
        typeRent=scanner.nextLine();
        while (!regex.validateRentCost(typeRent)){
            System.out.println("Nhập lại");
            typeRent=scanner.nextLine();
    }
        return null;
    }
}
