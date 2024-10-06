public class Funcionarios {
    private int codigo;
    private String nome;
    private String cpf;
    private double salario;
    private Endereco endereco;
    
    
    //metodo construtor
    public Funcionarios(){
        this.endereco=new Endereco();
    }
    
    //set e get 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //toString

    @Override
    public String toString() {
        return "" +
               "\nCódigo:"     + codigo         +
                 "\nNome:"     + nome           +
                 "\nCpf:"      + cpf            +
                 "\nSalario:"  + salario        +
                 "\nEndereco:" + endereco       +
               "\n*--------------------------*" ;
    }
    
    
    
    
}
