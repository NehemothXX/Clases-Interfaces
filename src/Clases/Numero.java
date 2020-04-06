/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nehemoth
 */
public class Numero extends ClaseA implements Comparable<Numero>{
    public Numero (int numero){
        this.numero=numero;
    }

    @Override
    public int compareTo(Numero o) {
        if(numero==o.numero){
            return 0;
        }
        else if (numero>o.numero){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public int numero;
}
