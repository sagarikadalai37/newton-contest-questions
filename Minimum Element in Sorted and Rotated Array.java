import java.util.*;

import java.io.*;

import java.lang.*;



class Main{

	public static void main (String[] args) {

		//code

				Scanner s = new Scanner(System.in);

				int t = s.nextInt();

				for(int j=0;j<t;j++){

	            	int al = s.nextInt();

		            int a[] = new int[al];

		            for(int i=0;i<al;i++){

			        a[i] = s.nextInt();

		            }

			        binSearchSmallest(a);

				    

				}

	

	}

		public static void binSearchSmallest(int a[]) {

		int s=0;

		int e = a.length - 1;

		int mid = 0;

		while(s<=e){

			mid = (s+e)/2;

			if(a[s]<a[e]){

				System.out.println(a[s]);

				return;

			}

			if(a[mid]>=a[s]){

				s=mid+1;

			}

			else{

				e=mid;

			}

			

			if(s == e){

				System.out.println(a[s]);

				return;

			}

		}



	}

}
