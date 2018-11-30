package qiao;

public class abcdef {
	public static void main(String[] args){
		String[] arr={"a","b","c","d"};
		String[][] aee={
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"},
				      {"a","b","c","d","e","f","g"}};
		int sum=0;
		for(int i=0;i<7;i++){
				for(int j=0;j<4;j++){
					if(aee[i][j]==arr[0]){
						boolean ss=false;
						boolean aa=false;
						for(int d=0;d<4;d++){
							if(aee[i][j+d]==arr[d]){
								ss=true;
							}else{
								ss=false;
							}
						}
						if(ss==true){
							sum++;
						}
					}
				}
				}
		System.out.println(sum);
	}

}
