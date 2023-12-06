package javaBasic2.ch05.sec03;

public class 배열연습 {

	public static void main(String[] args) {
		// 배열 : 동일한 자료들의 집합, 연속해서 저장되어 있다.
		// 배열 쓰는 이유? 정수 100개를 기억해야한다면 변수 100개를 만들어야 함
		// 배열 만드는 방법? 1차원 2차원 3차원
		
		int[] arr = new int[] {1,2,3,4,5};
		String[] sArr = new String[] {"a","b"};
		double[] dArr = new double[] {1.1,2.2,3.3};
		boolean[] bArr = new boolean[] {true,false};
		
		byte[] byArr = new byte[] {1,2,3};
		short[] shArr = new short[] {6,7};
		float[] fArr= new float[] {1.1f,2.2f};
		
		//arr 배열의 [0]의 값 1을 출력하려면
		System.out.println(arr[0]);
		//"b"출력하기
		System.out.println(sArr[1]);
		//3.3 출력하기
		System.out.println(dArr[2]);
		//arr배열의 [0] 값1을 10으로 변경
		arr[0] = 10;
		
		//방법2) 빈 배열을 만들고 나중에 값을 넣기
		int[] iArr = new int[3];
		double[] doubleArr = new double[5];
		
		iArr[0] = 3;
		iArr[1] = 5;
		iArr[2] = 7;
		
		//문자열 4개를 넣는 배열 만들기 
		String[] stArr = new String[4];
		stArr[0] = "a";
		stArr[1] = "b";
		stArr[2] = "c";
		stArr[3] = "d";
		
		int[] iArr2 = new int[100];
		for (int a=0;a<100;a++) {
			iArr2[a]=a+1;
		}
		for (int a=0;a<100;a++) {
		System.out.println(iArr2[a]);
		}
		
		int[] iArr3 = null; //null 문자는 주소가 미지정되어있다
		
		int[] score = new int[] {100,90,87,85,65};
		int sum=0;
		for(int i=0;i<5;i++) {
			sum += score[i];
		};
		int avg = sum/5;
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + avg);
		
		//배열의 길이 배열명.length
		System.out.println(score.length);
		
//		score[5]=60;
//		score[6]=90;
		
		//168
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 항목값읽기
		System.out.println("Season[0] :"+ season[0]);
		System.out.println("Season[1] :"+ season[1]);
		System.out.println("Season[2] :"+ season[2]);
		System.out.println("Season[3] :"+ season[3]);
		
		season[1] = "여름";
		System.out.println("Season[1] :"+ season[1]);
		System.out.println();
		
		int[] scores = {83,90,87};
		
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : "+sum1);
		double avrg =(double) sum1/3;
		System.out.println("평균 :" + avrg);
		
		String[] names = new String[30];
		System.out.println(names.length);
		
		//names.length = 25;
		
		//성적표 만들기
		//이름 점수
		//홍길동 100
		//김수진 90
		//이경주 86
		
		//1차원 배열로 
		
		String[] names2 = {"홍길동", "김수지","이경주"};
		int[] scores2 = {100,90,86};
		
		for(int i=0;i<names2.length;i++) {
			System.out.println(names2[i]+"   "+scores2[i]);
		}
		
		//자동차 판매현황 배열에 넣어서 출력
		
		String[] 성명 = {"이민주","남지철","김춘복","민애라"};
		int[] loan = {27000000,15000000,15000000,12000000};
		int[] period = {48,60,60,60};
		int sumloan = 0;
		int mthly = 0;
		
		System.out.println(" 성명 | 대출종류 | 대출금액 | 기간 | 월상환액 ");
		
		for(int i = 0 ; i <성명.length;i++) {
			System.out.println(성명[i]+" "+"주택자금대출"+" "+loan[i]+" "+period[i]+"     "+loan[i]/period[i]);
		sumloan = sumloan + loan[i];
		mthly=mthly+loan[i]/period[i];
		}
		System.out.println("대출합계는 "+ sumloan);
		System.out.println("월 상환액 합계는" + mthly);
		//월 상환액 = 대출기간/금액
		
		//대출금액 합계를 구하시오. 월 상황액의 합을 구하시오
		
		//부서 정보를 배열에 담아서 출력하기
		String[] en = {"J0001","J0003","J0008","J0009"};
		String[] names3 = {"홍길동","이도현","한미우","박정진"};
		String[] dpt= {"총무부","영업부","인사부","영업부"};
		boolean[] gender = {true, true,true,true};
		
		
		System.out.println(" 사번 | 이름 | 부서 | 성별 |");
		
		for (int i=0;i<en.length;i++) {
			System.out.println(en[i]+" "+names3[i]+" "+dpt[i]+"   "+(gender[i]? "남":"여"));
		}
		for (int i=0;i<dpt.length;i++) {
			if(dpt[i].equals("총무부")) {
				System.out.println(names3[i]);
			}
		}
		
		
		
	}
}
