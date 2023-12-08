package week3.LearnInheritance;

import week1.day2.LearnMethods;

public class LearnVisibility extends LearnMethods{
	
	
	public void cal() {
		System.out.println("Arithmetic Operations");
	}

	protected void sub() {
		super.sub(3, 3);
		System.out.println(5-2);
	}
	

	
	
	public static void main(String[] args) {
		LearnVisibility lv=new LearnVisibility();
		lv.cal();
		lv.sub();
	}
}
