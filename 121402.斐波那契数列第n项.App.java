package pac;

import java.util.Scanner;

public class App2 {
	//斐波那契数列第n项
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {			
			System.err.println("请输入你想输出的第几位斐波那契数列？1<=n<=40.");
			int arr[]= {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368};
			int n=scanner.nextInt();
			System.out.println("斐波那契数列第"+n+"为："+arr[n-1]+"\n");
		}
	}
}
