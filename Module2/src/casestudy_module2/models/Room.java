package casestudy_module2.models;

public class Room extends Services {
    private String free;

    public Room(String name, String id, double areaSd, int cost, int maxPeople, String typeRent, String free) {
        super(name, id, areaSd, cost, maxPeople, typeRent);
        this.free = free;
    }

    public Room(String free) {
        this.free = free;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "free='" + free + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
return null;
    }
}
