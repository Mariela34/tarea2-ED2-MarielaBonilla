package bonilla.mariela.ui;

import bonilla.mariela.cl.Gestor;

import java.io.IOException;

public class Controller {
   private Principal ui = new Principal();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() throws IOException {
        int option = 5;

        ui.imprimirMensaje("\nBienvenido");

        do {
            ui.mostrarMenu();
            ui.imprimirMensaje("Ingrese una opción");
            option = ui.leerNum();
            execAction(option);
        }while (option!=5);
    }

    public void execAction(int op) throws IOException {
        switch (op){
            case 1:
                ui.imprimirMensaje("Ingrese un número:");
                int num = ui.leerNum();
                gestor.insertData(num);
                break;
            case 2: case 3: case 4:
                gestor.prints(op);
                break;
            case 5:
                ui.imprimirMensaje("Te esperamos pronto");
                break;
            default:
                ui.imprimirMensaje("Opción inválida");
                break;
        }
    }
}
