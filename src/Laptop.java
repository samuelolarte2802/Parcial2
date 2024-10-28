public class Laptop extends Producto implements Vendible{

    private int memoriaRam;

    public Laptop(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock, int memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void calcularPrecioVenta(int cantidad) {

        double precio = 0;
        if (getMarca().equals("HP")){

            precio = 500000;


        } else if (getMarca().equals("Asus")){

            precio = 1000000;


        } else if (getMarca().equals("Acer")){

            precio = 750000;


        } else if (getMarca().equals("Mac")){

            precio = 2000000;


        }
        if (memoriaRam == 2){

            precio += 200000;

        } else if (memoriaRam == 4) {

            precio += 400000;

        } else if (memoriaRam == 8) {

            precio += 800000;

        } else if (memoriaRam == 16) {

            precio += 1600000;

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
        System.out.println("Memoria RAM: " + memoriaRam);
        System.out.println("En Stock: " + getCantidadStock());

    }
}
