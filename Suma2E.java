//sumar 2 numeros enteros
// Suma2E.java

import static javax.swing.JOptionPane.*;

public class Suma2E{
    public static void main (String ar[]){
        int n1=Integer.parseInt(showInputDialog("Num 1: "));
	int n2=Integer.parseInt(showInputDialog("Num 2: "));
	int suma=n1+n2;
	showMessageDialog(null,n1 + "+" + n2 + "= " + suma);
    }//main
}//class
    
