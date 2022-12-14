package practice.comprehensive;

import java.util.Scanner;

public class ComprehensivePractice {

	public void method1() {
		// 빙고게임
		/*
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("빙고판 크기 지정: ");
			int[][] arr = new int[sc.nextInt()][sc.nextInt()];
			System.out.println("===== 빙고 게임 시작 =====");
			int i;
			int j;
			for(i = 0; i < arr.length < i++) {
				for(j = 0; j < arr[sc.nextInt()].length; j++) {
					arr[i][j] = (int)(Math.random() * 20 + 1);
					System.out.println(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.print("숫자 선택: ");
			int num = sc.nextInt();
			if(arr[i][j] == num) {
				arr[i][j] = 0;
			}
			
			if(arr[i][j] == 0) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("빙고판 크기 지정: ");
		int len = sc.nextInt();
		
		// 일차원 배열로 중복 값 제거한 후 이차원 배열 대입
		int[] temArr = new int[len*len];
		
		//랜덤 값 대입 후 중복 비교 (중복 된 값은 제거)
		for(int i = 0; i < temArr.length; i++) {
			temArr[i] = (int)(Math.random() * (len*len)) + 1;
			// 중복 값 발생하면 i--
			// 즉 i+1로 진행하지 않고 다시 i에 랜덤 값 대입 후 중복 비교
			for(int j = 0; j < i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 중복 값 제거가 잘 되어있는지 일차원 배열 출력
		//System.out.println(Arrays.toString(temArr));
		
		// 일차원 배열 -> 이차원 배열
		int[][] arr = new int[len][len];		
		int index = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				arr[i][j] = temArr[index++];
			}
		}
		
		
		System.out.println("======= 빙고 게임 시작 ========");
		
		// 빙고판 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 모든 자리가 0이 될때까지 무한반복
		while(true) {
			System.out.print("숫자 선택 : ");
			int num = sc.nextInt();
			
			//선택한 숫자를 0으로 바꾼 뒤 출력
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[i][j] == num) {
						arr[i][j] = 0;
					}
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
			// 게임 종료 조건 확인
			boolean flag = false;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] != 0)
						flag = true;
				}
			}
			
			// 모든 칸이 0이면 게임 종료
			if(flag == false)
				break;
			
		}
		
		System.out.println("빙고완성!!");
		System.out.println("====== 빙고게임 종료 ======");
		
	}
	
	
	
	public void method2() {
		// 빙고게임 업그레이드
		
		Scanner sc = new Scanner(System.in);
		System.out.print("빙고판 크기 지정: ");
		int len = sc.nextInt();
		
		// 일차원 배열로 중복 값 제거한 후 이차원 배열 대입
		int[] temArr = new int[len*len];
		
		//랜덤 값 대입 후 중복 비교 (중복 된 값은 제거)
		for(int i = 0; i < temArr.length; i++) {
			temArr[i] = (int)(Math.random() * (len*len)) + 1;
			// 중복 값 발생하면 i--
			// 즉 i+1로 진행하지 않고 다시 i에 랜덤 값 대입 후 중복 비교
			for(int j = 0; j < i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 중복 값 제거가 잘 되어있는지 일차원 배열 출력
		//System.out.println(Arrays.toString(temArr));
		
		// 일차원 배열 -> 이차원 배열
		int[][] arr = new int[len][len];		
		int index = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				arr[i][j] = temArr[index++];
			}
		}
		
		
		System.out.println("======= 빙고 게임 시작 ========");
		
		// 빙고판 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 모든 자리가 0이 될때까지 무한반복
		while(true) {
			System.out.print("숫자 선택 : ");
			int num = sc.nextInt();
			
			//선택한 숫자를 0으로 바꾼 뒤 출력
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[i][j] == num) {
						arr[i][j] = 0;
					}
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			
			// 3빙고이면 게임 종료
			int bingoCnt = 0;
			int crossCnt1 = 0; // 왼쪽 위에서 오른쪽 아래로
			int crossCnt2 = 0; // 오른쪽 위에서 왼쪽 아래로 대각선
		
		
			for(int i = 0; i < arr.length; i++) {
				int colCnt = 0;
				int rowCnt = 0;
				for(int j = 0; j < arr[i].length; j++) {
					// 가로
					if(arr[i][j] == 0) {
						rowCnt++;
					}
					// 세로
					if(arr[j][i] == 0) {
						colCnt++;
					}
					// 왼쪽에서 오른쪽 아래로 대각선
					if(i == j && arr[i][j] == 0) {
						crossCnt1++;
					}
					// 오른쪽에서 왼쪽 아래로 대각선
					if((i + j == len - 1) && arr[i][j] == 0) {
						crossCnt2++;
					}
				}
				// 가로 한줄이 모두 0이면 빙고
				if(rowCnt == len) {
					bingoCnt++;
				}
				// 세로 한줄이 모두 0이면 빙고
				if(colCnt == len) {
					bingoCnt++;
				}
				
			}
			
			// 왼쪽에서 오른쪽 아래로 대각선이 모두 0이면 빙고
			if(crossCnt1 == len) {
				bingoCnt++;
			}
			// 오른쪽에서 왼쪽 아래로 대각선이 모두 0이면 빙고
			if(crossCnt2 == len) {
				bingoCnt++;
			}
			
			// 빙고가 3개이면 게임 종료
			if(bingoCnt == 3) {
				break;
			}
			
		}
		
		System.out.println("빙고완성!!");
		System.out.println("======= 빙고게임 종료 =======");
		
		
	}
	
	
	
	
	
	
	
}

