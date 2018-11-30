package qiao;

public class xinyunshuzi {
	public static void main(String[] args) {
		long MAX =  59084709587505l;
		int count = 0;
		for ( long i = 0; Math.pow(3,i) < MAX; i++)
			for ( long j = 0; Math.pow(5,j) < MAX; j++)
				for ( long k = 0; Math.pow(7,k) < MAX; k++)
					if (Math.pow(3,i) * Math.pow(5,j) * Math.pow (7,k) < MAX )
						{count ++;
						}
					else{
							
						break;
					}
		System.out.println(count);		
	}


}
