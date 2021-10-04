package pilasowo;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pilas1 p; 
        p = new Pilas1();
        informacion1 elem;
        int opc, posicion;
        do {
            System.out.println("---------------------------------");
            System.out.println("Ingresa la opcion");
            System.out.println("1.- Inserta nodo");
            System.out.println("2.- Imprimir");
            System.out.println("3.- Elimina al inicio");
            System.out.println("4.- Empty");
            System.out.println("5.- Peek");
            System.out.println("6.- Desencripta");
            System.out.println("7.- Invierte Pila");
            System.out.println("8.- Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    elem = new informacion1((int) (Math.random() * 100 + 1));
                    p.Push(elem);
                    break;
                case 2:
                    p.imprime();
                    break;
                case 3:
                    p.Pop();
                    break;
                case 4:
                    p.Empty();
                    break;
                case 5:
                    p.Peek();
                    break;
                case 6:
                    p.Desencripta(p);
                    break;
                case 7:
                    p.invertir(p);
            }
        } while (opc != 8);
    }
}
