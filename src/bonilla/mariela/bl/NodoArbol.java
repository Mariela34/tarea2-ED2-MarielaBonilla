package bonilla.mariela.bl;

public class NodoArbol {
    private NodoArbol left;
    private NodoArbol right;
    private int info;

    public NodoArbol(int info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    public NodoArbol getLeft() {
        return left;
    }

    public void setLeft(NodoArbol left) {
        this.left = left;
    }

    public NodoArbol getRight() {
        return right;
    }

    public void setRight(NodoArbol right) {
        this.right = right;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void printInfo() {
        System.out.print("-" + this.getInfo());
    }
}
