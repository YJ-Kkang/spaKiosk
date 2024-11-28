package Lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //카테고리 이름을 저장하는 필드
    private String categoryName;
    //MenuItem 객체들을 저장하는 리스트
    private List<MenuItem> menuItems;

    //생성자: 카테고리 이름을 받아 초기화하고, 메뉴 항목 리스트를 빈 리스트로 초기화
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    //메뉴 항목을 리스트에 추가하는 메서드
    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    //Getter 메서드: 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    //Getter 메서드: 메뉴 항목 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    //Setter 메서드: 카테고리 이름 설정
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //메뉴 항목을 순차적으로 출력하는 메서드
    public void printMenuItems() {
        // 모든 MenuItem 객체를 순서대로 출력
        for (int i = 0; i < menuItems.size(); i++) {
             /*각 메뉴 항목의 변호와 내용 형식화하여 출력
            %d: 정수 출력((i + 1)의 값을 정수로 출력) => 메뉴 항목 번호
            %s: 문자열 출력(menuItems.get(i).toString() 값 문자열로 출력) => 메뉴 항목 내용(이름, 가격, 설명)
            %n: 줄 바꿈
             */
            System.out.printf("%d. %s%n", (i + 1), menuItems.get(i).toString());
        }
        // 뒤로가기 옵션
        System.out.println("0. 뒤로가기");
    }
}
