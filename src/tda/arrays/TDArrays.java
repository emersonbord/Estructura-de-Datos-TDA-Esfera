package tda.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson Borda
 */

public class TDArrays {
    public static void main(String[] args) {
        //Declaramos un arreglo de tipo entero
        int numeros[] = new int[5];
        int numerotes[] = new int[numeros.length];
        String palabras[] = new String[5];
        int i;
        for(i=0; i<5;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresa el elemento del índice " + i));
            
        }
        //Mostrar los datos
        System.out.println("Los datos sin ordenar son: ");
        for(i=0; i<5;i++){
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println("\nLos datos ordenados son: ");
        Arrays.sort(numeros); //Aquí se ordenan
        for(i=0; i<5;i++){
            System.out.print("[" + numeros[i] + "]");
        }
        
        //Rellenando al arreglo palabras
        Arrays.fill(palabras, "Hola");
        System.out.println("\nElementos del arreglo palabras");
        for(i=0;i<5;i++){
        System.out.print("[" + palabras[i] + "]");
        }
        
        //Copiando los elementos del arreglo numeros a numerotes
        
        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        
        System.out.println("\nElementos del arreglo numerotes copiado de arreglo numero");
        for(i=0;i<5;i++){
        System.out.print("[" + numerotes[i] + "]");
        }

    }
    
    
}
