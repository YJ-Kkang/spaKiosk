package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //카테고리 이름
    private String categoryName;
    //메뉴 항목 리스트
    private List<MenuItem> menuItems;

    //생성자: 카테고리 이름과 메뉴 항목 리스트 초기화
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    //메뉴 항목 추가 메서드
    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    //카테고리 이름 반환 메서드
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 리스트 반환 메서드
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 메뉴 항목을 순차적으로 출력하는 메서드
    public void printMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s%n", (i + 1), menuItems.get(i).toString());
        }
        System.out.println("0. 뒤로가기");
    }
}
