package java0123;
import abcd.Cat;
import abcd.Person;


public class A {
	public static int add(int a,int b){
		int c=a+b;
		return c;
	}
	public static void fun(int a){
		a=100;
	}
	public static void fun2(Person person){
		person.setAge(100);
	}
	public static void main(String[] args){
		/*String name="二胖";
		int age=6;
		char sex='男';
		String pinzhong="橘猫";
		
		String name2="小白";
		int age2=15;
		char sex2='男';
		String pingzhong2="短毛";*/
		Cat cat1=new Cat();
		cat1.setName("二胖");
		cat1.setAge(8);
		cat1.method();
		
/*		int i=97;
		byte j=(byte)i ;
		
		char a='a';
		char b=(char)((int)a+1);
		char[] arr={'1','三'};
		System.out.println(b);*/
		/*double a=10;
		double b=a/3;
		System.out.println(b);*/
		//0000 0000 0000 0000 0000 0000 1000 0000
		//1000 0000
		
		
	/*	int count=0;
		int[] arr={1,2,3,4};
		for(int i=0;i<arr.length;i++){
			int a=arr[i];
			for(int j=0;j<arr.length;j++){
				if(i!=j){
					int b=arr[j];
					for(int k=0;k<arr.length;k++){
						if(k!=i&&k!=j){
							int c=arr[k];
							int m=a*100+b*10+c;
							count++;
							System.out.println(m);
						}
					}
				}
			}
		}
		System.out.println(count);*/
		
		/*int i=5306;
		int m=i/1000;
		int n=(i%1000)/100;
		int o=(i%100)/10;
		int p=i%10;
		int q=p*1000+o*100+n*10+m;
		System.out.println(q);*/
		
		/*int i=43287;
		int m=i/10000;
		int n=(i%10000)/1000;
		int o=(i%1000)/100;
		int p=(i%100)/10;
		int q=i%10;*/
		
		/*int i=100;
		int j=70;
		int k=i<j?j:i;
		int m=k;
		while(k<=(i*j)){
			if(k%i==0&&k%j==0){
				System.out.println("最小公倍数为"+k);
				break;
			}
			k++;
		}*/
		/*for(int m=k;m>0;m--){
			if(i%m==0&&j%m==0){
				System.out.println("最大公约数为"+m);
				break;
			}
		}*/
		
		
		/*for(int i=100;i<=999;i++){
			int m=i/100;
			int n=(i%100)/10;
			int o=i%10;
			if((Math.pow(m, 3)+Math.pow(n, 3)+Math.pow(o, 3))==i){
				System.out.println(i);
			}
		}*/
		
		/*int[] a={5,10,15,25,90,64};*/
		/*for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		/*for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
			for(int b:a){
				System.out.print(b+",");
			}
			System.out.println();
		}
		*/
		

	/*	switch (i){
			case 1:
				System.out.println("111");
				break;
			case 2:
				System.out.println("222");
				break;
			case 3:
				System.out.println("333");
				break;
			default:
				System.out.println("4444");
		
		}*/
		/*int a=10;
		fun(a);
		Person person=new Person();
		System.out.println(person);
		person.setAge(10);
		fun2(person);
		System.out.println(a);
		System.out.println(person.getAge());*/
		/*Person p1=new Person();
		Person p2=new Person();
		p1.setName("p1");
		p2.setName("p2");

		System.out.println(p1.getName());
		System.out.println(p2.getName());*/
		/*if(表达式(结果是boolean类型)){
			代码块1
		}
		如果表达式为真 则运行代码块1
		if(表达式(结果是boolean类型)){
			代码块1
		}else{
			代码块2
		}
		如果表达式为真 则运行代码块1 如果表达式为假运行代码块2
		if(表达式(结果是boolean类型)){
			代码块1
		}else if(表达式(结果是boolean类型)){
		
		}else if(表达式(结果是boolean类型)){
		
		}else{
		
		}
		*/
		/*
		 * 循环和我们的js写法也是一致的
		 * while(表达式){
		 * 	当表达式值为真的时候  会执行代码块
		 * }
		 * 
		 * 
		 * 
		 * */
		
		// 循环三要素   1 循环变量(计数器) 2 循环条件  3 更新计数器
		/*int i=1;
		while(i<=25){
			System.out.println("跑了"+i);
			i++;
		}*/
		/*for(int i=1;i<=25;i++){
			System.out.println("跑了"+i);
		}*/
		/*
		 * 通过类创建对象的方式   
		 * 
		 * 数据类型  变量名=new 构造方法();
		 * 
		 * 
		 * */
		
	}
}
