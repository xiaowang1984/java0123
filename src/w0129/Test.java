package w0129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import w0126.Cat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 数据类型 
		 * 	基本类型 
		 * 		byte       1    Byte        0
		 * 		short      2	Short       0
		 * 		int        4    Integer     0
		 * 		long       8    Long        0
		 * 		float      4	Float       0.0f
		 * 		double     8	Double      0.0
		 * 		boolean    1	Boolean     false
		 * 		char       2    Character   /u0000
		 *  引用类型
		 * 		类           定义类-new--class 文件名和类名必须一样 
		 * 			属性       --- 用private修饰 并且生成了get和set
		 * 			方法       --- 等同于函数
		 * 			构造器    --- 创建对象 给私有属性赋初始值    如果不写默认生成一个无参构造 
		 * 		数组
		 * 			在堆区中创建出一个连续的内存空间用来保存对象或者变量
		 * 			
		 * 		接口
		 * 			定义接口  new--interface 文件名和接口名必须一样
		 * 			抽象方法  --- 只有方法的定义 没有方法具体的实现  约束子类必须要重写的方法
		 * 			不能有成员变量 但是可以有常量 （用static final修饰）
		 * 
		 * 	 内存模型 
		 * 		堆区       --- 用new关键词创建出的对象 jdk1.7开始字符串常量池在堆区中存放
		 * 		栈区	  --- 栈帧  每调用一个方法创建一个栈帧  栈帧下保存临时变量（包含参数）
		 * 		方法区   --- 静态成员  类的信息  jdk1.7之前字符串常量池在方法区中存放
		 * 		调用方法进行参数传递的时候 基本类型传递的是值  引用类型传递的是内存地址
		 * 		javap -c
		 * */
		
		/*int[] arr=new int[6];
		arr[0]=6;
		arr[1]=5;*/
		int arr2[]={10,25,9,30,18,70,55,200,100};
		/*for(int i=0;i<=arr2.length;i++){
			System.out.println(arr2[i]);
		}*/
		/*for(int i:arr2){
			System.out.println(i);
		}*/
		/*第一次循环    */
		/*for(int i=0;i<arr2.length-1;i++){
			if(arr2[i]>arr2[i+1]){
				int tmp=arr2[i];
				arr2[i]=arr2[i+1];
				arr2[i+1]=tmp;
			}
		}
		System.out.println("第一次循环结束之后");
		System.out.println("-----------------------");
		for(int i:arr2){
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("-----------------------");
		
		第二次循环 
		for(int i=0;i<arr2.length-1-1;i++){
			if(arr2[i]>arr2[i+1]){
				int tmp=arr2[i];
				arr2[i]=arr2[i+1];
				arr2[i+1]=tmp;
			}
		}
		System.out.println("第二次循环结束之后");
		System.out.println("-----------------------");
		for(int i:arr2){
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("-----------------------");
		
		第三次循环 
		for(int i=0;i<arr2.length-1-2;i++){
			if(arr2[i]>arr2[i+1]){
				int tmp=arr2[i];
				arr2[i]=arr2[i+1];
				arr2[i+1]=tmp;
			}
		}
		System.out.println("第三次循环结束之后");
		System.out.println("-----------------------");
		for(int i:arr2){
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("-----------------------");*/
		
		/*冒泡排序*/
		/*for(int i=0;i<arr2.length-1;i++){
			for(int j=0;j<arr2.length-1-i;j++){
				if(arr2[j]>arr2[j+1]){
					int tmp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=tmp;
				}
			}
		}
		for(int i:arr2){
			System.out.print(i+"  ");
		}*/
		/*选择排序*/
		/*for(int i=0;i<arr2.length-1;i++){
			for(int j=i+1;j<arr2.length;j++){
				if(arr2[i]>arr2[j]){
					int tmp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=tmp;
				}
			}
		}
		for(int i:arr2){
			System.out.print(i+"  ");
		}*/
		List list=new ArrayList(1000000);
		list.add("a");
		list.add("b");
		list.add("a");
		list.add(10);
		System.out.println(list.contains("b"));
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		/*for(Object obj:list){
			System.out.println(obj);
		}*/
		/*list.add(0, "d");
		list.remove(2);
		for(Object obj:list){
			System.out.println(obj);
		}*/
		
		/*System.out.println(list.size()); 
		list.add(4);
		System.out.println(list.size());
		System.out.println(list.get(0));*/
		
		/*Set set=new HashSet();
		set.add("d");
		set.add("c");
		set.add("g");
		set.add("e");
		set.add("d");
		set.add("d");
		set.add("d");
		set.add("d");
		set.add("d");
		set.remove("e");
		for(Object obj:set){
			System.out.println(obj);
		}*/
		/*Map map=new HashMap();
		map.put("a", "abc");
		map.put("b", "bcd");
		map.put("c", "efg");
		Set set= map.keySet();
		System.out.println(map.containsValue("fsa"));*/
		/*for(Object key:set){
			System.out.println(map.get(key));
		}*/
		/*String a="a";
		a="abc";
		method(a);
		System.out.println(a);*/
		/*String a=new String("a");
		String b=new String("a");
		int i=1;
		String c=String.valueOf(i);
		System.out.println(c+1);*/
		String a="a";
		a+="b";
		a+="c";
		a+="d";
		a+="e";
		a+="c";
		a+="g";
		StringBuilder builder=new StringBuilder("a");
		builder.append("b");
		builder.append("c");
		StringBuffer buffer=new StringBuffer();
		String b= a.replaceAll("c", "u");
		System.out.println(b);
		 
	}
	public static void method(String a){
		a="abcd";
	}

}
