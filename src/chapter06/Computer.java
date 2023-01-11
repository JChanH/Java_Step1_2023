package chapter06;

public class Computer {

	int sum1(int[] values) { //배열을 넣음
		int sum = 0; //누적을 위헤 합계를 0으로 만들어 주고

		for (int i = 0; i < values.length; i++) { //배열의 길이만큼 반복
			sum += values[i]; //sum에 누적해준다
		}
		return sum; // sum을 뱉어낸다

	}

	int sum2(int ... values){//값을 계속 누적시키는 경우  (int i = 0; i < values.length; i++)와 동일하다

	
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum; // sum을 뱉어낸다

	}

}
