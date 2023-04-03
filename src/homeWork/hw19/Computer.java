package homeWork.hw19;

public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int videoCard;

    // Конструктор с параметрами
    public Computer(String brand, int price, int ram, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
        System.out.println("Создан PC.\nИмя = " + brand + "\nЦена = " + price +
                "\nВидеокарта = " + videoCard + "\nОЗУ = " + ram);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public void getInfo() {
        System.out.println("Марка: " + brand + "\nЦена: " + price +
                "\nОперативная память: " + ram + "\nВидеокарта: " + videoCard);
    }
}