import letra.DoWhile.SdoWhile;
import letra.For.A;
import letra.For.B;
import letra.For.BA;
import letra.For.P;
import letra.For.S;



public class App {
    public static void main(String[] args) throws Exception {
        int tamano = 7;
        B opB = new B();
        S opS = new S();
        A opA = new A();
        P opP = new P();
        BA opBA = new BA();
        SdoWhile SW = new SdoWhile();


        opB.drawB(tamano);
        System.out.println();
        opS.drawS(tamano);
        System.out.println();
        opA.drawA(tamano);
        System.out.println();
        opP.drawP(tamano);
        System.out.println();
        opBA.drawBA(tamano);
        System.out.println();
        SW.drawSdoWhile(tamano);
    }
    
}
