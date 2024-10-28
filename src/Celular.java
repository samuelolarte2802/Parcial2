public class Celular extends Producto implements Vendible{

    private int capacidadBateria;

    @Override
    public void calcularPrecioVenta(int cantidad) {

        double precio = 0;
        if (getMarca().equals("IPhone")){

            precio = 1000000;

        }else if (getMarca().equals("Samsung")) {

            precio = 750000;

        } else if (getMarca().equals("Xiaomi")) {

            precio = 500000;

        }

        if (capacidadBateria == 5000){

            precio += 50000;

        } else if (capacidadBateria == 10000) {

            precio += 100000;

        } else if (capacidadBateria == 20000) {

            precio += 200000;

        }

        if (cantidad >= 5){

            double descuento = precio * 0.10;
            precio = precio - descuento;
            setPrecio(precio);
        }else {

            setPrecio(precio);

        }
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Nombre: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Capacidad Bateria: " + capacidadBateria + "AMP");
        System.out.println("En Stock: " + getCantidadStock());

    }
}
