package w0126;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat cat=new Cat();
		//System.out.println(cat.getAge());
		cat.setName("afsa");
		cat.run();*/
		Mainboard mainboard=new Mainboard();
		Cpu i3=new I3();
		Cpu i5=new I5();
		Cpu i7=new I7();
		Cpu i9=new I9();
		mainboard.setCpu(i5);
		mainboard.method();

	}

}
