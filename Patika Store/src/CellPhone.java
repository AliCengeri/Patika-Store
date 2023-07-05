public class CellPhone extends Brands{
    int prodId;
    int price;
    int stock;
    String prodName;
    int ram;
    int memory;
    int battery;
    String color;

    public CellPhone(int id, String brandName, int prodId, int price, int stock, String prodName, int ram, int memory, int battery, String color) {
        super(id, brandName);
        this.prodId = prodId;
        this.price = price;
        this.stock = stock;
        this.prodName = prodName;
        this.ram = ram;
        this.memory = memory;
        this.battery = battery;
        this.color = color;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareToById(CellPhone a) {
        return this.prodId - a.getProdId();
    }
}
