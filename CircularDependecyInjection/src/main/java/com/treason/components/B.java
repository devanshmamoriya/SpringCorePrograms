package com.treason.components;

public class B {

	private A aobj;
	
	static {
		System.out.println("B class is loading");
	}
	
	public B() {
		
	}
	public B(A aobj){
		System.out.println("B one param constructor");
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	@Override
	public String toString() {
		return "B [aobj=" + aobj + "]";
	}
	
	
	
}
