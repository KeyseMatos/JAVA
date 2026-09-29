package model1;

import java.text.NumberFormat;
import java.util.Locale;


public class Formatador {
	
	public static String formatarMoeda(double valor) {
		
		NumberFormat formato = NumberFormat.getCurrencyInstance(
				Locale.forLanguageTag("pt-BR"));
		
		return formato.format(valor);
	}

}
