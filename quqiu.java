package world;
import java.util.*;
public class quqiu {
	public static void main(String[] args){
		Scanner aa=new Scanner(System.in);
		System.out.println("输入一个数");
		int n=aa.nextInt();
		int[] as=new int[n]; 
		System.out.println("输入一个初始位数");
		for( int i=0;i<n;i++){
			as[i]=aa.nextInt();
		}
		for(int j=0;j<n;j++){
			if(pick(as[j])==true){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
	}
	public static boolean pick(int s){
		if(s==0){
			return true;
		}
		if(s>=1&&!pick(s-1)){
			return true;
		}
		if(s>=3&&!pick(s-3)){
			return true;
		}
		if(s>=7&&!pick(s-7)){
			return true;
		}
		if(s>=8&&!pick(s-8)){
			return true;
		}
		return false;
	}

}
