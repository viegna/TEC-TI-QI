/**
 *
 * @author Douglas Gomes
 */
public class Endereco{ 
    //Atributos: 
    private String rua; 
    private String cidade; 
    private String bairro; 
    private String uf; 
    private String numero; 
    private String cep; 
    private String complemento; 

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "\n     | Rua: " + rua +
               "\n     | Cidade: " + cidade +
               "\n     | Bairro: " + bairro +
               "\n     | Uf: " + uf + 
               "\n     | Numero: " + numero + 
               "\n     | Cep: " + cep + 
               "\n     | Complemento: " + complemento+
               "\n     *---------------------------*\n";
    }
    
    
}