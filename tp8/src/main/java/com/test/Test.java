package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFmt = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = dateFmt.format(new Date());
		System.out.println(dateStr);
		System.out.println(dateFmt.toPattern());
	}

}
