
package letra;

public class S {
    public void drawS(int tamano) {
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= tamano; columna++) {
                if(fila == 1 && columna <= tamano*0.7 
                || fila == tamano && columna <= tamano*0.7
                || fila == tamano/2 + 1 && columna <= tamano*0.7               
                || (columna == 1 && fila <= tamano/2 + 1)
                || (columna == tamano/2+1 && fila > tamano/2))
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
