import static javax.swing.JOptionPane.*;

public class Algoritmos {
    public static void main(String args[]) {
        interfaz();
    }//main

    public static void interfaz() {
        String contenido = "Clase Algoritmos - Fundamentos de Programacion - Eduardo Sandoval\n\n" +
	                   "1. Multiplicacion 2 Numeros\n" +
			   "2. Division 2 Enteros\n" +
			   "3. Suma 2 Numeros\n" +
			   "4. Resta 2 Numeros\n" +
			   "5. Determinar Mayor 2 Numeros\n" +
			   "6. Determinar Paridad\n" +
			   "7. Determinar Mayor 3 Numeros\n" +
			   "8. Determinar Multiplicidad 2 Numeros\n" +
			   "9. Multiplos de 5 antes de limite\n" +
			   "10. Determinar Primo\n" +
			   "11. Determinar Perfecto\n" +
                           "\nEntrar numero correspondiente a seleccion (Multiplicacion es por defecto):\n";
	int eleccion = Integer.parseInt(showInputDialog(contenido));
        switch(eleccion) {
	    case 1: producto2N();
	        break;
	    case 2: cociente2N();
	        break;
	    case 3: suma2N();
	        break;
	    case 4: diferencia2N();
	        break;
	    case 5: magnitud2N();
	        break;
	    case 6: parImparN();
	        break;
	    case 7: mayor3N();
	        break;
	    case 8: multiplos2N();
	        break;
	    case 9: multiplos5();
	        break;
	    case 10: primoN();
	        break;
	    case 11: perfectoN();
	        break;
	    default: producto2N();
	        break;
	}
    }//interfaz
    
    public static void producto2N() {
	double n1 = Double.parseDouble(showInputDialog("Multiplicacion - Primer Numero: "));
	double n2 = Double.parseDouble(showInputDialog("Multiplicacion - Segundo Numero: "));
	double m = n1 * n2;
	showMessageDialog(null, n1 + " X " + n2 + " = " + m);
    }//producto2N

    public static void cociente2N() {
	float n1 = Float.parseFloat(showInputDialog("Division - Dividendo: "));
	float n2 = Float.parseFloat(showInputDialog("Division - Divisor: "));
	float q = n1 / n2;
	showMessageDialog(null, n1 + " / " + n2 + " = " + q);
    }//cociente2N

    public static void suma2N() {
	double n1 = Double.parseDouble(showInputDialog("Suma - Primer Numero: "));
	double n2 = Double.parseDouble(showInputDialog("Suma - Segundo Numero: "));
	double s = n1 + n2;
	showMessageDialog(null, n1 + " + " + n2 + " = " + s);
    }//suma2N

    public static void diferencia2N() {
	double n1 = Double.parseDouble(showInputDialog("Resta - Primer Numero: "));
	double n2 = Double.parseDouble(showInputDialog("Resta - Segundo Numero: "));
	double d = n1 - n2;
	showMessageDialog(null, n1 + " - " + n2 + " = " + d);
    }//diferencia2N

    public static void magnitud2N() {
	double n1 = Double.parseDouble(showInputDialog("Magnitud - Primer Numero: "));
	double n2 = Double.parseDouble(showInputDialog("Magnitud - Segundo Numero: "));
	if(n1 == n2) {
	    showMessageDialog(null, "Son iguales.");
        }
	else {
	    if(n1 > n2) {
		showMessageDialog(null, n1 + " es mayor.");
	    }
	    else {
		showMessageDialog(null, n2 + " es mayor.");
	    }
	}
    }//magnitud2N
    public static void parImparN() {
	int n = Integer.parseInt(showInputDialog("Par / Impar - Entra Numero: "));
	if(n % 2 == 0) {
	    showMessageDialog(null, n + " es par.");
	}
	else {
	    showMessageDialog(null, n + " es impar.");
	}
    }//parImparN

    public static void mayor3N() {
    	float n1 = Float.parseFloat(showInputDialog("Mayor 3 Enteros - Primer Numero: "));
    	float n2 = Float.parseFloat(showInputDialog("Mayor 3 Enteros - Segundo Numero: "));
    	float n3 = Float.parseFloat(showInputDialog("Mayor 3 Enteros - Tercer Numero: "));
    	if(n1 == n2 && n2 == n3) {
    	    showMessageDialog(null, "Son iguales.");
    	}
    	else {
    	    if(n1 > n2 && n2 > n3) {
    		showMessageDialog(null, n1 + " es mayor.");
    	    }
    	    else {
    		if(n2 > n1 && n2 > n3) {
    		    showMessageDialog(null, n2 + " es mayor.");
    		}
    		else {
    		    showMessageDialog(null, n3 + " es mayor.");
    		}
    	    }
    	}
    }//mayor3N

    public static void multiplos2N() {
	int n1 = Integer.parseInt(showInputDialog("Multiplicidad - Primer Numero: "));
	int n2 = Integer.parseInt(showInputDialog("Multiplicidad - Segundo Numero: "));
	if(n1 % n2 == 0) {
	    showMessageDialog(null, "Son Multiplos.");
	}
	else {
	    if(n2 % n1 == 0) {
		showMessageDialog(null, "Son Multiplos.");
	    }
	    else {
		showMessageDialog(null, "No son Multiplos.");
	    }
	}
    }//multiplos2N

    public static void multiplos5() {
	int n = Integer.parseInt(showInputDialog("Multiplos de 5 - Entrar Limite: "));
	String m = "";
	for(int i = 0; i <= n; i++) {
	    if(i % 5 == 0) {
		m += i + ", ";
	    }
	}
	showMessageDialog(null, m);
    }//multiplos5

    public static void primoN() {
	int n = Integer.parseInt(showInputDialog("Determinar Primo - Entra Numero: "));
	int divisores = 0;
	for(int i = 1; i <= n; i++) {
	    if(n % i == 0) {
		divisores++;
	    }
	}
	if(divisores == 2) {
	    showMessageDialog(null, n + " es primo.");
	}
	else {
	    showMessageDialog(null, n + " no es primo.");
	}
    }//primoN

    public static void perfectoN() {
	int n = Integer.parseInt(showInputDialog("Determinar Perfecto - Entre Numero: "));
	int sumDiv = 0;
	for(int i = 1; i < n; i++) {
	    if(n % i == 0) {
		sumDiv += i;
	    }
	}
	if(sumDiv == n) {
	    showMessageDialog(null, n + " es perfecto.");
	}
	else {
	    showMessageDialog(null, n + " no es perfecto.");
	}
    }//perfectoN
}//class
