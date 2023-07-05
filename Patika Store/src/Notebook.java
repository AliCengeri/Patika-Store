public class Notebook extends Brands{
    int prodId;
    int price;
    int stock;
    String prodName;
    int ram;
    int memory;
    int screenSize;

    public Notebook(int id, String brandName, int prodId, int price, int stock, String prodName, int ram, int memory, int screenSize) {
        super(id, brandName);
        this.prodId = prodId;
        this.price = price;
        this.stock = stock;
        this.prodName = prodName;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int compareToById(Notebook a) {
        return this.prodId - a.getProdId();
    }
}
