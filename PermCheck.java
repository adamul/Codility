package pakietDef;

import java.util.*;

public class PermCheck {

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 Set<Integer> set = new HashSet<>();
		 int i;
		 for(i=0;i<A.length;i++){
			 set.add(A[i]);
		 }
		 
		 
		 
		 
//		 System.out.println(set+", set size: "+set.size()+", A.length"+A.length);
		 
		 
		 
		 if(set.size()!=A.length) return 0;
		 Object[] B = new Object[set.size()];
		 B = set.toArray();
		 
//System.out.println("Rozmiar B = "+B.length);
//System.out.println("Rozmiar set = "+set.size());
		 
//		 for(Object a : B)
//			 System.out.print(a+" ");
//		 
//		 System.out.println("(Integer)B[B.length-1]"+(Integer)B[B.length-1]);
//		 System.out.println("(Integer)B[0]"+(Integer)B[0]);
//		 System.out.println("set.size()"+set.size());
//		 
		 if((Integer)B[B.length-1]==set.size())
			 return 1;
		 else return 0; 
		 
		 
		 	 
			 
			 
		 }
		 
		 
		 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,1,3,2};
		int[] B = {4,1,3};
		
		System.out.println("Rozwiązanie: "+solution(A));
		System.out.println("===================================================");
		System.out.println("Rozwiązanie: "+solution(B));

	}

}





//A non-empty zero-indexed array A consisting of N integers is given.
//
//A permutation is a sequence containing each element from 1 to N once, and only once.
//
//For example, array A such that:
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//
//is a permutation, but array A such that:
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//
//is not a permutation, because value 2 is missing.
//
//The goal is to check whether array A is a permutation.
//
//Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
//
//For example, given array A such that:
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//
//the function should return 1.
//
//Given array A such that:
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//
//the function should return 0.
//
//Assume that:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [1..1,000,000,000].
//
//Complexity:
//
//        expected worst-case time complexity is O(N);
//        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
//
//Elements of input arrays can be modified.
