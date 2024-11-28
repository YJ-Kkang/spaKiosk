package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        int userInput = -1; //userInput 변수를 음수로 초기화하여 루프가 처음에 실행되도록 함

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (userInput != 0) {
            //메뉴판 제시
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");

            //메뉴 입력
            try {
                //유저 입력
                userInput = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //구분선 출력
                System.out.println("-".repeat(70));
                // 잘못된 입력값 버퍼에서 제거
                sc.nextLine();
                continue;
            }
            //유저가 음수를 입력하는 경우
            if (userInput < 0) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                //구분선 출력
                System.out.println("-".repeat(70));
                continue;
            }

            //유저가 선택한 메뉴 출력 또는 프로그램 종료(입력된 숫자에 따른 처리, 프로그램 종료)
            if (userInput > 0 && userInput <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(userInput - 1);
                System.out.println("선택한 메뉴: " + selectedItem);
            } else if (userInput == 0) {
                System.out.println("키오스크 프로그램을 종료합니다. 이용해 주셔서 감사합니다!");
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
            //구분선 출력
            System.out.println("-".repeat(70));
        }
    }
}