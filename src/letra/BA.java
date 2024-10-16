package letra;

public class BA {
    public void drawBA(int tamano) {
        int anchoB = tamano / 2 + 1;
        int anchoA = tamano / 2 + 1;
        int espacioEntreLetras = 2;
        int anchoTotal = anchoB + espacioEntreLetras + anchoA;

        for (int fila = 1; fila <= tamano; fila++) {
            // Dibujar B
            for (int columna = 1; columna <= anchoB; columna++) {
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
            }

            // Espacio entre letras
            for (int e = 0; e < espacioEntreLetras; e++) {
                System.out.print("  ");
            }

            // Dibujar A
            for (int columna = 1; columna <= anchoA; columna++) {
                if (columna == 1 && fila != 1 
                    || columna == anchoA && fila != 1 
                    || fila == 1 && columna > 1 && columna < anchoA 
                    || fila == tamano / 2 + 1) 
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


