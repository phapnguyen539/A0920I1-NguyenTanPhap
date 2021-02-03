package sort;

public class SortInt implements Comparable<SortInt> {
    private int id;
    private String name;

    public SortInt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public SortInt() {
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

    @Override
    public String toString() {
        return "SortInt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(SortInt o) {
        int resul= this.id- o.getId();
        if(resul==0){
return this.name.compareTo(o.getName());
        }
        return resul;
    }
}
