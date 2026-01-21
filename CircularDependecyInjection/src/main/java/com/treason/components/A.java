package com.treason.components;

public class A {

		private B bobj;
		
		static {
			System.out.println("A class is loading");
		}
		
		public A()
		{
			
		}
		public A(B bobj) {
			System.out.println("A one param constructor");
		}

		public void setBobj(B bobj) {
			this.bobj = bobj;
		}

		@Override
		public String toString() {
			return "A [bobj=" + bobj + "]";
		}
		
		
}
