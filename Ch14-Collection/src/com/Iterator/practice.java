package com.Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class practice {

	public static void main(String[] args) {
		HashSet<String> ll=new HashSet<String>();
		
		ll.add("a");
		ll.add(new String("b"));
		ll.add("c");
		
		Iterator<String> it=ll.iterator();
		
		while(it.hasNext()) {
			String st=it.next();
			System.out.println(st);
			if(st=="b") {
				it.remove();
			}
			System.out.println("call the iterator after remove the iterator");
//			it=ll.iterator();
		}
	}

}
