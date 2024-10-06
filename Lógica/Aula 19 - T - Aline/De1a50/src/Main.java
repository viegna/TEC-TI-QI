import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Mostrando só os pares até 50
        int cont;
        for(cont=1;cont<=50;cont++){
            if(cont%2==0){
                System.out.println(cont);
            }
        }

    }
}