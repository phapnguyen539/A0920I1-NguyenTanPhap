package casestudy_module2.models;

public class House extends Services {
    private String standardRoom;
    private String convenient;
    private String floor;

    public House(String name, String id, double areaSd, int cost, int maxPeople, String typeRent, String standardRoom, String convenient, String floor) {
        super(name, id, areaSd, cost, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.floor = floor;
    }

    public House(String standardRoom, String convenient, String floor) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.floor = floor;
    }

    public House() {
    }

    public House(String name, String id, double areaSd, int cost, int maxPeople, String typeRent, String standardRoom, String convenient, int parseInt) {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
return null;
    }
}
