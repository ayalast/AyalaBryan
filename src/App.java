import letra.B;
import letra.S;

public class App {
    public static void main(String[] args) throws Exception {
        int tamano = 7;
        B op = new B();
        S opp = new S();

        op.drawB(tamano);
        System.out.println();
        
        opp.drawS(tamano);
    }
    
}
