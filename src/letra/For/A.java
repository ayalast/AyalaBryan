package letra.For;

public class A {
    public void drawA(int tamano) {
        int ancho = tamano / 2 + 1;
        
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= ancho; columna++) {
                if (columna == 1 && fila != 1 
                    || columna == ancho && fila != 1 
                    || fila == 1 && columna > 1 && columna < ancho 
                    || fila == tamano / 2 + 1) 
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
