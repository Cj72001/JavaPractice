import java.util.ArrayList;
import java.util.List;

public class Soft {
    public static void main(String[] args) throws Exception {
        
        //Inicializando variable que contendra el numero
        String number = "0000";

        //Creando un arreglo  que contendra cada digito del numero
        char [] digits = number.toCharArray();

        //Arreglo que contendra los valores numericos de cada char de digits
        int []  ints = new int[digits.length];

        //Llenando arreglo ints con el valor numerico de cada digito en digits
         for(int i = 0; i < digits.length; i++) {

            //Obtener el valor numerico de i y agregarlo a ints en i
            int n = Character.getNumericValue(digits[i]);
            ints[i]=n;
        }

        

        //String que tendra el resultado ya evaluado
        String resultado = "";

        //Recorriendo el arreglo ints para verificar si el numero i es par y concatenar un * en el String resultado
        for(int i = 0; i < digits.length; i++) {

            int n = ints[i];

            if(n%2 == 0){
                resultado += "*";
                resultado += n;
            }
            else{
                resultado += n;
            }

        }

        //Imprimiendo cadena resultante
        System.out.println(resultado);



    }
    
}
