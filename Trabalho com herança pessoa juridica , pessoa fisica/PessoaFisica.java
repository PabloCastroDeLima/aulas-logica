public class PessoaFisica extends Pessoa {

    private String estadoCivil;
    private String cpf;
    private String dataNascimento;
    
    
    public PessoaFisica(){
        super();
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void  setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}