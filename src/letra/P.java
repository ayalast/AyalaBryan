package letra;

public class P {
    public void drawP(int tamano) {
        int ancho = tamano / 2 + 1; // Asegura que el ancho sea proporcional a la altura
        int mitadAltura = tamano / 2;

        for (int fila = 1; fila <= tamano; fila++) {
            for (int columna = 1; columna <= ancho; columna++) {
                if (columna == 1 // Línea vertical izquierda
                    || (fila == 1 && columna < ancho) // Línea horizontal superior
                    || (fila == mitadAltura + 1 && columna < ancho) // Línea horizontal media
                    || (columna == ancho && fila <= mitadAltura + 1)) // Línea vertical derecha (mitad superior)
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
