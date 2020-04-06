package Clases;
/**
 *
 * @author nehemoth
 */
public class ClaseB extends ClaseA {
    public int Z;
  public ClaseB (){
        this(0,0,0);
    }
    public ClaseB(int z, int x, int y) {
        super(x, y);
        Z = z;
    }
  
    public int Sumero(){
    return Suma()+Z;
}
    @Override
    public void mostrar(){
    System.out.println("La suma es "+Suma());
}

}