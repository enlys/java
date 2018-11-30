package qiao;

public class fanhui {
	public static void main(String[] args){
		int s=0;
		int z=1;
		for(int i=1;i<1000;i++){
			s=s+z;
			z=z+2;
			if(s>=108){
				System.out.println(i);
				break;
			}
		}
	}

}
