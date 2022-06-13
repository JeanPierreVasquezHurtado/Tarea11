package AsociacionYComposicion;
//COMPOSICION
public class Bateria {

    private int mAh;
    private String marca;

    public Bateria(int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }

    public void mostrar()
    {
        System.out.println("Cantidad de mAh: "+ mAh);
        System.out.println("Marca: "+marca);
    }
}
