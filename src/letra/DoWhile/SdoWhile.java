package letra.DoWhile;

public class SdoWhile {
    public void drawSdoWhile(int tamano) {
        int ancho = Math.max(4, tamano / 2); 
        
        int fila = 1;
        do {
            int columna = 1;
            do {
                if (fila == 1 || fila == tamano || fila == tamano / 2 + 1 ||
                    (columna == 1 && fila <= tamano / 2 + 1) ||
                    (columna == ancho && fila > tamano / 2))
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            } while (columna <= ancho);
            System.out.println();
            fila++;
        } while (fila <= tamano);
    }
}
