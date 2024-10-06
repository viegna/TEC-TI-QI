
/**
 * Write a description of class Main here.
 * 
 * @author (Aline Zenker) 
 * @version (15/03/2018)
 */
public class Main{ //Inicío da classe
    public static void main(String []args){ //Torna a classe executável
        //Criando variáveis na memória:
        String nome;
        double nota1;
        double nota2;
        double media;
        
        //Atribuir valores:
        nome = "Vitória";
        nota1 = 10;
        nota2 = 8;
        
        //Cálculos:
        media = (nota1 + nota2)/2;
        
        //Respostas:
        System.out.println("---------------------------------");
        System.out.println(" RESPOSTAS ");
        System.out.println(" Nome: "+nome);
        System.out.println(" Nota 1: " +nota1);
        System.out.println(" Nota 2: "+nota2);
        System.out.println(" A média é: " +media);
        System.out.println("---------------------------------");
    }
}//fim da classe
