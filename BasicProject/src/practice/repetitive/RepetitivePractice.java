package practice.repetitive;

import java.util.Scanner;

public class RepetitivePractice {

	public void method1() {
		// 피라미드 모양 별찍기
		
		// 외부 for문 줄 조건
		for(int i = 0; i < 4; i++) {
			// 내부 for문 칸 조건
			// 공백 출력(3,2,1,0)
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력(1, 3, 5, 7)
			for(int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}
		
	}
	
	
	public void method2() {
		// 마름모 모양 별찍기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 입력: ");
		int odd = sc.nextInt();
		
		//odd 가 7이라면?
		// 상단부(피라미드) 0~2행
		for(int i = 0; i < odd / 2; i++) {
			// 공백 출력 (3,2,1)
			for(int j = odd / 2; j > i ; j--) {
				System.out.print(" ");
			}
			// 별 출력(1, 3, 5)
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}
		
		// 하단부(역피라미드) 3~6행
		for(int i = odd/2; i >=0; i--) {
			// 공백 출력(0,1,2,3)
			for(int j = odd / 2; j > i; j--) {
				System.out.print(" ");
			}
			// 별 출력 (7, 5, 3, 1)
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// 개행
			System.out.println();
		}
		
	}
	
	
	
	
	public void method3() {
		// 문제 3 : 문자열 무한반복 입력

		/*Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력: ");
			String str = sc.next();
			
			if(str != "stop") {
				System.out.println(str);
			}
			else {
				break;
			}
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String result = ""; // 최종적으로 출력할 결과물
		while(true) {
			System.out.print("문자열 입력: ");
			String str = sc.nextLine();
			if(str.equals("stop")) {
				System.out.println("결과: " + result);
				break;
			}
			// str이 stop이 아닌경우 결과 출력해줘야함
			result += str + " "; // "" : 띄어쓰기
			System.out.println("결과: " + result);
		}
		
		
	}
	
	public void method4() {
		// 문제 4: 카페 주문 프로그램
		/*Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("======== 메뉴 ========");
		System.out.println("1. 아메리카노    3500원");
		System.out.println("2. 카페라떼      4100원");
		System.out.println("3. 바닐라라떼    3500원");
		System.out.println("=====================");
		System.out.println("메뉴 선택 : ");
		int num1 = sc.nextInt();
		System.out.println("수량 선택 : ");
		int num2 = sc.nextInt();
		System.out.println("추가 주문하시겠습니까?(y/n): ");
		String st = sc.nextLine();
		
		if(st == "n") {
			break;
		}
		else {
			
		}
		}
		System.out.println("====================");*/
		
		Scanner sc = new Scanner(System.in);
		
		// 메뉴별 주문량
		int ameri = 0;
		int latte = 0;
		int vanilla = 0;
		
		
		// 무한반복
		while(true) {
			// 메뉴 출력
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 아메리카노  3500원");
			System.out.println("2. 카페라떼    4100원");
			System.out.println("3. 바닐라라떼  4300원");
			System.out.println("===================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.print("수량 선택 : ");
			int amount = sc.nextInt();
			
			switch(menu) {
			case 1:
				ameri += amount;
				break;
				
			case 2:
				latte += amount;
				break;
				
			case 3:
				vanilla += amount;
				break;
				
				default:
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
					continue;
			}
			System.out.print("추가 주문 하시겠습니까? (Y/N) : ");
			char select = sc.next().charAt(0);
			
			if(select == 'N' || select == 'n') {
				System.out.println("====================");
				if(ameri != 0) {
					System.out.println("아메리카노 " + ameri + "잔 : " + 3500 * ameri + "원");
				}
				if(latte != 0) {
					System.out.println("카페라떼 " + latte + "잔 : " + 4100*latte + "원");
				}
				if(vanilla != 0) {
					System.out.println("바닐라라떼 " + vanilla + "잔 : " + 4300 * vanilla + "원");
				}
				System.out.println("====================");
				System.out.println("총액 : " + (3500*ameri + 4100*latte + 4300*vanilla) + "원입니다.");
				break;
				
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
