import static javax.swing.JOptionPane.*;

public class Alumno {
    private String nc, nombre;
    private int edad;
    public void leer() {
	nc = showInputDialog("Alumno.leer - Numero De Control: ");
	nombre = showInputDialog("Alumno.leer - Nombre: ");
	edad = Integer.parseInt(showInputDialog("Alumno.leer - Edad: "));
    }//leer
    public void mostrar() {
	showMessageDialog(null, nc + "\n" + nombre + "\n" + edad);
    }//mostrar
    public static void main(String arg[]) {
	Alumno a = new Alumno();
	a.leer();
	a.mostrar();
    }//main
}//class
