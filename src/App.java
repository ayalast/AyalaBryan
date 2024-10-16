import letra.B;
import letra.S;
import letra.A;
import letra.P;



public class App {
    public static void main(String[] args) throws Exception {
        int tamano = 7;
        B op = new B();
        S opp = new S();
        A oppp = new A();
        P opppp = new P();

        op.drawB(tamano);
        System.out.println();
        opp.drawS(tamano);
        System.out.println();
        oppp.drawA(tamano);
        System.out.println();
        opppp.drawP(tamano);
    }
    
}
