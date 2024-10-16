package letra;

public class S {
    public void drawS(int tamano) {
        int ancho = Math.max(4, tamano / 2); 
        
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= ancho; columna++) {
                if (fila == 1 || fila == tamano || fila == tamano / 2 + 1 ||
                    (columna == 1 && fila <= tamano / 2 + 1) ||
                    (columna == ancho && fila > tamano / 2))
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

