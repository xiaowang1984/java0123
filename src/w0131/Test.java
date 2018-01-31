package w0131;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable piao=new Piao();
		Thread t1=new Thread(piao);
		Thread t2=new Thread(piao);
		t1.start();
		t2.start();
	}

}
