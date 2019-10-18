package com.exercise15strings.app;

import com.exercise15strings.model.Tuneador;

public class StringsApp {
	
	public int numero1;
	

	public static void main(String[] args) {
		String cad1 = "Tomaron decisines que yo respaldo, que yo avalo porque se tornó muy difícil la situación, y estaban en riesgo muchos ciudadanos, muchas personas,  seres humanos, y se decidió proteger la vida de las personas, y yo estuve de acuerdo con eso, porque no se trata de masacres, eso ya se terminó, \"No puede valer más la captura de un delincuente que la vida de las personas\", dijo esta mañana en Oaxaca. https://www.milenio.com/politica/amlo-respalda-liberacion-hijo-chapo-culiacan";
		String cad2 = "          Tomaron decisiones que yo respaldo, que yo avalo porque se tornó muy difícil la situación y estaban en riesgo muchos ciudadanos, muchas personas, muchos seres humanos, y se decidió proteger la vida de las personas y yo estuve de acuerdo con eso, porque no se trata de masacres, eso ya se terminó. \"No puede valer más la captura de un delincuente que la vida de las personas\", dijo esta mañana en Oaxaca. https://www.milenio.com/politica/amlo-respalda-liberacion-hijo-chapo-culiacan";
		
		
		
		System.out.println(cad1.charAt(3));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.codePointBefore(4));
		System.out.println(cad1.codePointCount(3,4));
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("difícil"));
		System.out.println(String.valueOf(115));
		System.out.println(cad1.endsWith("culiacan"));
		System.out.println(cad1.trim()+cad2.trim());
		System.out.println(cad1.indexOf('d'));   //Non greddy
		System.out.println(cad1.lastIndexOf('d')); //Greddy
		System.out.println(cad1.length());
		
		String[] cads = cad1.split(",");
		
		//cads=cad1.split(",");
		for(int i=0; i<cads.length;i++)
			{
			System.out.println(cads[i]);
			}
		
		String cad3="";
		cad3=cad1.replace('a', 'e');
		System.out.println(cad3);
		System.out.println(cad3.toLowerCase());
		System.out.println(cad3.toUpperCase());
		
		//Algorithms for reversing strings
		String reversedString="";
		for(int index=cad1.length()-1;index>=0;index--)
		{
			reversedString=reversedString+cad1.charAt(index);
			
		}
		System.out.println(reversedString);
		
		
		String[] misCadenas = {cad1, cad2, cad3};
		String[] misNuevasCadenas = Tuneador.tunea(misCadenas);
		for(int i=0; i<misNuevasCadenas.length;i++)
		{
			System.out.println(misNuevasCadenas[i]);
		}
			
		int[] misEnteros= {5,7,2,3,5,8,1,5,6,7,9};
		System.out.println("La media es:"+Tuneador.mediaVector(misEnteros));
		
		}
		

	}

}
