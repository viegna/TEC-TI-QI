import java.util.Scanner;
/**
 *
 * dio
 */
public class Main {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
        /*  teste
        String nome;
        int numeroUm;
        int numeroDois;
        int notaTotal;
        
        
        System.out.println("Digite a nota numero um: ");
        numeroUm= ler.nextInt();
        System.out.println("Digite a nota numero dois: ");
        numeroDois=ler.nextInt();
        
        notaTotal= (numeroUm+numeroDois)/2;
        System.out.println("Nota total é: "+notaTotal);
        */
        
        // Instancia a classe e cria o obj
        Aluno a1= new Aluno();
        
        // pede info
        
        System.out.println("Digite a nota 1 do aluno: ");
        a1.nota1=ler.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        a1.nota2=ler.nextDouble();
        
        System.out.println("A média do aluno é: "+a1.calcularMedia()+" e ele foi "+a1.retornarResultado());
        
    }
    
}
