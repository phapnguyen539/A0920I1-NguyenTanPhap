package com.codegym.customer_aop.model;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Set;

    @Entity
    public class Province {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        @OneToMany(mappedBy = "province")
        private Set<Customer> customer;

        public Province() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<Customer> getUsers() {
            return customer;
        }

        public void setUsers(Set<Customer> users) {
            this.customer= users;
        }


    }
