package javaBasic2.ch05.sec03;

public class �迭���� {

	public static void main(String[] args) {
		// �迭 : ������ �ڷ���� ����, �����ؼ� ����Ǿ� �ִ�.
		// �迭 ���� ����? ���� 100���� ����ؾ��Ѵٸ� ���� 100���� ������ ��
		// �迭 ����� ���? 1���� 2���� 3����
		
		int[] arr = new int[] {1,2,3,4,5};
		String[] sArr = new String[] {"a","b"};
		double[] dArr = new double[] {1.1,2.2,3.3};
		boolean[] bArr = new boolean[] {true,false};
		
		byte[] byArr = new byte[] {1,2,3};
		short[] shArr = new short[] {6,7};
		float[] fArr= new float[] {1.1f,2.2f};
		
		//arr �迭�� [0]�� �� 1�� ����Ϸ���
		System.out.println(arr[0]);
		//"b"����ϱ�
		System.out.println(sArr[1]);
		//3.3 ����ϱ�
		System.out.println(dArr[2]);
		//arr�迭�� [0] ��1�� 10���� ����
		arr[0] = 10;
		
		//���2) �� �迭�� ����� ���߿� ���� �ֱ�
		int[] iArr = new int[3];
		double[] doubleArr = new double[5];
		
		iArr[0] = 3;
		iArr[1] = 5;
		iArr[2] = 7;
		
		//���ڿ� 4���� �ִ� �迭 ����� 
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
		
		int[] iArr3 = null; //null ���ڴ� �ּҰ� �������Ǿ��ִ�
		
		int[] score = new int[] {100,90,87,85,65};
		int sum=0;
		for(int i=0;i<5;i++) {
			sum += score[i];
		};
		int avg = sum/5;
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + avg);
		
		//�迭�� ���� �迭��.length
		System.out.println(score.length);
		
//		score[5]=60;
//		score[6]=90;
		
		//168
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//�迭�� �׸��б�
		System.out.println("Season[0] :"+ season[0]);
		System.out.println("Season[1] :"+ season[1]);
		System.out.println("Season[2] :"+ season[2]);
		System.out.println("Season[3] :"+ season[3]);
		
		season[1] = "����";
		System.out.println("Season[1] :"+ season[1]);
		System.out.println();
		
		int[] scores = {83,90,87};
		
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : "+sum1);
		double avrg =(double) sum1/3;
		System.out.println("��� :" + avrg);
		
		String[] names = new String[30];
		System.out.println(names.length);
		
		//names.length = 25;
		
		//����ǥ �����
		//�̸� ����
		//ȫ�浿 100
		//����� 90
		//�̰��� 86
		
		//1���� �迭�� 
		
		String[] names2 = {"ȫ�浿", "�����","�̰���"};
		int[] scores2 = {100,90,86};
		
		for(int i=0;i<names2.length;i++) {
			System.out.println(names2[i]+"   "+scores2[i]);
		}
		
		//�ڵ��� �Ǹ���Ȳ �迭�� �־ ���
		
		String[] ���� = {"�̹���","����ö","���ẹ","�ξֶ�"};
		int[] loan = {27000000,15000000,15000000,12000000};
		int[] period = {48,60,60,60};
		int sumloan = 0;
		int mthly = 0;
		
		System.out.println(" ���� | �������� | ����ݾ� | �Ⱓ | ����ȯ�� ");
		
		for(int i = 0 ; i <����.length;i++) {
			System.out.println(����[i]+" "+"�����ڱݴ���"+" "+loan[i]+" "+period[i]+"     "+loan[i]/period[i]);
		sumloan = sumloan + loan[i];
		mthly=mthly+loan[i]/period[i];
		}
		System.out.println("�����հ�� "+ sumloan);
		System.out.println("�� ��ȯ�� �հ��" + mthly);
		//�� ��ȯ�� = ����Ⱓ/�ݾ�
		
		//����ݾ� �հ踦 ���Ͻÿ�. �� ��Ȳ���� ���� ���Ͻÿ�
		
		//�μ� ������ �迭�� ��Ƽ� ����ϱ�
		String[] en = {"J0001","J0003","J0008","J0009"};
		String[] names3 = {"ȫ�浿","�̵���","�ѹ̿�","������"};
		String[] dpt= {"�ѹ���","������","�λ��","������"};
		boolean[] gender = {true, true,true,true};
		
		
		System.out.println(" ��� | �̸� | �μ� | ���� |");
		
		for (int i=0;i<en.length;i++) {
			System.out.println(en[i]+" "+names3[i]+" "+dpt[i]+"   "+(gender[i]? "��":"��"));
		}
		for (int i=0;i<dpt.length;i++) {
			if(dpt[i].equals("�ѹ���")) {
				System.out.println(names3[i]);
			}
		}
		
		
		
	}
}
