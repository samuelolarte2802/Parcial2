import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String correo;
    List<Producto> listaP = new ArrayList<Producto>();

    public void comprarProducto(Producto producto, int cantidad){

        listaP.add(producto);

    }
    public void mostrarCompra(){

        System.out.println(listaP);

    }
}
