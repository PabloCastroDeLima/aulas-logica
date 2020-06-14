public class PessoaJuridica extends Pessoa {
    
    private String razaoSocial;
    private String cnpj;
    private double inscricaoEstadual;
    private double capitalInicial;
 
    public PessoaJuridica() {
        super();
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(double inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public double getCapitalInicial() {
        return this.capitalInicial;
    }
    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    
}