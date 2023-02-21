package peluqueria;
/**
 * Codigo ejemplo de un ejercio de tarjeta poeluqueria donde sabemos las posicionmes de ela tarjeta 
 * @author Rodrigo Romero
 * @version 1.0
 */
public class Tarjeta {
	
	int tarjeta[][];
	String nombre;
	String color;
	/**
	 * 
	 * hidden
	 */
public static void main(String[] args) {
	Tarjeta t1=new Tarjeta();
	System.out.println(t1.Fidelizacion('B', 0, 2, "Juan"));
}
/*
 * El metodo comprueba si la tarjeta es de un tipo de color y dependiendo cual sea tendra unos valores u otos
 * @param variable de tipo char que nos dara el color de la tarjeta
 * @return cadena de texto que nos dara la
 */
	public String Fidelizacion(char cTipo, int iFil, int iCols, String sNombre) {
		tarjeta = new int[iFil][iCols];
		color = "";
		nombre = sNombre;
		if (cTipo == 'B') {
			color = "bronce";
		} else if (cTipo == 'P') {
			color = "plata";
		} else if (cTipo == 'O') {
			color = "oro";
		} else {
			color = "blanco";
		}
		int iNumPos = 0;
		for (int i = 0; i < iFil; i++) {
			for (int j = 0; j < iCols; j++) {
				iNumPos++;
				tarjeta[i][j] = iNumPos;
			}
		}
		return "La tarjeta de color " + color + " de " + sNombre + " tiene " + iNumPos + " posiciones";
	}
}