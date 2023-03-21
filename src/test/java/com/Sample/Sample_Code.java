package com.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sample_Code {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		System.out.println(list);
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter song name");
		String name = s.nextLine();
		if(name.equalsIgnoreCase("s1")) {
			System.out.println(list);
		}
		else if (name.equalsIgnoreCase("s3")) {
			Collections.swap(list, 0, 2);
			//Collections.shuffle(list);
			System.out.println(list);
		}
		else if(name.equalsIgnoreCase("s2")) {
			Collections.swap(list, 0, 1);
			//Collections.shuffle(list);
			System.out.println(list);
		}
		else {
			System.out.println(list);
		}
		
	}

	}


