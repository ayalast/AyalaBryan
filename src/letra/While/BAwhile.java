package letra.While;

public class BAwhile {
    public void drawBAwhile(int tamano) {
        int anchoB = tamano / 2 + 1;
        int anchoA = tamano / 2 + 1;
        int espacioEntreLetras = 2;
        int anchoTotal = anchoB + espacioEntreLetras + anchoA;

        int fila = 1;
        while (fila <= tamano) {
            int columna = 1;
            while (columna <= anchoB) {
                if (columna == 1 
                    || (fila == 1 && columna <= anchoB - 1)
                    || (fila == tamano / 2 + 1 && columna <= anchoB - 1)
                    || (fila == tamano && columna <= anchoB - 1) 
                    || (columna == anchoB && fila != 1 && fila != tamano / 2 + 1 && fila != tamano))
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            }

            int e = 0;
            while (e < espacioEntreLetras) {
                System.out.print("  ");
                e++;
            }
            
            columna = 1;
            while (columna <= anchoA) {
                if (columna == 1 && fila != 1 
                    || columna == anchoA && fila != 1 
                    || fila == 1 && columna > 1 && columna < anchoA 
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

