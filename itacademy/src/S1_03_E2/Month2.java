package S1_03_E2;

import java.util.HashSet;

public class Month2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> months=new HashSet<String>();
		String name="Enero";
		String name2="Febrero";
		String name3="Marzo";
		String name4="Abril";
		String name5="Mayo";
		String name6="Junio";
		String name7="Julio";
		String name9="Septiembre";
		String name10="Octubre";
		String name11="Noviembre";
		String name12="Diciembre";
		months.add(name);
		months.add(name2);
		months.add(name3);
		months.add(name4);
		months.add(name5);
		months.add(name6);
		months.add(name7);
		months.add(name9);
		months.add(name10);
		months.add(name11);
		months.add(name12);
		System.out.println(months);
		String name8="Agosto";
		months.add(name8);
		System.out.println(months);
		months.add(name8);
		System.out.println(months);

	}

}
