package nike;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//배열에 1~10까지 넣고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i <arData.length; i++) {
//			arData[i]=i+1;
//			System.out.println(arData[i]);
//		}
		//배열에 10~1까지 넣고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i <arData.length; i++) {
//			arData[i]=10-i;
//			System.out.println(arData[i]);
//		}
		//국어,수학,영어,과학,한국사 점수 입력 후 총점, 평균 구하기
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		String[] subjects= {"국어","수학","영어", "과학","한국사"};
		int total=0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(subjects[i]+" : ");
			score[i]=sc.nextInt();
			total+=score[i];
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/score.length);

	}
}
