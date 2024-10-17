package letra.While;

public class Pwhile {
    public void drawPwhile(int tamano) {
        int ancho = tamano / 2 + 1;
        int mitadAltura = tamano / 2;

        int fila = 1;
        while (fila <= tamano) {
            int columna = 1;
            while (columna <= ancho) {
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
            }
            System.out.println();
            fila++;
        }
    }
}

