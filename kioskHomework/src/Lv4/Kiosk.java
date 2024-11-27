package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk() {
        this.menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        this.menus.add(menu);
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int userInput = -1;

        while (userInput != 0) {
            // 메인 메뉴 출력
            printMainMenu();

            // 메뉴 입력 처리
            userInput = getUserInput(sc, "메뉴 번호를 선택하세요 (종료: 0): ");

            if (userInput > 0 && userInput <= menus.size()) {
                Menu selectedMenu = menus.get(userInput - 1);
                handleMenuSelection(sc, selectedMenu);
            } else if (userInput != 0) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                printSeparator();
            }
        }

        System.out.println("키오스크 프로그램을 종료합니다. 이용해 주셔서 감사합니다!");
        sc.close();
    }

    private void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d. %s%n", (i + 1), menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");
    }

    private int getUserInput(Scanner sc, String prompt) {
        int userInput = -1; //userInput 변수를 음수로 초기화하여 루프가 처음에 실행되도록 함
        
        while (true) {
            try {
                System.out.print(prompt);
                userInput = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                // 잘못된 입력값 버퍼에서 제거
                sc.nextLine();
                printSeparator();
            }
        }
        return userInput;
    }

    private void handleMenuSelection(Scanner sc, Menu menu) {
        int userInput = -1;

        while (userInput != 0) {
            // 선택된 메뉴 출력
            printSubMenu(menu);

            // 서브 메뉴 입력 처리
            userInput = getUserInput(sc, "메뉴 번호를 선택하세요 (뒤로가기: 0): ");

            if (userInput > 0 && userInput <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(userInput - 1);
                System.out.println("선택한 메뉴: " + selectedItem);
                printSeparator();
            } else if (userInput != 0) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                printSeparator();
            }
        }
    }

    private void printSubMenu(Menu menu) {
        System.out.printf("[ %s MENU ]%n", menu.getCategoryName());
        menu.printMenuItems();
    }

    private void printSeparator() {
        System.out.println("-".repeat(70));
    }
}
