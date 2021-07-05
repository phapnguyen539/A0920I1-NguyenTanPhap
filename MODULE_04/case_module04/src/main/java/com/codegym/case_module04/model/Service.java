package com.codegym.case_module04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int service_id;
    private String serviceName;
    private int service_age;
    private double service_cost;
    private int service_max_people;
    private String standard_room;
    private String description_other_convenience;
    private double pool_area;
    private int number_of_floor;
    @ManyToOne
    private Rent_type rent_type;
    @ManyToOne
    private Service_type service_type;
    @OneToMany(mappedBy = "service")
    private List<Contract> contracts;



    public Service() {
    }

    public Rent_type getRent_type() {
        return rent_type;
    }

    public void setRent_type(Rent_type rent_type) {
        this.rent_type = rent_type;
    }

    public Service_type getService_type() {
        return service_type;
    }

    public void setService_type(Service_type service_type) {
        this.service_type = service_type;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return serviceName;
    }

    public void setService_name(String service_name) {
        this.serviceName = service_name;
    }

    public int getService_age() {
        return service_age;
    }

    public void setService_age(int service_age) {
        this.service_age = service_age;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public int getNumber_of_floor() {
        return number_of_floor;
    }

    public void setNumber_of_floor(int number_of_floor) {
        this.number_of_floor = number_of_floor;
    }
}
