package letra.DoWhile;

public class BAdoWhile {
    public void drawBAdoWhile(int tamano) {
        int anchoB = tamano / 2 + 1;
        int anchoA = tamano / 2 + 1;
        int espacioEntreLetras = 2;
        int anchoTotal = anchoB + espacioEntreLetras + anchoA;

        int fila = 1;
        do {
            int columna = 1;
            do {
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
            } while (columna <= anchoB);

            int e = 0;
            do {
                System.out.print("  ");
                e++;
            } while (e < espacioEntreLetras);

            columna = 1;
            do {
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
            } while (columna <= anchoA);

            System.out.println();
            fila++;
        } while (fila <= tamano);
    }
}
