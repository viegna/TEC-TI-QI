
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        String nome;
        int diaNascimento;
        int mesNascimento;
        int anoAtual;
        int mesAtual;
        int diaAtual;
        int anoNascimento;
        int idade;
        String resposta;
        
        //Pede e le 
        System.out.println("Digite o nome da pessoa: ");
        nome=ler.nextLine();
        System.out.println("Digite o dia de nascimento: ");
        diaNascimento=ler.nextInt();
        System.out.println("Digite o mês de nascimento: ");
        mesNascimento=ler.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento=ler.nextInt();
        System.out.println("Digite o dia atual: ");
        diaAtual=ler.nextInt();
        System.out.println("Digite o mês atual: ");
        mesAtual=ler.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual=ler.nextInt();
        
        //calculos idade
        
        if(mesAtual<mesNascimento || mesNascimento==mesAtual && diaAtual<diaNascimento){
            idade=anoAtual-anoNascimento-1;
        }else{
            idade=anoAtual-anoNascimento;
        }
        
        //calculo signo
        
        if(mesNascimento==3 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==4 && diaNascimento>=1 && diaNascimento<=19){
            resposta="Você é do signo de Áries.";
        }else if(mesNascimento==4 && diaNascimento>=20 && diaNascimento<=30 || mesNascimento==5 && diaNascimento>=1 && diaNascimento<=20){
            resposta="Você é do signo de Touro.";
        }else if(mesNascimento==5 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==6 && diaNascimento>=1 && diaNascimento<=20){
            resposta="Você é do signo de Gêmeos.";
        }else if(mesNascimento==6 && diaNascimento>=21 && diaNascimento<=30 || mesNascimento==7 && diaNascimento>=1 && diaNascimento<=22){
            resposta="Você é do signo de Câncer.";
        }else if(mesNascimento==7 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==8 && diaNascimento>=1 && diaNascimento<=22){
            resposta="Você é do signo de Leão.";
        }else if(mesNascimento==8 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==9 && diaNascimento>=1 && diaNascimento<=22){
            resposta="Você é do signo de Virgem.";
        }else if(mesNascimento==9 && diaNascimento>=23 && diaNascimento<=30 || mesNascimento==10 && diaNascimento>=1 && diaNascimento<=22){
            resposta="Você é do signo de Libra.";
        }else if(mesNascimento==10 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==11 && diaNascimento>=1 && diaNascimento<=21){
            resposta="Você é do signo de Escorpião.";
        }else if(mesNascimento==11 && diaNascimento>=22 && diaNascimento<=30 || mesNascimento==12 && diaNascimento>=1 && diaNascimento<=20){
            resposta="Você é do signo de Sagitário.";
        }else if(mesNascimento==12 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==1 && diaNascimento>=1 && diaNascimento<=19){
            resposta="Você é do signo de Capricórnio.";
        }else if(mesNascimento==1 && diaNascimento>=20 && diaNascimento<=31 || mesNascimento==2 && diaNascimento>=1 && diaNascimento<=17){
            resposta="Você é do signo de Aquário.";
        }else{
            resposta="Você é do signo de Peixes.";
        }
        
        //validação e resposta
        if(anoNascimento>anoAtual){
            System.out.println("\fErro! Este ano não existe.");
        }else if(mesAtual<1 || mesAtual>12 || mesNascimento<1 || mesNascimento>12){
            System.out.println("\fErro! Este mês não existe.");
        }else if(diaAtual<1 || diaAtual>31 || diaNascimento<1 || diaNascimento>31){
            System.out.println("\fErro! Este dia não existe.");
        }else if(anoNascimento>anoAtual){
            System.out.println("\fErro! Este ano não existe.");
        }else if((mesNascimento==4 && diaNascimento==31 || mesNascimento==9 && diaNascimento==31 || mesNascimento==11) && diaNascimento==31 ){
            System.out.println("\fErro! Esse mês não possui 31 dias");
        }else if((mesAtual==4 && diaAtual==31 || mesAtual==6 && diaAtual==31 || mesAtual==9 && diaAtual==31 || mesAtual==11) && diaAtual==31 ){
            System.out.println("\fErro! Esse mês não possui 31 dias");
        }else if(diaNascimento==29 && mesNascimento==2 || diaAtual==29 && mesAtual==2 && anoNascimento%4==0 || anoAtual%4==0){
            System.out.println("\fErro! Este ano não é bissexto.");
        }else if(diaNascimento>diaAtual && anoNascimento==anoAtual){
            System.out.println("\fErro! Você não pode ter nascido!");
        }else if(mesNascimento>mesAtual && anoNascimento==anoAtual){
            System.out.println("\fErro! Você não pode ter nascido!");
        }else{
               System.out.println("\fNome: "+nome+"\nData de nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
            System.out.println("Data Atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
            System.out.println("Você tem " +idade+" anos." );
            System.out.println(resposta); 
            
        }
          
}
}