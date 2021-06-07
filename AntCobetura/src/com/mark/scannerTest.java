package com.mark;

import java.util.ArrayList;
import java.util.Iterator;

public class scannerTest {

	public scannerTest(){
		System.out.println("Default constructor");
	}
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("mark");
		list.add("konda");
		list.add(456);
		System.out.println(list);
		                    
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
