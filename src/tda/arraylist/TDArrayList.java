
package tda.arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson Borda
 */
public class TDArrayList {
    public static void main(String[] args) {
        //Creamos el ArrayList
        //ArrayList<String> frases = new ArrayList();
        ArrayList<String> cadenas;//Creando objeto o instancia de tipo ArrayList
        //Instanciamos cadenas
        cadenas = new ArrayList();
        
        String frase, respuesta;
        do{
            frase = JOptionPane.showInputDialog(null, "Ingresa la frase: ");
            //Agregadon la frase a la lista
            cadenas.add(frase);
            respuesta=JOptionPane.showInputDialog(null, "Deseas ingresar otra frase?");
            respuesta=respuesta.toUpperCase();
        }while(!respuesta.equals("NO"));
        
        //Mostrando el contenido de cadenas
        System.out.println("Frases Originales");
        for(int i = 0; i<cadenas.size(); i++){
            System.out.println(cadenas.get(i));
        }
        //Utilizando el método set
        cadenas.set(1, "La que modifiqué");
        //Mostrando el contenido de cadenas modificada con set
        System.out.println("Frases modificadas");
        for(int i = 0; i<cadenas.size(); i++){
            System.out.println(cadenas.get(i));
        }
        cadenas.remove(0);
        System.out.println("Frases que nos quedan");
        for(int i = 0; i<cadenas.size(); i++){
            System.out.println(cadenas.get(i));
        }
    }
    
}
