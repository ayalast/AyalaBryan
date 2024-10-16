package letra;

public class A {
    public void drawA(int tamano) {
        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= tamano; columna++) {
                if(columna == 1 && fila != 1
                || columna == tamano/2+1 && fila != 1 
                || fila == 1 && columna != 1 && columna < tamano*0.5
                || fila == tamano/2+1 && columna < tamano*0.7)
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
