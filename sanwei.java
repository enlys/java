package helllo;

public class sanwei {
	public static void main(String[] args){
		int[] aa=new int[10];
		int[] num=new int[2];
		int[] lin=new int[10];
		for(int i=3456;i<30000;i++){
				for(int j=0;j<10;j++){
					aa[j]=0;
				}
				int ss=i;
				for(int n=0;n<2;n++){
					num[n]=ss+ss*n*3;
					int zz=num[n];
					while(zz>0){
						aa[zz%10]++;
						zz=zz/10;
					}	
				}
				boolean qq=true;
				for(int a=0;a<10;a++){
					if(aa[a]>1||aa[0]==1){
						qq=false;
						break;
					}else{
						qq=true;
					}
				}
				if(qq==true){
					System.out.println(num[0]+" "+num[1]);
				}
		}
		
	}


}
