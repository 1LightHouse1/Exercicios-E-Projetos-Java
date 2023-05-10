package ifpr.ed.tads22;

import java.util.*;

public class App 
{
    static Scanner scan = new Scanner(System.in);
    
    public static void setAndGetNodo(){
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

    public static void main( String[] args )
    {
        System.out.println("Salve: ");
        Lista minhaLista = new Lista();
        minhaLista.criaLista();
        minhaLista.adicionaElemento(27);
        minhaLista.adicionaElemento(15);
        minhaLista.adicionaElemento(13);
    }
}
