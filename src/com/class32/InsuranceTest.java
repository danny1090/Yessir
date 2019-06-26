package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {
		Insurance car=new Car("Gieco", "Toyota");
		
		Insurance pet=new Pet("Progressive", "Dog");
		
		Insurance health=new Health("Liberty");
		
		List<Insurance> alist=new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		//for loop
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i).InsuranceName);
		}
		//advanced loop
		for(Insurance s:alist) {
			s.getQoute();
		}
		//Iterator
		Iterator<Insurance> it=alist.iterator();
		while(it.hasNext()) {
			it.next().cancelInsurance();
		}
		
		
		
		
		
		
		
	}

}
