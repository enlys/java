package helllo;

public class jaingjuan {
	public static void main(String[] args){
		int ss=0;
		int bb=0;
		for(int i=10000;i<100000;i++){
			/*int a=i/10000;
			int b=(i/1000)/10;
			int c=(i/100)/100;
			int d=(i%100)/10;
			int e=i%10;
			boolean f=py(a,b,c,d,e);
			if(f){
				ss=ss+1;
			}else{
				bb=bb+1;
			}*/
			int z=i;
			while(z>0){
				int a=z%10;
				if(a==4){
					ss++;
					break;
				}
				z=z/10;
				
			}
		}
		bb=90000-ss;
		System.out.println(ss+" "+bb);
		
	}
	public static boolean py(int a,int b,int c,int d,int e){
		boolean aa=false;
		if(a==4){
			aa=true;
		}else{
			if(b==4){
				aa=true;
			}else{
				if(c==4){
					aa=true;
				}else{
					if(d==4){
						aa=true;
					}else{
						if(e==4){
							aa=true;
						}else{
							aa=false;
						}
						
					}
				}
			}
		}
		return aa;
		
	}

}
