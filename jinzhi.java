package helllo;
import java.util.*;
public class jinzhi {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("输入需要转换的十进制数：");
		int n=read.nextInt();
		int k=0;
		int[] aee=new int[9999];
		if(n==0){
			System.out.println("转换后的十六进制数为："+n);
		}
		else{
			while(n>0){
				aee[k++]=n%16;
				n=n/16;
			}
			System.out.println("转换后的十六进制数为：");
			for(int i=k-1;i>=0;i--){
				System.out.print(dy(aee[i]));
			}
		}
		
	}
	public static char dy(int n){
		switch(n)
	    {
	        case 0:return '0';
	        case 1:return '1';
	        case 2:return '2';
	        case 3:return '3';
	        case 4:return '4';
	        case 5:return '5';
	        case 6:return '6';
	        case 7:return '7';
	        case 8:return '8';
	        case 9:return '9';
	        case 10:return 'A';
	        case 11:return 'B';
	        case 12:return 'C';
	        case 13:return 'D';
	        case 14:return 'E';
	        case 15:return 'F';
	    }
		return 0;

		
	}

}
