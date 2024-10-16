package letra;

public class B {
    public void drawB(int tamano) {
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= tamano; columna++) {
                if (columna == 1 
                    || (fila == 1 && columna <= tamano / 2)
                    || (fila == tamano / 2 + 1 && columna <= tamano / 2)
                    || (fila == tamano && columna <= tamano / 2) 
                    || (columna == tamano / 2 + 1 && fila != 1 && fila != tamano))
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
