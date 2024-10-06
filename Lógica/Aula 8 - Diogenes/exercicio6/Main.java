
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler= new Scanner(System.in);
        //variaveis
        int numero;
        String resposta;
        //pede e le
        System.out.println("Digite o nº: ");
        numero= ler.nextInt();
        //calculos
        if(numero==1){
            resposta="domingo.";
        }else if(numero==2){
            resposta="segunda-feira.";
        }else if(numero==3){
            resposta="terça-feira.";
        }else if(numero==4){
            resposta="quarta-feira.";
        }else if(numero==5){
            resposta="quinta-feira.";
        }else if(numero==6){
            resposta="sexta-feira.";
        }else if(numero==7){
            resposta="sábado";
        }else{
            resposta="nulo.";
    }
    //Respostas
    System.out.println("______________________________________________________");
    System.out.println("Se o número for "+numero+", o dia correspondente é "+resposta);
    System.out.println("______________________________________________________");
}
}
