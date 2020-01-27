package qsort;

import java.util.Random;
import java.util.Scanner;

class qsort {
	
	qsort(){
	
	}
	private void qsort1(int []a, int l,int r){
//		int x=a[(l+r)/2],i=l,j=r;
//		
//		while(i<=j){
//			while(a[i]<x)
//				i++;
//			while(a[j]>x)
//				j--;
//			if(i<=j){
//				a[i]^=a[j];
//				a[j]^=a[i];
//				a[i]^=a[j];	
//				i++;
//				j--;
//			}
//			
//		}
//		if(i<r)
//			qsort1(a,i,r);
//		if(j>l)
//			qsort1(a,l,j);
		int i,j,x;
	    if(l>r)
	        return;
	    x=a[l];
	    i=l;
	    j=r;
	    while(i<j){
	        while(a[j]>x && i<j){//先从右往左找
	            j--;
	        }
	        while(a[i]<=x && i<j){//再从左往右找
	            i++;
	        }
	        if(i<j){
	        	a[i]^=a[j];
	        	a[j]^=a[i];
	        	a[i]^=a[j];
	        }
	    }
	    a[l]=a[i];
	    a[i]=x;
	    qsort1(a,l,i-1);//继续处理左边的
	    qsort1(a,i+1,r);//继续处理右边的
	}
	
	public static void main(String [] args){
		int[] a=new int[10];
		Random r = new Random();
		for(int i=0; i<10; i++){
			a[i] = r.nextInt(10);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		new qsort().qsort1(a, 0, 9);
		for(int i=0; i< 10; i++){
			System.out.print(a[i]+" ");
		}
	}
	
}
