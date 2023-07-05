import java.util.Comparator;

public class Brands implements Comparable<Brands> {
    int id;
    String brandName;

    public Brands(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int compareTo(Brands a) {
        return this.brandName.compareTo(a.getBrandName());
    }
    public int compareToById(Brands a) {
        return this.id - a.getId();
    }
}
