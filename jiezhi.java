package world;
import java.util.*;
public class jiezhi {
public static void main(String[] args){
	Scanner aa=new Scanner(System.in);
	System.out.println("数量和质量：");
	int n=aa.nextInt();
	int m=aa.nextInt();
	int[] zz=new int[n];
	double[] arr=new double[n];
	System.out.println("输入各种价值：");
	for(int i=0;i<n;i++){
		zz[i]=aa.nextInt();
		int y=aa.nextInt();
		arr[i]=y/zz[i];
		
	}
	for(int i=n;i>0;i--){
		double tem;
		int temp;
		for(int j=0;j<n-1;j++){
			if(arr[j]<arr[j+1]){
				temp=zz[j];
				zz[j]=zz[j+1];
				zz[j+1]=temp;
				tem=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;
				
			}
		}
		
	}
	for(int l=0;l<n;l++){
		System.out.println(zz[l]+"  "+arr[l]);
		
	}
	double jz=0;
	int ss=0;
	
	for(int g=0;g<n;g++){
		ss=ss+zz[g];
		if(m<=ss){
			System.out.println(g);
			for(int w=0;w<g;w++){
				
					jz=jz+zz[w]*arr[w];
					m=m-zz[w];
			
					
				}
			jz=jz+m*arr[g];
			System.out.format("%.2f",jz);break;
			}
			
		}
		
	}
	
} 


