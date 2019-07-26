package test;

import java.util.Scanner;

public class BinarySearch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while(true) {
			int arr[]= {1,5,6,7,11,64,63,62,85,16,73};
			
			System.out.println("Enter the the value to be searched:");
			Scanner sc=new Scanner(System.in);
			int item=sc.nextInt();
			boolean isFound=false;
			
			int beg=0;
			int end=arr.length-1;
			int mid=0;
			while(end>=beg) {
				System.out.println("beg:"+beg+" end:"+end+" mid:"+mid);
				System.out.println("inside while");
				mid=(beg+end)/2;
				
				if(arr[mid]==item) {
					isFound=true;
					break;
				}else if(item>arr[mid]) {//item present in right half
					beg=mid;//mid+1 because ar[mid] already checked
				}else {
					end=mid;//mid-1 because ar[mid] already checked
				}
			}
			
			if(isFound)
				System.out.println("Element found");
			else
				System.out.println("Element not found");
		}
	}

}
