package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		Visa visa=new Visa("Visa Platinum");
		
		AX ax=new AX("AX Rewards");
		
		MasterCard mc=new MasterCard("MC basic"); 
		
		ArrayList<CreditCard> alist=new ArrayList<>();
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);
		
		//how can i get a name of each card?
		for(CreditCard s:alist) {
			System.out.println(s.creditCardName);
			s.interestRate();
			s.annualFee();
			System.out.println("----------------------");
		}
		// how we can print an interest rate of each card
		Iterator<CreditCard> myIterator=alist.iterator();
		while(myIterator.hasNext()) {
			CreditCard obj=myIterator.next();
			obj.interestRate();
		}
		//how to print an annual fee of each card
		for(int i=0; i<alist.size(); i++) {
			CreditCard obj=alist.get(i);
			obj.annualFee();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
