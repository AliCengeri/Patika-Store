import java.util.*;

public class Main {
    static List<Brands> brands = new ArrayList<>();
    static {
        brands.add(new Brands(1, "Samsung"));
        brands.add(new Brands(2, "Lenovo"));
        brands.add(new Brands(3, "Apple"));
        brands.add(new Brands(4, "Huawei"));
        brands.add(new Brands(5, "Casper"));
        brands.add(new Brands(6, "Asus"));
        brands.add(new Brands(7, "HP"));
        brands.add(new Brands(8, "Xiaomi"));
        brands.add(new Brands(9, "Monster"));
    }

    static ArrayList<Notebook> nb = new ArrayList<>();
    static {
        nb.add(new Notebook(2, "Lenovo", 2, 3700, 3, "LENOVO V14 IGL", 16, 512, 14));
        nb.add(new Notebook(4, "Huawei", 1, 7000, 3, "HUAWEI Matebook 14", 16, 512, 14));
    }

    static ArrayList<CellPhone> cp = new ArrayList<>();
    static {
        cp.add(new CellPhone(1, "Samsung", 2, 3199, 3, "SAMSUNG GALAXY A51", 16, 128, 3000, "Siyah"));
        cp.add(new CellPhone(3, "Apple", 1, 3199, 3, "Iphone 11", 16, 128, 3000, "Siyah"));
    }

    public static void main(String[] args) {
        Collections.sort(brands);
        Scanner input = new Scanner(System.in);
        int select = 1;
        while (select != 0) {
            System.out.println("\nPatikaStore Ürün Yönetim Paneli!\n");
            System.out.println("1-Notebook İşlemleri\n" +
                    "2-Cep Telefonu İşlemleri\n" +
                    "3-Marka Listele\n" +
                    "0-Çıkış Yap");
            System.out.print("Tercihiniz: ");
            select = input.nextInt();
            if (select == 1) {
                System.out.println("\n1-Notebookları İncele\n" +
                        "2-Notebook ekle\n" +
                        "3-Notebook sil");
                System.out.print("Tercihiniz: ");
                int select2 = input.nextInt();
                if (select2 == 1) {
                    System.out.println("\nÜrünleri hangi sıra ile görmek istersiniz?\n" +
                            "1-Marka Sırasına Göre\n" +
                            "2-ID Sırasına Göre");
                    System.out.print("Tercihiniz: ");
                    int select3 = input.nextInt();
                    if (select3 == 1) {
                        Collections.sort(nb);
                        for (Notebook i : nb) {
                            System.out.println(i.getProdId() + " " + i.getBrandName() + " " + i.getPrice());
                        }
                    }
                    if (select3 == 2) {
                        Collections.sort(nb, Notebook::compareToById);
                        for (Notebook i : nb) {
                            System.out.println(i.getProdId() + " " + i.getBrandName() + " " + i.getPrice());
                        }
                    }
                }
                if (select2 == 2) {
                    System.out.println("Marka ID'si seçiniz: ");
                    for (Brands i : brands) {
                        System.out.println(i.getId() + "-" + i.brandName);
                    }
                    int brandId = input.nextInt();
                    String brandName = brandNameGetter(brandId);
                    System.out.print("ID: ");
                    int prodId = input.nextInt();
                    System.out.print("Fiyat: ");
                    int price = input.nextInt();
                    System.out.print("Stok: ");
                    int stock = input.nextInt();
                    System.out.print("Ürünün İsmi: ");
                    String prodName = input.next();
                    System.out.print("Ram: ");
                    int ram = input.nextInt();
                    System.out.print("Hafıza: ");
                    int memory = input.nextInt();
                    System.out.print("Ekran Boyutu: ");
                    int screenSize = input.nextInt();
                    nb.add(new Notebook(brandId, brandName, prodId, price, stock, prodName, ram, memory, screenSize));
                }
                if (select2 == 3) {
                    System.out.print("Silmek istediğiniz ürünün ID'sini giriniz: ");
                    int id = input.nextInt();
                    productRemoverNotebook(id);
                }
            }

            if (select == 2) {
                System.out.println("\n1-Cep Telefonlarını İncele\n" +
                        "2-Cep Telefonu ekle\n" +
                        "3-Cep Telefonu sil");
                System.out.print("Tercihiniz: ");
                int select2 = input.nextInt();
                if (select2 == 1) {
                    System.out.println("\nÜrünleri hangi sıra ile görmek istersiniz?\n" +
                            "1-Marka Sırasına Göre\n" +
                            "2-ID Sırasına Göre");
                    System.out.print("Tercihiniz: ");
                    int select3 = input.nextInt();
                    if (select3 == 1) {
                        Collections.sort(cp);
                        for (CellPhone i : cp) {
                            System.out.println(i.getProdId() + " " + i.getBrandName() + " " + i.getPrice());
                        }
                    }
                    if (select3 == 2) {
                        Collections.sort(cp, CellPhone::compareToById);
                        for (CellPhone i : cp) {
                            System.out.println(i.getProdId() + " " + i.getBrandName() + " " + i.getPrice());
                        }
                    }
                }
                if (select2 == 2) {
                    System.out.println("Marka ID'si seçiniz: ");
                    for (Brands i : brands) {
                        System.out.println(i.getId() + "-" + i.brandName);
                    }
                    int brandId = input.nextInt();
                    String brandName = brandNameGetter(brandId);
                    System.out.print("ID: ");
                    int prodId = input.nextInt();
                    System.out.print("Fiyat: ");
                    int price = input.nextInt();
                    System.out.print("Stok: ");
                    int stock = input.nextInt();
                    System.out.print("Ürünün İsmi: ");
                    String prodName = input.next();
                    System.out.print("Ram: ");
                    int ram = input.nextInt();
                    System.out.print("Hafıza: ");
                    int memory = input.nextInt();
                    System.out.print("Pil Gücü: ");
                    int battery = input.nextInt();
                    System.out.print("Renk: ");
                    String color = input.next();
                    cp.add(new CellPhone(brandId, brandName, prodId, price, stock, prodName, ram, memory, battery, color));
                }
                if (select2 == 3) {
                    System.out.print("Silmek istediğiniz ürünün ID'sini giriniz: ");
                    int id = input.nextInt();
                    productRemoverCellPhone(id);
                }
            }
            if (select == 3) {
                for (Brands i : brands) {
                    System.out.println(i.brandName);
                }
            }
        }
    }

    public static String brandNameGetter(int brandId) {
        for (Brands brand : brands) {
            if (brandId == brand.getId()) {
                return brand.getBrandName();
            }
        }
        return null;
    }

    public static void productRemoverNotebook(int id) {
        for (int i = 0; i < nb.size(); i++) {
            if (id == nb.get(i).getProdId()) {
                nb.remove(i);
            }
        }
    }

    public static void productRemoverCellPhone(int id) {
        for (int i = 0; i < cp.size(); i++) {
            if (id == cp.get(i).prodId) {
                cp.remove(i);
            }
        }
    }
}