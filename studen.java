package student;

public class studen {
	private  static  int[]  id=new int[30];
	private static  String[] stname=new String[30];
	private static  String[] cj=new String[30];
	public static  int  i=0;

	
	public static void studens(){
		for(int s=0;s<30;s++){
			id[s]=0;
			stname[s]=" ";
			cj[s]=" ";
		}
	}
	public static String name(int s,String a,String c){
		String out="���ʧ�ܣ�";
		id[i]=s;stname[i]=a;
		cj[i]=c;
		i=i+1;
		out ="��ӳɹ���";
		return out;
	}
	public static  String  cha(int s){
		String out ="";
		for(int j=0;j<i;j++){
			if(id[j]==s){
				out= "ѧ�ţ�"+id[j]+"������"+stname[j]+" �ɼ���"+cj[j];
			}
			else{
				out="�޴�ѧ��";
			}
		}
		return out;
	}		
public static  String shan(int s){
	String out ="ɾ��ʧ�ܣ�";
	for(int j=0;j<i;j++){
		if(id[j]==s){
			for(int s1=j;s1<i;s1++){
				id[s1]=id[s1+1];
				stname[s1]=stname[s1+1];
				cj[s1]=cj[s1+1];
			}
			i--;
			out="ɾ���ɹ���";
		}
		
	}
	return out;	
	}
	public static String chengji(){
		String out ="<html><body>";
		if(i==0){
			out="��ǰ��ѧ����";
		}
		else{
		for(int j=0;j<i;j++){
			
			out= out+"ѧ�ţ�"+id[j]+"������"+stname[j]+" �ɼ���"+cj[j]+"<br>";
			
		}
		}
		out=out+"</body></html>";
		return out; 
	 }
	
	}


