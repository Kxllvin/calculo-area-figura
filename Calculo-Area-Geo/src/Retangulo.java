
public class Retangulo extends Figura {
    public void CalcularArea() {
        area = altura * base;
    }
    
    public static void main (String[] args) {
        Retangulo Ret = new Retangulo();
        Ret.LerAlturaBase();
        Ret.CalcularArea();
        Ret.MostrarArea();
    }
}