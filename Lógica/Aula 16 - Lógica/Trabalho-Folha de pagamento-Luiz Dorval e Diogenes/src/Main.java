/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (Luiz e Diogenes) 
 * @version (Trabalho)
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        //variaveis
        String nome;
        String cpf;
        String cargo;
        double valorHora;
        double horasTrabalhadas;
        double valorTotalPassagem;
        int quantidadeDependentes;
        byte tipoInsalubridade;
        double totalInsalubridade;
        double salarioBruto;
        double valeTransporte;
        double passagemCobrada;
        double beneficioDependente;
        double inss;
        double salarioLiquido;
        String resposta;
        //pede e le
        System.out.println("Digite o nome do funcionário: ");
        nome=ler.nextLine();
        System.out.println("Digite o CPF: ");
        cpf=ler.nextLine();
        System.out.println("Digite o seu cargo");
        cargo=ler.nextLine();
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora=ler.nextDouble();
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas=ler.nextDouble();
        System.out.println("Digite o valor total da passagem: ");
        valorTotalPassagem=ler.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        quantidadeDependentes=ler.nextInt();
        System.out.println("Escolha o tipo de insalubridade: ");
        System.out.println("1 - Nenhum\n2-Mínimo\n3 - Média\n4 - Máxima");
        tipoInsalubridade=ler.nextByte();
        
        //calculando salario bruto
        salarioBruto=valorHora*horasTrabalhadas;
        //calculando valeTransporte
        valeTransporte=salarioBruto*0.06;
        if(valeTransporte>valorTotalPassagem){
            passagemCobrada=valorTotalPassagem;
        }else{
            passagemCobrada=valeTransporte;
        }
        //calculando Salario Familia
        if(salarioBruto<=725.02){
            beneficioDependente=37.18*quantidadeDependentes;
        }else if(salarioBruto>=753.03 && salarioBruto<=1089.72){
            beneficioDependente=26.2*quantidadeDependentes;
        }else{
            beneficioDependente=0;
        }
        
        //calculando insalubridade
        
        switch(tipoInsalubridade){
            case 1:
            totalInsalubridade=0;
            break;
            case 2:
            totalInsalubridade=868*0.10;
            break;
            case 3:
            totalInsalubridade=868*0.20;
            case 4:
            totalInsalubridade=868*0.40;
            break;
            default:
            totalInsalubridade=0;
        }
        //calculando inss
        if(salarioBruto<=1317.07){
            inss=salarioBruto*0.08;
        }else if(salarioBruto>=1317.08 && salarioBruto<=2195.12){
            inss=salarioBruto*0.09;
        }else{
            inss=salarioBruto*0.11;
        }
        //calculando o salário líquido:
        salarioLiquido=salarioBruto+beneficioDependente+totalInsalubridade-inss-passagemCobrada;
        //Mostra na tela:
        if(valorHora<0 || horasTrabalhadas<0 || valorTotalPassagem<0 || quantidadeDependentes<0 ){
            System.out.println("Erro de digitação! O valor não pode ser menor que zero!");
        }else if(tipoInsalubridade<1 || tipoInsalubridade>4){
            System.out.println("Erro de digitação! O valor não pode ser menos que um ou maior que quatro!");
        }else{
        System.out.println("\f═ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ═");
        System.out.println("Nome do funcionário: "+nome+"\nCargo do funcionário: "+cargo+"\nCpf do funcionário: "+cpf+"\nO ganho por hora do funcionário "+nome+" é de: R$"+valorHora);
        System.out.println("O funcionário "+nome+" trabalhou "+horasTrabalhadas+" horas");
        System.out.println(nome+" seu salário bruto é de: R$"+salarioBruto);
        System.out.println("A sua quantidade de dependentes é: "+quantidadeDependentes+"\nO seu salário família é: R$"+beneficioDependente);
        System.out.println("A passagem cobrada é de: R$"+passagemCobrada);
        System.out.println("O seu total de insalubridade é de : R$"+totalInsalubridade);
        System.out.println("O seu inss é: R$"+inss);
        System.out.println("O seu salário líquido é de: R$"+salarioLiquido);
        System.out.println("═ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ══ ═");
    }
}
}