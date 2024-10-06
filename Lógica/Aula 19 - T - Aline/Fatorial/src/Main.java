import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Variáveis:
        int numero;
        int cont;
        int acum;
        
        do{
            System.out.println("Digite um nº");
            numero = ler.nextInt();
            if(numero<0){
                System.out.println("ERRO! Nº negativo");
            }
        }while(numero<0);
        
        //Processamento:
        acum=1;        
        for(cont=1;cont<=numero; cont++){
            acum = acum * cont;            
        }
        
        //Respostas:
        System.out.println("Fatorial: "+acum);
        
        
    }    
}
