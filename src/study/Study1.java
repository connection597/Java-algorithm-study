//연습 문제 1. 1부터 n까지 정수 합구하기

package study;

import java.util.Scanner;

public class Study1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다");
		System.out.println("n의 값:");
		int n = sc.nextInt(); //정수값 얻어내기
		
		int sum =0; //합
		for(int i=0; i<=n; i++) {
			sum +=i; //sum에 i를 더합니다
			System.out.println("1부터"+n+"까지 합은"+sum+"입니다");
		}

	}

}
