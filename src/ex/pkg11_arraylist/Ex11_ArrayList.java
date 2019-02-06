package ex.pkg11_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex11_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        int opcion;
        MetodosArrayList datos = new MetodosArrayList();
        lista.add(4);
        lista.add(5);
        lista.add(36);
        lista.add(2);

        do {
            System.out.println("*****MENU****"
                    + "\n1=> Añadir elemento"
                    + "\n2=> Mostrar");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Teclea opcion:"));

            switch (opcion) {
                case 1:
                    datos.engadir(lista);
                    break;
                case 2: {
                    int op = 0;
                    do {
                        System.out.println("*****MENU MOSTRAR****"
                                + "\n1=> FOR"
                                + "\n2=> FOREACH"
                                + "\n ITERATOR");
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Teclea opcion:"));
                    } while (op < 4);
                    switch (op) {
                        case 1:
                            datos.amosarFor(lista);
                            break;
                        case 2:
                            datos.amosarForEach(lista);
                            break;
                        case 3:
                            datos.amosarIterator(lista);
                            break;

                    }
                }
                break;
                case 3:
                    datos.borrarPosicion(PedirDatos.entero("dame la posicion: "), lista);
                    break;
                case 4://borrar elemento
                    datos.borrarElemento(PedirDatos.entero("Elemento que desea elmimiar"), lista);
                    break;
                case 5:
                    datos.actualizarValor(PedirDatos.entero("posición a cambiar"), PedirDatos.entero("Nuevo dato"), lista);
                    break;
                default:
                    System.out.println("No existe la opcion, tecle entre 1-6");
                case 0:
                    System.out.println("Hasta otra");
                    System.exit(0);
            }
        } while (opcion < 5);

//        lista.add("aaaa");
//        lista.add(new Integer(2));
//        lista.add(4);
//        System.out.println(lista.size());
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }
    }

    // metodo que limpia la consola para que no aparezca lo anterior 
    public void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    
}
