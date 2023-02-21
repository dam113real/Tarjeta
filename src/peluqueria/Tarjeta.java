package peluqueria;

public class Tarjeta {
	
	int tarjeta[][];
	String nombre;
	String color;
public static void main(String[] args) {
	Tarjeta t1=new Tarjeta();
	System.out.println(t1.Fidelizacion('B', 0, 2, "Juan"));
}
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