import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        do {

        }while (opc != 3){

            System.out.println("""
                    Technology Enterprise
                    1)Empresa
                    2)Cliente
                    Que usuario es: """);
            opc = scan.nextInt();
            switch (opc){

                case 1:

                    System.out.println("""
                            1) Agregar Producto
                            2) Mostar Stock""");
                    String opc1 = "";
                    opc1 = scan.next();
                    switch (opc1){

                        case "1":

                            break;

                    }
                    break;

            }

        }

    }
}