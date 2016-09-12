import static javax.swing.JOptionPane.*;
    
public class Funciones {
    public static boolean esPrimo(int n) {
	int d = 0;
	for(int i = 1; i <= n/2; i++) {
	    if(n % i == 0) {
		d++;
	    }
	}
	return(d == 1);
    }//esPrimo

    public static void primosRango() {
	String num0 = showInputDialog("Primos Rango - Entra Inicio: ");
	int inicio = Integer.parseInt(num0);
        int fin = Integer.parseInt(showInputDialog("Primos Rango - Entra Fin: "));
	String p = "";
	if(inicio > fin) {
	    int numI= inicio;
	    inicio = fin;
	    fin = numI;
	}
	for(int n = inicio; n <= fin; n++) {
	    if(esPrimo(n)) {
		p += n + "\n";
	    }
	}
	showMessageDialog(null, p);
    }//primosRango

    public static boolean esPerfecto(int n) {
	int d = 0;
	for(int m = 1; m <= n/2; m++) {
	    if(n % m == 0) {
		d += m;
	    }
	}
	return(d == n);
    }//esPerfecto

    public static void perfectosRango() {
	int inicio = Integer.parseInt(showInputDialog("Perfectos Rango - Entrar Inicio: "));
	int fin = Integer.parseInt(showInputDialog("Perfectos Rango - Entrar Fin: "));
	String perfectos = "";
	if(inicio > fin) {
	    int temp = inicio;
	    inicio = fin;
	    fin = temp;
	}
	for(int i = inicio; i <= fin; i++) {
	    if(esPerfecto(i)) {
		perfectos += i + "\n";
	    }
	}
	showMessageDialog(null, perfectos);
    }//perfectosRango

    public static int potenciaN(int x, int n) {
	int pot = 1;
	for(int i = 1; i <= n; i++) {
	    pot *= x;
	}
	return(pot);
    }//encontrarPotencia

    public static int factorialN(int f) {
	int fact = 1;
        for(int i = 1; i <= f; i++) {
	    fact *= i;
	}
	return(fact);
    }//factorialN

    public static double areaC(double x) {
	double PI = Math.PI;
        double area = PI * x * x;
	return area;
    }//areaC

    public static int mayor2N(int a, int b) {
	if(a == b) {
	    return a;
	}
	else {
	    if(a > b) {
		return a;
	    }
	    else {
		return b;
	    }
	}
    }//mayor2N

    public static boolean esTriangulo(float a, float b, float c) {
	if(a == b && b == c) {
	    return true;
	}
	else {
	    if(a > b && a > c) {
	        return(b + c > a);
            }
            else {
	        if(b > a && b > c) {
		    return(a + c > b);
	        }
	        else {
		    if(c > a && c > b) {
		        return(a + b > c);
		    }
		    else {
		        return(false);
		    }
	        }
	    }
	}
    }//esTrinagulo
    
    public static void main(String arg[]) {
	String contenido = "Clase Funciones - Fundamentos de Programacion - Eduardo Sandoval\n\n" +
			   "1. Encontrar Primos en Rango\n" +
			   "2. Encontrar Perfectos en Rango\n" +
			   "\nEntrar numero correspondiente a la opcion (1 es por defecto):";
	int e = Integer.parseInt(showInputDialog(contenido));
	switch(e) {
	    case 1: primosRango();
	        break;
	    case 2: perfectosRango();
	        break;
	    default: primosRango();
	        break;
	}
    }//main
}//Funciones
