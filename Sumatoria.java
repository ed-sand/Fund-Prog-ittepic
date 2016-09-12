import static javax.swing.JOptionPane.*;

public class Sumatoria {
    public static void sumatoria() {
	int n = Integer.parseInt(showInputDialog("Sumatoria - Entre limite: "));
	double s = 0;
	for(int i = 1; i <= n; i++) {
	    s += (float)Funciones.factorialN(i) / Funciones.potenciaN(2, i);
	}
	showMessageDialog(null, s);
    }//sumatoria

    public static void main(String arg[]) {
	sumatoria();
    }//main
}//class
