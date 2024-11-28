package Lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //메뉴 데이터 리스트
    private List<MenuItem> menuItems;

    //생성자: 메뉴 리스트 초기화
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //프로그램 시작(start)
    public void start() {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int userInput = -1; //userInput 변수를 음수로 초기화하여 루프가 처음에 실행되도록 함

        while (userInput != 0) {
            //메뉴판 제시
            printMenu();

            //메뉴 입력
            try {
                //유저 입력
                System.out.print("메뉴 번호를 선택하세요 (종료: 0): ");
                userInput = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //구분선 출력
                System.out.println("-".repeat(70));
                // 잘못된 입력값 버퍼에서 제거
                sc.nextLine();
                continue;
            }

            //유저 입력 처리
            handleInput(userInput);
            //구분선 출력
            System.out.println("-".repeat(70));
        }

        System.out.println("키오스크 프로그램을 종료합니다. 이용해 주셔서 감사합니다!");
    }

    // 메뉴판
    private void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료           | 종료");
    }

    //유저 입력 처리
    private void handleInput(int userInput) {
        if (userInput < 0) {
            //음수 입력 처리
            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
        } else if (userInput > 0 && userInput <= menuItems.size()) {
            //유효한 메뉴 번호 입력 처리
            MenuItem selectedItem = menuItems.get(userInput - 1);
            System.out.println("선택한 메뉴: " + selectedItem);
        } else if (userInput != 0) {
            //유효하지 않은 메뉴 번호 입력 처리
            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
        }
    }
}
