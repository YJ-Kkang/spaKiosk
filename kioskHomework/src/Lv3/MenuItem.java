package Lv3;

public class MenuItem {
    //메뉴 이름
    private String name;
    //메뉴 가격
    private double price;
    //메뉴 설명
    private String description;

    //생성자: 메뉴 항목 초기화
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //메뉴 항목을 문자열로 반환
    @Override
    public String toString() {
        return name + " | ₩ " + price + " | " + description;
    }
}
