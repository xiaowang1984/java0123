package w1030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*List<String> list=new ArrayList<String>();
		Set set=new HashSet();
		Map<String, Integer> map=new HashMap();
		Cat<String> cat=new Cat();
		Scanner scanner=new Scanner(System.in);
		String str="1234";
		String str2="56";
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));*/
		System.out.println(add(1,2));
	}
	public static int add (int a,int b) throws Exception{
			int c=a+b;
			int e=c/0;
			System.out.println("try");
			return c;
	}
	
	public static void eat(){
		System.out.println("吃东西");
	}
	public static void drink(){
		System.out.println("喝饮料");
	}
	public static void talk(){
		System.out.println("说话");
	}
}
