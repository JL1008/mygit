

import java.util.Scanner;

public class ZhuanZhi23 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������N");
		int N=sc.nextInt();
		System.out.println("����������"+N+"*"+N+"�����ÿ��ֵ");
		int[][] a=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ԭ����Ϊ:");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("ת�ú����Ϊ:");
		for(int i=N-1;i>=0;i--)
		{
			for(int j=N-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
			
		}
		

	}


