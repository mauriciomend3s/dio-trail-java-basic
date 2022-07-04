import java.text.NumberFormat;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        
        try {

            valor  = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }      
    }   
}
