import java.util.*;
class Q1{
	static void sort(int[] arr){
		int x=0;
		int temp=0;
		int n=arr.length;
		for(int i=n-1;i>=0;i--){
			//int k=arr[i];
			for(int j=n-2;j>=0+x;j--){
				if(arr[j+1]<arr[j]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
				for(int k=0;k<n;k++){
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}x++;
		}
	}
	/*static void selectsort(int arr[]){
		int n=arr.length;
		for(int i=n-1;i>0;i--){
			int min =i;
			for(int j=i;j>0;j--){
				if(arr[j]<arr[min]){
					
				}
			}
		}
	}*/
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
	}
}