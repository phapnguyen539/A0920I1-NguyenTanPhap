package com.codegym.casestudy04.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @NotBlank(message = "Tên không được để trống !")
    @Size(min = 5,max = 20, message = "Phải từ 5 đến 10 ký tự !")
    private String customerName;
    @NotBlank(message = " không được để trống !")
    private String customerBirthday;
    @NotEmpty(message = "Không được để trống !")
    private String customerGender;
    @NotBlank(message = "Không được để trống!")
    @Pattern(regexp =  "\\d{9}" , message = "CMND phải đúng 9 ký tự số!")
    private String customerIdCard;
    @NotBlank(message = "Không được để trống!")
    @Pattern(regexp = "0\\d{9}" ,message = "SĐT 10 số, bắt đầu bằng 0")
    private String customerPhone;
    @NotBlank(message = "Không được để trống!")
    @Pattern(regexp ="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", message = "Email phải đúng định dạng")
    private String customerEmail;
    @NotBlank(message = "Bắt buộc phải nhập !")
    private String customerAddress;

    @ManyToOne
    private CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    private List<Contract> contracts;
    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String  getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String  customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCcard) {
        this.customerIdCard = customerIdCcard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}