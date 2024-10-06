
/**
 * Write a description of class Main here.
 *
 * @author (W.Nefi)
 * @version (Aula 8)
 */
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
      Scanner ler = new Scanner(System.in);
      System.out.print("\f");
      int num;
      String resposta;
      System.out.println("Digite um número que equivale \na um mês do ano: ");
      num = ler.nextInt();
      if(num==1){
          resposta = "O número equivale ao mês de Janeiro";
        }else if(num==2){
            resposta = "O número equivale ao mês de Feveiro";
        }else if(num==3){
            resposta = "O número equivale ao mês de Abril";
        }else if(num==4){
            resposta = "O número equivale ao mês de Março";
        }else if(num==5){
            resposta = "O número equivale ao mês de Maio";
        }else if(num==6){
            resposta = "O número equivale ao mês de Junho";
        }else if(num==7){
            resposta = "O número equivale ao mês de Julho";
        }else if(num==8){
            resposta = "O número equivale ao mês de Agosto";
        }else if(num==9){
            resposta = "O número equivale ao mês de Setembro";
        }else if(num==10){
            resposta = "O número equivale ao mês de Outubro";
        }else if(num==11){
            resposta = "O número equivale ao mês de Novembro";
        }else if(num==12){
            resposta = "O número equivale ao mês de Dezembro";
        }else{
            resposta = "Esse número não equivale a nenhum mês";
        }
        System.out.println("\f" +num); 
        System.out.println( resposta);

   }
}