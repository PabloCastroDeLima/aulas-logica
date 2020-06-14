public class Funcionario extends Pessoa {
    private double numeroDeRegistro;
    private double salarioFixo;
    
    public Funcionario(){
        super();
    }
    
    public double getNumeroDeRegistro() {
        return this.numeroDeRegistro ;
        }
        
        public void setNumeroDeRegistro(double numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double fgts() {
        return this.salarioFixo / 8.100;
    }
    
}