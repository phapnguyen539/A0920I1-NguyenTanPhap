let Customer= function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name
    };
    this.setCmnd = function (cmnd) {
        this.cmnd = cmnd;
    };
    this.getCmnd = function () {
        return this.cmnd;
    };
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };
    this.setTypecustomer = function (typecustomer) {
        this.typecustomer = typecustomer;
    };
    this.getTypecustomer = function () {
        return this.typecustomer;
    };
    this.setTypeservice = function (typeservice) {
        this.setTypeservice = typeservice;
    };
    this.getTypeService = function () {
        return this.typeservice;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };
    this.setQuantytiIncuded = function (quantytiIncuded) {
        this.quantytiIncuded = quantytiIncuded;
    };
    this.getQuantytiIncuded = function () {
        return this.quantytiIncuded;
    };
    this.setTyperoom = function (typeroom) {
        this.typeroom = typeroom;
    };
    this.getTyperoom = function () {
        return this.typeroom;
    };
    this.setRenday = function (renday) {
        this.renday = renday;
    };
    this.getRenday = function () {
        return this.renday;
    };
    this.totalPay = function () {
        let money = 0;
        if (this.getTypeService() === "Villa") {
            money = 500;
        } else if (this.getTypeService() === "House") {
            money = 300;
        } else if (this.getTypeService() === "Room") {
            money = 200;
        }
        return this.getRenday() * money * (1 - this.getDiscount() / 100);

    }
}