package qsort;

import java.util.Scanner;

public class MergeSort {
	
	void MergeArr(int a[],int l, int mid, int r, int temp[]){
		
		int i=l, j=mid+1;
		int m=mid, n=r;
		int k=0;
		while(i <= m && j <=n){
			if(a[i] <= a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		
		while(i <= m)
			temp[k++] = a[i++];
		while(j <= n)
			temp[k++] = a[j++];
		
		for(i=0; i<k; i++){
			a[l+i] = temp[i];
		}
		return ;
	}
	
	void MSort(int a[], int l, int r, int temp[]){
		if(l < r){
			int mid=(l+r)/2;
			MSort(a,l,mid,temp);
			MSort(a,mid+1,r,temp);
			MergeArr(a,l,mid,r,temp);
		}
	}
	
	public static void main(String [] args){
		int[] a=new int[10];
		int[] temp=new int[10];
		Scanner sc = new Scanner(System.in);  
		for(int i=0; i<10; i++){
			a[i] = sc.nextInt();
		}
		new MergeSort().MSort(a, 0, 9,temp);
		for(int i=0; i< 10; i++){
			System.out.print(a[i]+" ");
		}
	}
}
