package Lv5;

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

    //Getter 메서드: 메뉴 이름 반환
    public String getName() {
        return name;
    }

    //Getter 메서드: 메뉴 가격 반환
    public double getPrice() {
        return price;
    }

    //Getter 메서드: 메뉴 설명 반환
    public String getDescription() {
        return description;
    }

    //Setter 메서드: 메뉴 이름 설정
    public void setName(String name) {
        this.name = name;
    }

    //Setter 메서드: 메뉴 가격 설정
    public void setPrice(double price) {
        this.price = price;
    }

    //Setter 메서드: 메뉴 설명 설정
    public void setDescription(String description) {
        this.description = description;
    }

    //메뉴 항목을 문자열로 반환
    @Override
    public String toString() {
        return name + " | ₩ " + price + " | " + description;
    }
}
