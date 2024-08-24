package com.ankita;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void m1()
	{
		List<String>list=new ArrayList<String>();
		list.add("core java");
		list.add("oops concept");
		list.add("jdbc");
		list.add("git");
		for(String str:list)
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		
		m1();

	}

}
