package model;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthday;
    private int  idCard;
    private int phone;
    private String email;
    private String aducation;
    private String position;
    private int salary;
    private int division;
    private String userName;

    public Employee() {
    }

    public Employee(String name, Date birthday, int idCard, int phone, String email, String aducation, String position, int salary, int division, String userName) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.aducation = aducation;
        this.position = position;
        this.salary = salary;
        this.division = division;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAducation() {
        return aducation;
    }

    public void setAducation(String aducation) {
        this.aducation = aducation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
