package helllo;

public class yang {
	public static void main(String[] args){
		int k=2;
		int[] tem=new int[k];
		tem[0]=tem[k-1]=1;
		int row=10;
		for (int n=1;n<row;n++){
			int[] aee=new int[n];
			if(n==2||n==1){
				aee[0]=aee[n-1]=1;
			}
			else{
				for(int i=0;i<n;i++){
					if(i==0||i==n-1){
						aee[0]=aee[n-1]=1;
					}
					else{
						aee[i]=tem[i-1]+tem[i];
					}
				}	
			}
			for(int a=0;a<row-n;a++){
				System.out.print(" ");
			}
			k++;
			tem=new int[k];
			for(int x=0;x<n;x++){
				tem[x]=aee[x];
				System.out.format("%4d",tem[x]);
				//System.out.print(tem[x]+"  ");
			}
			System.out.println();
			
		}
	}

}
