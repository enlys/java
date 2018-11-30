package qiao;
import java.util.*;
public class xxxx {
public static void main(String[] args){
	Scanner aa=new Scanner(System.in);
	System.out.println("输入行数和列数：");
	int n =aa.nextInt();
	int m=aa.nextInt();
	String[][] arr=new String[n][n+m];
	for(int i=0;i<n;i++){
		for(int j=0;j<n+m;j++){
			arr[i][j]=" ";
		}
	}
	for(int i=0;i<n;i++){
		for(int j=i;j<m+i;j++){
			arr[i][j]="*";
		}
		for(int c=n-i;c<n+m-i;c++){
			arr[i][c]="*";
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n+m;j++){
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
