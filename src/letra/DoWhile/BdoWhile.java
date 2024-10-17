package letra.DoWhile;

public class BdoWhile {
    public void drawBdoWhile(int tamano) {
        int fila = 1;
        do {
            int columna = 1;       
            do {
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
                columna ++;
            } while (columna <= tamano);
            fila ++;   
            System.out.println();
        } while (fila <= tamano);
         
    }
}