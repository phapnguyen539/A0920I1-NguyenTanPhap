package casestudy_module2.models;

public abstract class Services {
    private String name;
    private String  id;
    private double areaSd;
    private int cost;
    private int maxPeople;
    private String typeRent;

    public Services(String name, String id, double areaSd, int cost, int maxPeople, String typeRent) {
        this.name = name;
        this.id = id;
        this.areaSd = areaSd;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public Services() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAreaSd() {
        return areaSd;
    }

    public void setAreaSd(double areaSd) {
        this.areaSd = areaSd;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
    public abstract String showInfor();
}