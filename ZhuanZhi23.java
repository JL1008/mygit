

import java.util.Scanner;

public class ZhuanZhi23 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数N");
		int N=sc.nextInt();
		System.out.println("请依次输入"+N+"*"+N+"矩阵的每个值");
		int[][] a=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("原矩阵为:");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("转置后矩阵为:");
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


