package letra;

public class BA {
    public void drawBA(int tamano) {
        for (int fila = 1; fila <= tamano+2; fila++) {
            for (int columna = 1; columna <= tamano+2; columna++) {
                if(columna == 1 && fila <= tamano
                || columna == tamano/2 + 1 && fila != 1 && fila != tamano && fila <= tamano 
                || columna == tamano/2 + 3 && fila != 1 && fila <= tamano
                || columna == tamano + 2 && fila != 1 && fila <= tamano
                || fila == 1 && columna < tamano/2+1
                || fila == 1 && columna > tamano - 1 && columna != tamano + 2
                || fila == 4 && columna != tamano/2 + 2
                || fila == tamano && columna < tamano/2 + 1
                )
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