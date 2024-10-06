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
        
        cont=1;
        acum=0;        
        while(cont<=numero){
            acum = acum + cont;
            cont++;
        }
        
        //Respostas:
        System.out.println("Somatório: "+acum);
        
        
    }    
}
