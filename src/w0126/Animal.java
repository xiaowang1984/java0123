package w0126;

public class Animal {
	public Animal(){}
	public Animal(String name,Integer age){
		super();
		this.name=name;
		this.age=age;
	}
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void run(){
		System.out.println(name+"动物会跑");
	}
	
}
