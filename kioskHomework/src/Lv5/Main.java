package Lv5;

public class Main {
    public static void main(String[] args) {
        //Menu 객체 생성 및 초기화
        Menu burgers = new Menu("Burgers");

        //버거: add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        burgers.addMenuItem(new MenuItem("ShackBurger    ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack     ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger   ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger      ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //음료: add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Bubbling Soda  ", 1.9, "에이드"));
        drinks.addMenuItem(new MenuItem("Cola Classics  ", 2.1, "에이드"));
        drinks.addMenuItem(new MenuItem("American Mood  ", 2.1, "에이드"));
        drinks.addMenuItem(new MenuItem("Creamy Velvet  ", 2.5, "에이드"));
        drinks.addMenuItem(new MenuItem("Mojito Breeze  ", 2.5, "에이드"));
        drinks.addMenuItem(new MenuItem("Lemon Sparkle  ", 2.7, "에이드"));
        drinks.addMenuItem(new MenuItem("Peach Delight  ", 1.1, "탄산수"));

        //디저트: add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("VanillaIceCream", 3.5, "바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("ChocoBrownie   ", 2.5, "초코 브라우니"));
        desserts.addMenuItem(new MenuItem("FruitTart      ", 4.0, "과일 타르트"));
        desserts.addMenuItem(new MenuItem("RedVelvetCake  ", 3.7, "레드벨벳 케이크"));
        desserts.addMenuItem(new MenuItem("CheeseCake     ", 3.9, "치즈케이크"));

        //Kiosk 객체 생성, 메뉴 추가
        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgers);
        kiosk.addMenu(drinks);
        kiosk.addMenu(desserts);

        //프로그램 시작
        kiosk.start();
    }
}
