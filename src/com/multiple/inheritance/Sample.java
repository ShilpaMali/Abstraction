package com.multiple.inheritance;

public class Sample implements X,Y {


	@Override
	public void getData() {
		System.out.println("This is getData() method");
		
	}
	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.getData();

	}

}
