package bonilla.mariela.cl;

import bonilla.mariela.bl.Arbol;

public class Gestor {
    private Arbol arbol = new Arbol();


    public void insertData(int num){
        arbol.insertInfo(num);
    }

    public void prints(int option){
        arbol.orderPrints(option);
    }
}
