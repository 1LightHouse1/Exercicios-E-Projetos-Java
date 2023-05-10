package ifpr.ed.tads22;

import java.util.*;

public class App 
{
    static Scanner scan = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println("Salve: ");
        Nodo noCego = new Nodo();
        noCego.setValue(45);
        noCego.setProx(new Nodo());
        noCego.getProx().setValue(62);
        noCego.getProx().setProx(new Nodo());
        noCego.getProx().getProx().setValue(10);
        System.out.println("Valor do nó: " + noCego.getValue());
        System.out.println("Proximo: " + noCego.getProx().getValue());
        System.out.println("Proximo do proximo: " + noCego.getProx().getProx().getValue());
    }
}
