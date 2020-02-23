package kh20200219_abstract;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB {
	public abstract void getC();
}

//class Child03 implements InterA, InterB, InterC {
class Child03 implements InterC {

	@Override
	public void getA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getB() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getC() {
		// TODO Auto-generated method stub

	}

}

public class InterfaceEx_03 {

}