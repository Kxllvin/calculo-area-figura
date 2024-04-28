import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */

abstract class Figura {
    int area, altura, base;

    public abstract void CalcularArea();


    public void LerAlturaBase(){
        String StrAlt = JOptionPane.showInputDialog("Informe a altura: ");

        altura = Integer.parseInt(StrAlt);
        String Strbase = JOptionPane.showInputDialog("Informe a base: ");
        base = Integer.parseInt(Strbase);
    }

    public void MostrarArea(){
    JOptionPane.showMessageDialog(null,"Area Total: " + area);
    }
}