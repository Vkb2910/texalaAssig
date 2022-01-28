package com.Texla;

import com.Texla.ServicePack.*;
import java.io.IOException;

public class TexalaAssig1 {

	public static void main(String[] args) {
		String data="";
				
		Service service=new Service();
			try {
				data=service.getHtmlData();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(data);
	}
}
