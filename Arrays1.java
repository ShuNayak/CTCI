package com.ctci.problems.Arrays;

public class Arrays1 {
	
	public boolean check(String s) {
		 int checker=0;
		 s=s.toLowerCase();
		 for(int i=0;i<s.length();i++)
		 {
			 int value = s.charAt(i)-'a'; 
			 if((checker & 1<<value) > 0) return false;
			 else {
				 checker = checker | (1<<value);
			 }
		 }
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabcgdh";
		String g = "ovkswqazytperf";
		String h = "xxx";
		String y = " ";
		
		Arrays1 a = new Arrays1();
		System.out.println(a.check(s));
		System.out.println(a.check(g));
		System.out.println(a.check(h));
		System.out.println(a.check(y));
		
	

}
}
