package letra.While;

public class Bwhile {
    public void drawBwhile(int tamano) {
        int fila = 1;       
        while (fila <= tamano){
            int columna = 1;
            while (columna <= tamano){
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
            }
            fila ++;   
            System.out.println(); 
        }
         
    }
}
