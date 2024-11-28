package Lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //여러 카테고리의 메뉴를 저장하는 리스트
    private List<Menu> menus;

    //생성자: 메뉴 리스트 초기화
    public Kiosk() {
        this.menus = new ArrayList<>();
    }

    //메뉴 추가 메서드
    public void addMenu(Menu menu) {
        this.menus.add(menu);
    }

    //Getter 메서드: 메뉴 리스트 반환
    public List<Menu> getMenus() {
        return menus;
    }

    //Setter 메서드: 메뉴 리스트 설정
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    //프로그램 시작 메서드
    public void start() {
        //Scanner 선언
        Scanner sc = new Scanner(System.in);
        int userInput;

        while (true) {
            //메인 메뉴판 제시
            printMainMenu();

            //메뉴 입력 처리
            userInput = getUserInput(sc, "메뉴 번호를 선택하세요 (종료: 0): ");

            if (userInput == 0) break;

            //유저가 선택한 메뉴 출력 또는 프로그램 종료(입력된 숫자에 따른 처리)
            if (userInput > 0 && userInput <= menus.size()) {
                Menu selectedMenu = menus.get(userInput - 1);
                handleMenuSelection(sc, selectedMenu);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //구분선 출력
                printSeparator();
            }
        }

        //프로그램 종료
        System.out.println("키오스크 프로그램을 종료합니다. 이용해 주셔서 감사합니다!");
        sc.close();
    }

    //메인메뉴 출력 메서드
    private void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d. %s%n", (i + 1), menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");
    }

    //유저 입력 처리 메서드
    private int getUserInput(Scanner sc, String prompt) {
        int userInput = -1; //userInput 변수를 음수로 초기화하여 루프가 처음에 실행되도록 함

        while (true) {
            System.out.print(prompt); //유저에게 입력 요청
            try {
                userInput = sc.nextInt(); //유저 입력
                break;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //잘못된 입력값 버퍼에서 제거
                sc.nextLine();
                //구분선 출력
                printSeparator();
                // 메뉴판 다시 제시
                printMainMenu();
            }
        }
        //정상적인 입력 반환
        return userInput;
    }

    //서브메뉴 선택 처리 메서드
    private void handleMenuSelection(Scanner sc, Menu menu) {
        int userInput;

        while (true) {
            //선택된 메뉴 출력
            printSubMenu(menu);

            //서브메뉴 입력 처리
            userInput = getUserInput(sc, "메뉴 번호를 선택하세요 (뒤로가기: 0): ");

            if (userInput == 0) break;

            //유효한 메뉴 번호 입력 처리
            if (userInput > 0 && userInput <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(userInput - 1);
                System.out.println("선택한 메뉴: " + selectedItem);
                //구분선 출력
                printSeparator();
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //구분선 출력
                printSeparator();
            }
        }
    }

    //서브 메뉴 출력 메서드
    private void printSubMenu(Menu menu) {
        System.out.printf("[ %s MENU ]%n", menu.getCategoryName());
        menu.printMenuItems();
    }

    //구분선 출력 메서드
    private void printSeparator() {
        System.out.println("-".repeat(70));
    }
}
