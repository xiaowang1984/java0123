package abcd;

public class Cat {
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void method(){
		System.out.println(name+"正在走猫步");
	}
	public void add(int a){
		System.out.println(a);
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public float add(float a){
		return a;
	}
	public int add(int a,String b){
		return a;
	}
	public int add(String b,int a){
		return a;
	}
}
