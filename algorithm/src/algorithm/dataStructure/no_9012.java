package algorithm.dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class no_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cntOrd = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<cntOrd; i++) {
			String a = sc.nextLine();
			boolean min = false;
			String [] arr = a.split("");
			Stack<String> st = new Stack<String>();
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("(")) {
					st.add(arr[j]);
				}else if(arr[j].equals(")")) {
					if(st.isEmpty()) {
						min = true;
						break;
					}else {
						st.pop();
					}					
				}
			}
			if(st.isEmpty() && min==false) {
				System.out.println("YES");
			}else if(!st.isEmpty() || min==true){
				System.out.println("NO");
			}
		}
	}
}
