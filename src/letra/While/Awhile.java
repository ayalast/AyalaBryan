package letra.While;

public class Awhile {
    public void drawAwhile(int tamano) {
        int ancho = tamano / 2 + 1;
        
        int fila = 1;
        while (fila <= tamano) {
            int columna = 1;
            while (columna <= ancho) {
                if (columna == 1 && fila != 1 
                    || columna == ancho && fila != 1 
                    || fila == 1 && columna > 1 && columna < ancho 
                    || fila == tamano / 2 + 1) 
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
