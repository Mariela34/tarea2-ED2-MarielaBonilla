package bonilla.mariela.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Principal {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private PrintStream out = new PrintStream(System.out);

    public void mostrarMenu(){
        out.println("1.Ingresar dato a árbol");
        out.println("2.Imprimir en pre-orden");
        out.println("3.Imprimir post-orden");
        out.println("4.Imprimir en in-orden");
        out.println("5.Salir");
    }

    public int leerNum() throws IOException {
        return Integer.parseInt(in.readLine()) ;
    }

    public void imprimirMensaje(String texto){
        out.println(texto);
    }

}
