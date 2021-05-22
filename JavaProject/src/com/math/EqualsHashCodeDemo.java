package com.math;

public class EqualsHashCodeDemo {
	public static void main(String[] args) {
		EqualsHashCodeDemo e = new EqualsHashCodeDemo();
		Test t = new Test(1);
		Test t2 = new Test(1);
		e.test1(t, t2);
		
	}
	
	public void test1(Test t1,Test t2) {
		System.err.println(t1.equals(t2));
		System.out.println(t1.hashCode() + "   ." + t2.hashCode());
	}
}

class Test{
	int value ;

	public Test(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
}
