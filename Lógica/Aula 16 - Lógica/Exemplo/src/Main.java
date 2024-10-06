
import java.util.Scanner;

/**
 *
 * @author Diogenes W
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //variaveis
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;
        String conceito;
        
        //pede e le
        System.out.println("Digite o nome");
        nome=ler.nextLine();
        System.out.println("Digite a nota1: ");
        nota1=ler.nextDouble();
        System.out.println("Digite a nota2: ");
        nota2=ler.nextDouble();
        System.out.println("Digite a nota3: ");
        nota3=ler.nextDouble();
        
        //calculo
        media=(nota1+nota2+nota3)/3;
        
        //media
       if(media>=9){
           conceito="A";
       }else if(media >=8 && media<=8.9){
           conceito="B";
       }else if(media>=6 && media<=7.9){
           conceito="C";
       }else{
           conceito="D";
       }
       //validação
       if(nota1<0 || nota1>10 || nota2<0 || nota2 >10 || nota3<0 || nota3>10){
           System.out.println("Dados Inválidos!");
       }else{
           System.out.println("\n\n-------------------------------------------\n           Respostas: " );
           System.out.println("Com n1="+nota1+", n2="+nota2+" e n3="+nota3);
            System.out.println("O conceito do aluno "+nome+",é: "+media);
       }
       
       
       
        
    }
}
