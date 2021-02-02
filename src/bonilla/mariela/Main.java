package bonilla.mariela;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Arbol arbol = new Arbol();

        arbol.insertInfo(3);
        arbol.insertInfo(6);
        arbol.insertInfo(8);
        arbol.insertInfo(2);
        arbol.insertInfo(9);
        arbol.insertInfo(7);
        arbol.insertInfo(1);
        arbol.insertInfo(10);

        arbol.orderPrints(1);
        arbol.orderPrints(2);
        arbol.orderPrints(3);
    }
}
