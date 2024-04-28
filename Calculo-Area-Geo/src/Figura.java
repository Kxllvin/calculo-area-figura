import java.util.Scanner;

/**
 *
 * @author Alunos
 */

abstract class Figura {
    int area, altura, base;

    public abstract void CalcularArea();


    public void LerAlturaBase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a altura: ");
        altura = scan.nextInt();
        System.out.println("Informe a base: ");
        base = scan.nextInt();
    scan.close();
    }

    public void MostrarArea(){
    System.out.println("Area Total: " + area);
    }
}