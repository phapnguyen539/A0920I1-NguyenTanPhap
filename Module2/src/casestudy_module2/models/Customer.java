package casestudy_module2.models;

public class Customer {
    private String name;
    private int birthday;
    private String gender;
    private int cmnd;
    private int sdt;
    private String email;
    private String typeCustomer;
    private String address;
    private String services;

    public Customer(String name, int birthday, String gender, int cmnd, int sdt,
                    String email, String typeCustomer, String address, String services) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.services = services;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
    public void showInfor(){
        System.out.println("Name:"+ this.name+"Birthday:"+ this.birthday+"Gender:"+ this.gender+"Cmnd:"+ this.cmnd
        +"Phone:"+this.sdt+"Email:"+ this.email+"Type Customer:"+ this.typeCustomer+"Address:"+this.address+"Services:"+ this.services);

    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", cmnd=" + cmnd +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services='" + services + '\'' +
                '}';
    }
}
