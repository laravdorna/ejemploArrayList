/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import utilidades.PedirDatos;

/**
 *
 * @author lvazquezdorna
 */
public class MetodosArrayList {

    public void engadir(ArrayList<Integer> listNumeros) {
        listNumeros.add(PedirDatos.entero("Numero:"));
    }

    public void amosarFor(ArrayList<Integer> listNumeros) {
        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println(listNumeros.get(i));
        }
    }

    public void amosarForEach(ArrayList<Integer> listNumeros) {
        for (Integer ele : listNumeros) {
            System.out.println(ele);
        }
    }

    public void amosarIterator(ArrayList<Integer> listNumeros) {
        Iterator it = listNumeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void borrarPosicion(int posicion, ArrayList<Integer> listNumeros) {

        listNumeros.remove(posicion-1);//borra el elemento en la posicion dada del array
    }

    public void borrarElemento(int elemento, ArrayList<Integer> listNumeros) {
        listNumeros.remove(new Integer(elemento));//borra el primer elemento con el valor dado
    }
    
    public void actualizarValor(Integer po,Integer novo, ArrayList<Integer> listNumeros){
        listNumeros.set(po-1,novo);
    }

}
