package world;
import java.util.*;
public class tangguo {
	public static void main(String[] args){
		Scanner aa=new Scanner(System.in);
		System.out.println("请输入糖果个数：");
		int n=aa.nextInt();
		int sum=0;
		while(true){
			int x=(int)Math.sqrt(n);
			sum=sum+x;
			n=n-2*x;
			if(n<=3){
				break;
			}
		}
		System.out.println(sum);
	}

}
