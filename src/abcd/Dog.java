package abcd;

public class Dog {
	public static final String a="fdasjfjl";
	public Dog(){
		
	}
	
	public Dog(String name,String abc){
		this.name=name;
		this.abc=abc;
	}
	private String name;
	private String abc;
	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int add(int a,int b){
		return a+b;
	}
	public static void fun(){
		System.out.println("静态方法");
	}
	
}
