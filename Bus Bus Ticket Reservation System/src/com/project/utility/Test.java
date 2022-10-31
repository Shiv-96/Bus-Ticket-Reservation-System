package com.project.utility;

import java.sql.Connection;



public class Test {
	
	public static void main(String[] args) {
		
		Connection conn = DBUtill.provideConnection();
		
		System.out.println(conn);
		
	}
	
}
