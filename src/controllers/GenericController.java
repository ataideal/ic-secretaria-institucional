package controllers;

import java.util.List;
import java.util.Scanner;

public class GenericController<T> {
	
	private static Scanner scan;

	public static <T> T selecionar(List<T> lista){
		for (int i=0;i<lista.size();i++){
			System.out.println(i+"-"+lista.get(i).toString());
		}
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		try{
			return lista.get(a);
		}catch (Exception e) {
			return null;
		}
	}
	

}
