
import java.util.Scanner;

/**
 *
 * @author DIOGENES
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        Nota n1= new Nota();
        
        double nota;
        for(int i=0; i<n1.getNotas().length;i++){
            System.out.println("Digite a nota: ");
            nota=ler.nextDouble();
        n1.cadastrar(i, nota);
        
    }
        System.out.println(n1);
    
}
