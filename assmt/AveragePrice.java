package com.yash.assmt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// . WAP to create list of item price whose price is less than avg price of all item.

public class AveragePrice {

	public static void main(String[] args) {
	
		List<Item> list= Arrays.asList(
				new Item(1,"NoteBook",4500),
				new Item(2,"Pen",2000),
				new Item(3,"Pencile",2500)
				);
         
       Double average1=list.stream().collect(Collectors.averagingDouble(e->e.price));
		 System.out.println("average is :"+average1);
	
		 List<Item> minavg=list.stream().filter(p->p.price<average1).map(e->e).collect(Collectors.toList());
		 for(Item s:list)
		 {
			 System.out.println(s.name+" ,"+s.price);
		 }
		 
		 
	    
		 
		 
	}

}
