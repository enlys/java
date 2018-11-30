package helllo;

public class sort {
	public static void main(String[] args){
		int[] arr={2,5,3,1,4,9,6,8,7};
		int[] ar=new int[20];
		ar[0]=1;
		System.out.print(ar[0]+" ");
		int temp;
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		   
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			System.out.print(ar[i]+" ");
		}
	}

}
