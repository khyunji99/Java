package example.demensionArray;

public class DemensionArray {
	public void testDemensionArray() {
		//2차원 배열 선언
		int[][]arr;
		int[] arr2[];
		int arr3[][];
		
		//2차원 배열 할당 : new 연산자를 통해 heap영역에 공간 생성
		arr = new int[3][5];
		
		//열의 크기 생략 가능
		// 각 행마다 다른 열의 개수를 가지고 싶을 때 : 가변 배열
		arr2 = new int[2][];
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		
		//2차원 배열에 직접 값 접근
		System.out.println(arr); // arr의 주소값
		System.out.println(arr[0]); // arr[0]의 주소값
		System.out.println(arr[0][0]); // 실제 값에 접근
		
		//2차원 배열 초기화
		int num = 1;
		for(int i = 0; i < arr2.length; i++) { // i = 0. 1 (행)
			for(int j = 0; j < arr2[i].length; j++) { // j (열)
				//arr2 : 가변배열 이므로 arr2[0]은 0,1,2,3열
				//arr2[1]은 0,1열
				arr2[i][j] = num++;
			}
		}
		//2차원 배열 출력
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " "); // " " : 각각의 값 사이에 띄어쓰기
			}
			System.out.println(); // 개행 : 1행과 2행을 줄바꿔서 출력하게 된다.
		}
		
		
	}
	
	
	
	
}
