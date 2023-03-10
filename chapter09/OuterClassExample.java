package chapter09;

import chapter09.OuterClass.InnerClass;
import chapter09.OuterClass.InstanceClass;

public class OuterClassExample {
	public static void main(String[] args) {
		
//		OuterClass outerClass = new OuterClass();
//		outerClass.method();
//		
//		InnerClass innerClass = outerClass.new InnerClass();  //어색해서 잘 안씀
//		innerClass.method();
//		----------------------------------------------------
		InstanceClass instanceClass = new OuterClass().new InstanceClass();
		instanceClass.method();
		
		
		InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.method();
	}
}
