
import java.util.Scanner;

/**
 *
 * @author Diogenes
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    CalcularMedia cm1=new CalcularMedia();
    
    //menu
    byte menu;
    do{
        System.out.println("\n1 - Informar dados\n2 - Ver dados\n3 - Ver Respostas\n0 - Sair");
        menu=ler.nextByte();
        switch(menu){ // pede e le
            case 1:
                System.out.println("\nDigite o nome do Aluno: ");
                ler.nextLine();
                cm1.nome=ler.nextLine();
                //pede e le
                //validação do pede e le da nota 3
                do{
                    System.out.println("Digite a nota 1 do aluno: ");
                    cm1.nota1=ler.nextDouble();
                    if(cm1.nota1<0 || cm1.nota1 >10){
                        System.out.println("Erro! A nota 1 inserida é inválida!(<0 ou >10)");
                        }
                }while(cm1.nota1<0 || cm1.nota1>10);
                //validação do pede e lê da nota 2
                do{    
                    System.out.println("Digite a nota 2 do aluno: ");
                    cm1.nota2=ler.nextDouble();
                    if(cm1.nota2<0 || cm1.nota2>10 ){
                        System.out.println("Erro! A nota 2 inserida é inválida!(<0 ou >10)");
                    }
                }while(cm1.nota2<0 || cm1.nota2>10);
                //validação do pede e le nota 3
                do{
                    System.out.println("Digite a nota 3 do aluno: ");
                    cm1.nota3=ler.nextDouble();
                    if(cm1.nota3<0 || cm1.nota3>10){
                        System.out.println("Erro! A nota 3 inserida é inválida!(<0 ou >10)");
                    }
                }while(cm1.nota3<0 || cm1.nota3>10);
                
                break;
            case 2:
                System.out.println("\nNome: "+cm1.nome);
                System.out.println("Nota 1: "+cm1.nota1);
                System.out.println("Nota 2: "+cm1.nota2);
                System.out.println("Nota 3: "+cm1.nota3);
                break;
            case 3:
                System.out.println("\nA média do aluno "+cm1.nome+" é: "+cm1.calcularMedia());
                System.out.println("O conceito do mesmo é: "+cm1.retornarConceito());
                break;
            default:
                System.out.println("Adios Muchacho!");
                
        }
    }while(menu!=0);
    
    }
    
}
