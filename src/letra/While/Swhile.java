package letra.While;

public class Swhile {
    public void drawSwhile(int tamano) {
        int ancho = Math.max(4, tamano / 2); 
        
        int fila = 1;
        while (fila <= tamano) {
            int columna = 1;
            while (columna <= ancho) {
                if (fila == 1 || fila == tamano || fila == tamano / 2 + 1 ||
                    (columna == 1 && fila <= tamano / 2 + 1) ||
                    (columna == ancho && fila > tamano / 2))
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            }
            System.out.println();
            fila++;
        }
    }
}
