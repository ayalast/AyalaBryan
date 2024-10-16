import letra.B;
import letra.S;
import letra.A;
import letra.P;
import letra.BA;


public class App {
    public static void main(String[] args) throws Exception {
        int tamano = 7;
        B opB = new B();
        S opS = new S();
        A opA = new A();
        P opP = new P();
        BA opBA = new BA();

        opB.drawB(tamano);
        System.out.println();
        opS.drawS(tamano);
        System.out.println();
        opA.drawA(tamano);
        System.out.println();
        opP.drawP(tamano);
        System.out.println();
        opBA.drawBA(tamano);
    }
    
}
