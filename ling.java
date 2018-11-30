package helllo;

public class ling {
public static void main(String[] args){
	for (int i=1;i<7;i++){
		for(int j=1;j<=7-i;j++){
			System.out.print(" ");
		}
		for(int x=1;x<=2*i-1;x++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=2;i<7;i++){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
		}
		for(int x=1;x<(7-i)*2;x++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
