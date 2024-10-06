
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
        System.out.print("Digite o número: ");
        numero= ler.nextInt();
        
        //calculos
        if(numero==1){
            resposta="Janeiro.";
        }else if(numero==2){
            resposta="Fevereiro.";
        }else if(numero==3){
            resposta="Março.";
        }else if(numero==4){
            resposta="Abril.";
        }else if(numero==5){
            resposta="Maio.";
        }else if(numero==6){
            resposta="Junho.";
        }else if(numero==7){
            resposta="Julho.";
        }else if(numero==8){
            resposta="Agosto.";
        }else if(numero==9){
            resposta="Setembro.";
        }else if(numero==10){
            resposta="Outubro.";
        }else if(numero==11){
            resposta="Novembro.";
        }else if(numero==12){
            resposta="Dezembro.";
        }else{
            resposta="nulo.";
    }
    //respostas
    System.out.println("______________________________________________________");
    System.out.println("O mês correspondente ao número "+numero+" é "+resposta);
    System.out.println("______________________________________________________");
}
}
