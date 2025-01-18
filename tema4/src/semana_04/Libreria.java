package semana_04;

public class Libreria {

	public String eliminarEspacio(String dato) {
		return dato.trim();
	}
	
	public int longitudSinAjuste(String dato) {
		return dato.length();
	}
	
	public char primerCaracter(String d) {
		return d.charAt(0);
	}
	
	public char ultimoCaracter(String d) {
		return d.charAt(longitudSinAjuste(d)-1);
	}
	
	public String textoAjustado(String d) {
		String texto = "";
		char caracter;
		
		for(int i = 0; i<d.length();i++) {
			caracter = d.charAt(i);
			if(!(caracter == ' ' && ultimoCaracter(texto) == ' ')) {
				texto += caracter;
			}
		}
		return texto;
	}
}
