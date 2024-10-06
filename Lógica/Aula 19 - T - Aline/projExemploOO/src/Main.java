import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Instanciar a classe:
        Aluno a1 = new Aluno();
        //Pede e lê:
        System.out.println("Digite o nome:");
        a1.nome = ler.nextLine();
        
        do{
            System.out.println("Digite a nota 1:");
            a1.nota1 = ler.nextDouble();
            if(a1.nota1<0 || a1.nota1>10){
                System.out.println("ERRO! Nota inválida");
            }
        }while(a1.nota1<0 || a1.nota1>10);
        
        do{
            System.out.println("Digite a nota 2:");
            a1.nota2 = ler.nextDouble();
            if(a1.nota2<0 || a1.nota2>10){
                System.out.println("ERRO! Nota inválida");
            }
        }while(a1.nota2<0 || a1.nota2>10);
        
        //Respostas:
        System.out.println("\nRESPOSTAS:");
        System.out.println("Nome: "+a1.nome);
        System.out.println("Nota 1: "+a1.nota1);
        System.out.println("Nota 2: "+a1.nota2);
        System.out.println("Média: "+a1.calcularMedia());
        System.out.println("Resultado: "+a1.retornarResultado());
    }    
}
