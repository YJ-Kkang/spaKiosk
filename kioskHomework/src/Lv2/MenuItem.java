package Lv2;

public class MenuItem {
    //메뉴 이름
    private String name;
    //메뉴 가격
    private double price;
    //메뉴 설명
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}
