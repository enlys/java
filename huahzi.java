package helllo;
import java.util.*;
public class huahzi {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("输入需要转化的数：");
		String n=read.nextLine();
		long aa=Long.parseLong(n,16);
		System.out.println(aa);
		System.out.println("输入需要转化的数：");
		int a=read.nextInt();
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toBinaryString(a));
	}

}
