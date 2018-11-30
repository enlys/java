package helllo;

public class shengri {
public static void main(String[] args){
	int ss=0;
	int[] ae=new int[60];
	for(int i=0;i<60;i++){
		ae[i]=i+1;
	}
	for(int i=0;i<30;i++){
		for(int j=i;j<60;j++){
			ss=ss+ae[j];
			if(ss==236){
				System.out.println(i+1);
				System.out.println(j+1);
			}
		
		}
		ss=0;
	}
}
}
