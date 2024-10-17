package letra.DoWhile;

public class PdoWhile {
    public void drawPdoWhile(int tamano) {
        int ancho = tamano / 2 + 1; 
        int mitadAltura = tamano / 2;

        int fila = 1;
        do {
            int columna = 1;
            do {
                if (columna == 1 
                    || (fila == 1 && columna < ancho) 
                    || (fila == mitadAltura + 1 && columna < ancho) 
                    || (columna == ancho && fila <= mitadAltura + 1)) 
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

