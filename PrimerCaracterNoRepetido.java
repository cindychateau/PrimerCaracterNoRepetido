import java.util.HashMap;
/*
    Crear una funcion que reciba como parámetro un string. Esta función se encarga de retornar el primer caracter que no se encuentre repetido en el string. En caso de que todos los caracteres se repitan, retornar un null o vacío.
    Ejemplo:
        "Hola me gusta mucho programar." => 'l'
*/
public class PrimerCaracterNoRepetido {

    /*
    texto = "AaBCbCd";
    letras = {};
    texto = "aabcbcd";

    i = 0; 
    letra = "a";
    letras = {
        'a': 1
    };

    i = 1;
    letra = "a";
    conteo = 1;
    conteo = 2;
    letras = {
        'a': 2
    }

    i = 2;
    letra="b";
    letras = {
        'a': 2,
        'b': 1
    }

    i = 3;
    letra = "c";
    letras = {
        'a': 2,
        'b': 1,
        'c': 1,
    }

    i = 4;
    letra = "b";
    conteo = 1;
    conteo = 2;
    letras = {
        'a': 2,
        'b': 2,
        'c': 1,
    }

    i = 5;
    letra = "c";
    conteo = 1;
    conteo = 2;
    letras = {
        'a': 2,
        'b': 2,
        'c': 2,
    }

    i = 6;
    letra = "d";
    letras = {
        'a': 2,
        'b': 2,
        'c': 2,
        'd': 1
    }

    i = 0;
    letra = "a";

    i = 1;
    letra= "a";

    i = 2;
    letra = "b";

    i = 3
    letra = "c"

    i = 4
    letra = "b"

    i = 5
    letra = "c"

    i = 6
    letra = "d"
    RETURN "d"
     */    
    public static char encuentraCaracterNoRepetido(String texto) {
        HashMap<Character, Integer> letras = new HashMap<Character,Integer>();

        texto = texto.toLowerCase();

        for(int i=0; i<texto.length(); i++) {
            char letra = texto.charAt(i);

            if(letras.get(letra) == null){
                letras.put(letra, 1);
            }else{
                int conteo = letras.get(letra);
                conteo++;
                letras.put(letra, conteo);
            }
        }

        for(int i=0; i<texto.length(); i++) {
            char letra = texto.charAt(i);
            if(letras.get(letra) == 1){
                return letra;
            }
        }

        return ' ';

        // diccionario = {
        //     'a': 5,
        //     'b': 1,
        //     'c': 10
        // }


    }


    public static void main( String args[] ) {
        char res = encuentraCaracterNoRepetido("AaBCbCd");
        System.out.println(res);
    }
}