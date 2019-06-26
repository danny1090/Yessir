package com.class33;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer> classroom=new LinkedHashMap<>();
		classroom.put("Table", 20);//Entry<Key, Value>
		classroom.put("Chairs", 60);//Entry<String, Integer>
		classroom.put("Screens", 3);//
		classroom.put("Students", 60);
		classroom.put("Instructors", 3);
		
		System.out.println(classroom);
		
		for(Map.Entry<String, Integer> entry:classroom.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("///////////////////////////");
		
		Iterator<Map.Entry<String, Integer>> classroomIt=classroom.entrySet().iterator();
		while(classroomIt.hasNext()) {
			Map.Entry<String, Integer> me=classroomIt.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
