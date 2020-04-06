package Clases;

import Interfaces.*;

/**
 *
 * @author nehemoth
 */
public class ClaseA {
    public int X,Y;

    public ClaseA(int x, int y) {
        X = x;
        Y = y;
   
    }
    
public ClaseA(){
    this(0,0);
}

public int Suma() {
    return X+Y;
}
public void mostrar(){
    
}


}