package casestudy_module2.models;

public class Villa extends Services {
    private String standardRoom;
    private String convenient;
    private double areaPool;
    private int floor;

    public Villa(String name, String id, double areaSd, int cost, int maxPeople, String typeRent, String standardRoom, String convenient, double areaPool, int floor) {
        super(name, id, areaSd, cost, maxPeople, typeRent);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String standardRoom, String convenient, double areaPool, int floor) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa() {
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }

    @Override
    public String showInfor() {
            return this.getId()+","+this.getName()+","+this.getAreaSd()+this.getCost()
                +","+this.getMaxPeople()+","+this.getTypeRent()+","+this.getStandardRoom()+","+this.getConvenient()+","+this.getAreaPool()
                +","+this.getFloor();

    }
}
