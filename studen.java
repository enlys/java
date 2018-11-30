package helllo;

public class studen {
	private  static  String[]  id=new String[30];
	private static  int[] stname=new int[30];
	public static int i=0;

	
	public static void studens(){
		for(int i=0;i<30;i++){
			id[i]=" ";
			stname[i]=0;
		}
	}
	public static void name(String s,int a){
		
		id[i]=s;stname[i]=a;
		i++;
	}
	public static  void  cha(String a){
		for(int j=0;j<i;j++){
			if(id[j]==a){
				System.out.println("chaxujieguo:"+id[j]+" "+stname[j]);
			}
		}
	}
	
		
public static  void shan(String s){
	for(int j=0;j<i;j++){
		if(id[j]==s){
			for(int s1=j;s1<i;s1++){
				id[s1]=id[s1+1];
				stname[s1]=stname[s1+1];
			}
			i--;
		}
	}
		
		
	}
	public static void chengji(){
		for(int j=0;j<i;j++){
			
			 
			 System.out.println(id[j]);
			 System.out.println(stname[j]); 
		}
		
		
		
		 
	 }
	
	}


