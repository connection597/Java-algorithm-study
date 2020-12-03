package study;

import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가우스 덧셈 이용");
		System.out.println("n의 값:");
		int n = sc.nextInt();
		int sum =0;
		for(int i =0; i<n; i++) {
			sum +=(i+n-(i-1));
		}
		sum =sum/2;
		System.out.println("1부터"+n+"까지 합은"+sum+"입니다");

	}

}
