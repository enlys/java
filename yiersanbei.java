package helllo;

public class yiersanbei {
	public static void main(String[] args){
		int[] aa=new int[10];
		int[] num=new int[3];
		
		for(int i=123;i<333;i++){
			for(int j=0;j<10;j++){
				aa[j]=0;
			}
			int ss=i;
			for(int n=0;n<3;n++){
				num[n]=ss+ss*n;
				int zz=num[n];
				while(zz>0){
					aa[zz%10]++;
					zz=zz/10;
				}	
			}
			boolean xx=true;
			for(int d=0;d<10;d++){
				if(aa[d]>1||aa[0]==1){
					xx=false;
					break;
				}
				else{
					xx=true;
				}
			}
			if(xx==true){
				System.out.println(num[0]+" "+num[1]+" "+num[2]);
				
				
			}
		}
	}


}
