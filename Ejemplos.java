import static javax.swing.JOptionPane.*;

public class Ejemplos {
    
    public static void main(String arg[]) {
	String contenido = "Clase Ejemplos - Fundamentos de Programacion - Eduardo Sandoval\n\n" +
			   "1. Conversion Centigrados/Fahrenheight\n" +
		           "2. Conversion Dollares/Pesos 20 tarifa\n" +
			   "3. Sumatoria {1/n,...,n}\n" +
			   "4. Serie Fib con hasta n\n" +
			   "5. Serie Fib conteo\n" +
			   "6. Factorial n\n" +
			   "7. Repetir Nombre el numero de letras existentes\n" +
			   "8. Contar Vocales\n" +
			   "9. Cambiar vocal minuscula / consonante mayuscula\n" +
			   "\nEntrar numero correspondiente a eleccion (1 es por defecto):\n";
	int eleccion = Integer.parseInt(showInputDialog(contenido));
	switch(eleccion) {
	    case 1: conversionGC();
	        break;
	    case 2: conversionDP();
	        break;
	    case 3: sumatoria();
	        break;
	    case 4: serieFib();
	        break;
	    case 5: serieFibMod();
	        break;
	    case 6: factorialN();
	        break;
	    case 7: mNombreFLength();
	        break;
	    case 8: contarVS();
	        break;
	    case 9: vocalMiConsMa();
	        break;
	    default: conversionGC();
	        break;
	}
    }//main
    
    public static void conversionGC() {
        int gc = Integer.parseInt(showInputDialog("Entrar grados Centigrados: "));
        double gf = gc * 1.8 + 32;
        showMessageDialog(null, gc + " centigrados = " + gf + " fahrenheight");
    }//conversionGC
    
    public static void conversionDP() {
	double d = Double.parseDouble(showInputDialog("Entrar cantidad Dollar: "));
	double p = d*20;
	showMessageDialog(null, d + " Dollares = " + p + " Pesos");
    }//conversionPS
    
    public static void sumatoria() {
		int n = Integer.parseInt(showInputDialog("Entrar Limite: "));
		double s = 0;
		for(int i = 1; i <= n; i++) {
			s += 1.0/i;
	    }
	    showMessageDialog(null, "La sumatoria de {1/n, ... 1/n+n} = " + s);
    }//sumatoria
    
    public static void serieFib() {
	int n = Integer.parseInt(showInputDialog(null, "Serie Fib - Entra Limite: "));
	int n1 = 0;
	int n2 = 1;
	int suma = 0;
	String serie = "";
	while(suma < n) {
	    serie += suma + ", ";
	    suma = n1 + n2;
	    n2 = n1;
	    n1 = suma;
	}
        showMessageDialog(null, serie);
    }//serieFib
    
    public static void serieFibMod() {
	int n = Integer.parseInt(showInputDialog("Serie Fib Mod. - Entra Cantidad de Numeros: "));
	int a = 0, b = 1, c = 0;
	String f = "0, 1, ";
	for(int i = 3; i <= n; i++) {
	    c = a + b;
	    a = b;
	    b = c;
	    f += c + ", ";
	}
	showMessageDialog(null, f);
    }//serieFibMod

    public static void factorialN() {
	int n = Integer.parseInt(showInputDialog("Factorial - Entrar Numero: "));
	int f = 1;
	for(int i = 1; i <= n; i++) {
	    f *= i;
	}
	showMessageDialog(null, "Factorial de " + n + ": " + f, "Factorial de " + n,3);
    }//factorialN

    public static void mNombreFLength() {
	String n = showInputDialog("Mostrar Nombre - Entra tu Nombre: ");
	String a = "";
	int b = n.length();
	for(int i = 1; i <= b; i++) {
	    a += i + " : " + n + "\n";
	}
	showMessageDialog(null, a, "Nombre", 3);
    }//mnombreFLength

    public static void contarVS() {
	String name = showInputDialog("Contar Vocales - Entra una Palabra: ");
	name = name.toLowerCase();
	int contador = 0;
	int stringL = name.length();
	for(int i = 0; i < stringL; i++) {
	    if(name.charAt(i) == 'a' ||
	       name.charAt(i) == 'e' ||
	       name.charAt(i) == 'i' || 
	       name.charAt(i) == 'o' ||
	       name.charAt(i) == 'u') {
		contador++;
	    }
	}
	showMessageDialog(null, "Numero de vocales: " + contador);
    }//contarVS

    public static void vocalMiConsMa() {
    	String cad = showInputDialog("Convertir Cadena - Entrar Palabras: ").toLowerCase();
    	String vocales = "aeiou";
    	String consonantes = "bcdfghjklmnpqrstvwxyz";
    	String cadF = "";
    	for(int i = 0; i < cad.length(); i++) {
    	    if(vocales.indexOf(cad.substring(i, i + 1)) != -1) {
    		cadF += cad.substring(i, i + 1).toLowerCase();
	    }
    	    else {
		cadF += cad.substring(i, i + 1).toUpperCase();
    	    }
        }
	showMessageDialog(null, cad + " -- " + cadF);
    }//vocalMiConsMa
}//class
