import java.io.*;
import java.util.*;

class Student{
	String name;
	Student(String name){
		this.name=name+'!';
	}

}
public class Library{
	public String name;
	public Random rand;
	Student[] students= new Student[6];
	int index;
	Scanner input=new Scanner(System.in);
	Library(String name){
		this.name=name;
		index=0;
		rand=new Random();
	}
	private void get(){
		char n=input.next().charAt(0);
		System.out.println(n);
		
	}
	public static void main(String[] args){
		Library l= new Library(args[0]);
		l.get();
	}


}
