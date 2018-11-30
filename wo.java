package helllo;
import java.util.*;
public class wo {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("输入行数和列数：");
		int n=read.nextInt();
		int m=read.nextInt();
		char[][] aees=new char[n][m];
		for (int i=0;i<n;i++){
			char ax='A';
			for (int j=i;j<m;j++){
				aees[i][j]=ax++;
				
			}
			ax='A';
			for(int x=i-1;x>=0;x--){
				aees[i][x]=++ax;
			}
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(aees[i][j]);
			}
			System.out.println();
		}
	}

}
