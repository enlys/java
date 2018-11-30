package qiao;

public class houzi {
	public static void main(String[] args){
		for(int i=20;i<11000;i++){
			float f=(float)i;
			for(int j=1;j<5;j++){
				f=f-j-(f-j)/(float)(5.0);
			}
			if(f%5==0){
				System.out.println(i);
				break;
			}
		}
	}

}
