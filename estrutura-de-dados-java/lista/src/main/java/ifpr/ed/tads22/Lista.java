package ifpr.ed.tads22;

public class Lista {
    private Nodo inicio;

    public void criaLista(){
        inicio = null;
    }
    
    public void adicionaElemento(int value){
        Nodo buffer = new Nodo();
        Nodo nav = null;
        boolean inserido = false;
        buffer.setValue(value);

        nav = inicio;

        while(inserido){
            if(inicio == null){
                inicio = buffer;
            }
            
            if(nav.g == null){
                nav = buffer;
                System.out.println("Valor adicionado: " + nav.getValue());
                inserido = true;
            } else{
                nav = nav.getProx();
                System.out.println("Pulando");
            }
        }
    }




}
