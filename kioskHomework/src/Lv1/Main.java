package Lv1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            //스캐너 객체 생성
            Scanner sc = new Scanner(System.in);
            int ans = -1; //ans 변수를 음수로 초기화하여 루프가 처음에 실행되도록 함

            //메뉴판 제시
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");

            //반복문 사용해서 연산 반복(ans가 0이 아닌 동안 반복)
            while (ans != 0) {
                //메뉴 입력
                ans = sc.nextInt();

                //유저가 음수를 입력하는 경우
                if (ans < 0) {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    continue;
                }

                //유저가 선택한 메뉴 출력 또는 프로그램 종료
                switch (ans) {
                    case 1:
                        System.out.println("ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                        break;
                    case 2:
                        System.out.println("SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                        break;
                    case 3:
                        System.out.println("Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                        break;
                    case 4:
                        System.out.println("Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                        break;
                    case 0:
                        System.out.println("키오스크를 종료합니다.");
                        break;
                    //유저가 제시된 메뉴 이외의 것을 입력하는 경우
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            }
        }
}

