public class Professor extends Pessoa {
    
    private double numeroDeRegistro;
    private double numeroDeHorasTrabalhadas;
    private double valorHora;
    
    public Professor() {
        super();
    }
    
    public double getNumeroDeRegistro() {
        return this.numeroDeRegistro ;
        }
        
    public void setNumeroDeRegistro(double numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getNumeroDeHorasTrabalhadas() {
        return this.numeroDeHorasTrabalhadas ;
        }
        
    public void setNumeroDeHorasTrabalhadas(double numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora ;
        }
        
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double salariofixo() {
        return this.valorHora * this.numeroDeHorasTrabalhadas;
    }
    
    public double fgts() {
        return this.valorHora * this.numeroDeHorasTrabalhadas / 8.100;
    }
}