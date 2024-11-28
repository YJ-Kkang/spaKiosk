# Kiosk Project
스파르타 내일배움캠프 Spring 4기 과제에 사용한 코드입니다. Java를 이용하여 키오스크 프로그램을 구현하였습니다.

<br>

## 🧑‍🏫 프로젝트 소개
- 이 프로젝트는 콘솔 기반의 키오스크 프로그램을 구현합니다.
- 사용자의 입력을 받아 메뉴를 출력하고 선택된 메뉴의 정보를 제공합니다.

<br>

## 🕰️ 개발 기간

\- **2024. 11. 21. (목) ~ 2024. 11. 28. (목)**

\- 공부 기간: 2024. 11. 21. (목) ~ 2024. 11. 24. (일)

\- 개발 기간: 2024. 11. 25. (월) ~ 2024. 11. 28. (목)

<br>

## 🐣 개발자 소개

- 강유진

<img src="https://raw.githubusercontent.com/YJ-Kkang/spa-homework/refs/heads/main/images/yujin.webp" alt="title" width="300"/>

[Git 링크](https://github.com/YJ-Kkang)

[블로그 링크](https://velog.io/@yjkang/posts)


<br>

## 💬 요구 사항 정의
1. **키오스크 기능**
    - 메뉴 표시: 사용자가 선택할 수 있도록 메뉴 표시.
    - 메뉴 선택: 사용자가 메뉴를 선택할 수 있도록 함.
    - 프로그램 종료: 사용자가 프로그램을 종료할 수 있는 기능 제공.

2. **사용자 인터페이스 방식**: 콘솔 기반

3. **예외 처리**
    - 잘못된 입력 처리: 유효하지 않은 메뉴 번호 혹은 숫자가 아닌 값이 입력되었을 때 오류 메시지 출력, 다시 입력을 받음.

<br>

## 📝 설계
1. **클래스 다이어그램**
- `Main`: 시작 지점
- `MenuItem`: 세부 메뉴 속성(메뉴의 이름, 가격, 설명)
- `Kiosk`: 프로그램 순서 및 흐름 제어 담당
- `Menu`: MenuItem 클래스 관리하는 클래스(버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함)

2. **기능 분해**: 주요 기능을 메소드로 분리.
- `printMenu()`: 메뉴를 화면에 출력
- `handleInput()`: 사용자 입력 처리
- `start()`: 프로그램의 메인 루프 실행

3. **데이터 흐름 설계**: 데이터가 클래스 간에 어떻게 흐를지를 결정.
- 입력: 사용자가 콘솔에 메뉴 번호 입력.
- 처리: 입력된 메뉴 번호를 기반으로 메뉴 선택.
- 출력: 콘솔에 메뉴 목록 및 선택한 메뉴의 정보 출력.


<br>

## 🛠 설치 방법
1. Java Development Kit (JDK)를 설치합니다. → [Window](https://teamsparta.notion.site/Window-JDK-f646c4cfdbd34daf81b4315f7abeba1d)    / [Mac](https://teamsparta.notion.site/Mac-JDK-cd42768710404e50a742ce0e187975bf)
2. 이 레포지토리를 클론합니다.
```
bash git clone https://github.com/YJ-Kkang/spaKiosk.git .
```
3. 프로그램을 실행합니다.

<br>

## 🔍 사용 방법
1. 프로그램이 실행되면, 원하는 메뉴의 번호를 입력합니다.
2. 선택된 메뉴의 정보가 출력됩니다.
3. 추가로 메뉴를 선택하려면 계속해서 원하는 메뉴의 번호를 입력합니다.
4. 종료하려면 `0`을 입력합니다.

<br>

## 📚 사용 예시
### Lv 1

![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_1_ex_1.png?raw=true)
![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_1_ex_2.png?raw=true)

<br>

### Lv 2

![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_2_ex_1.png?raw=true)
![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_2_ex_2.png?raw=true)

<br>

### Lv 3

![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_3_ex_1.png?raw=true)
![title](https://github.com/YJ-Kkang/spaKiosk/blob/dev/images/lv_3_ex_2.png?raw=true)

<br>

### Lv 4

![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/b8de93c333e65e8d4febb607fc087b3e26323c25/images/lv_4_ex_1.png)
![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/b8de93c333e65e8d4febb607fc087b3e26323c25/images/lv_4_ex_2.png)
![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/b8de93c333e65e8d4febb607fc087b3e26323c25/images/lv_4_ex_3.png)

<br>

### Lv 5

![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/77d8c8a27a4baa11d20c652c7b7d7d6b5a6cb3d9/images/lv_5_ex_1.png)
![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/77d8c8a27a4baa11d20c652c7b7d7d6b5a6cb3d9/images/lv_5_ex_2.png)
![title](https://raw.githubusercontent.com/YJ-Kkang/spaKiosk/77d8c8a27a4baa11d20c652c7b7d7d6b5a6cb3d9/images/lv_5_ex_3.png)


<br>

## 📨 문의 사항
Yujin Kang - kyujin995@gmail.com

Project Link: https://github.com/YJ-Kkang/spa-homework.git
