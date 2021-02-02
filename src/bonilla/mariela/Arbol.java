package bonilla.mariela;

public class Arbol {
    private NodoArbol raiz;

    public Arbol(){
        this.raiz = null;
    }

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public void insertInfo(int num){
        NodoArbol nuevo = new NodoArbol(num);
        if(isEmpty()){
            this.raiz = nuevo;
        } else {
            insertInfo(this.raiz, nuevo);
        }
    }

    private void insertInfo(NodoArbol padre, NodoArbol nuevo){
        if(nuevo.getInfo() > padre.getInfo()){
            if(padre.getRight() == null){
                padre.setRight(nuevo);
            } else {
                insertInfo(padre.getRight(), nuevo);
            }
        } else {
            if (padre.getLeft() == null) {
                padre.setLeft(nuevo);
            } else {
                insertInfo(padre.getLeft(), nuevo);
            }
        }
    }

    public void orderPrints(int num){
        //String mensaje = "";

        switch (num){
            case 1://pre-order
                System.out.println("\n\nLista en pre-order: \n");
                pre_order(this.raiz);
                break;
            case 2: //post-order
                System.out.println("\n\nLista en post-order: \n");
                post_order(this.raiz);
                break;
            case 3://in-order
                System.out.println("\n\nLista en in-order: \n");
                in_order(this.raiz);

                break;
        }
    }


    private void pre_order(NodoArbol nodo){
        if (nodo != null){
            nodo.printInfo();
            pre_order(nodo.getLeft());
            pre_order(nodo.getRight());
        }
    }

    private void post_order(NodoArbol nodo){
        if (nodo != null) {
            post_order(nodo.getLeft());
            post_order(nodo.getRight());
            nodo.printInfo();
        }
    }

    private void in_order(NodoArbol nodo) {
      if (nodo != null) {
          in_order(nodo.getLeft());
          nodo.printInfo();
          in_order(nodo.getRight());
      }
    }

}
