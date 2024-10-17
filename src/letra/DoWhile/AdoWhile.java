package letra.DoWhile;

public class AdoWhile {
    public void drawAdoWhile(int tamano) {
        int ancho = tamano / 2 + 1;
        
        int fila = 1;
        do {
            int columna = 1;
            do {
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
            } while (columna <= ancho);
            System.out.println();
            fila++;
        } while (fila <= tamano);
    }
}

