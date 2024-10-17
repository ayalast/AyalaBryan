package letra.For;

public class P {
    public void drawP(int tamano) {
        int ancho = tamano / 2 + 1; 
        int mitadAltura = tamano / 2;

        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= ancho; columna++) {
                if (columna == 1 
                    || (fila == 1 && columna < ancho) 
                    || (fila == mitadAltura + 1 && columna < ancho) 
                    || (columna == ancho && fila <= mitadAltura + 1)) 
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
