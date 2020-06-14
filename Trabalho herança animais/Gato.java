public class Gato extends Animal {
    
    private String raca;
    private double horasDormidasDiarias;
    private double alimentacaoDiaria;
    
    
    
    public Gato() {
        super();
    }


    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public double getHorasDormidasDiarias() {
        return this.horasDormidasDiarias;
    }
    
    public void setHorasDormidasDiarias(double horasDormidasDiarias) {
        this.horasDormidasDiarias = horasDormidasDiarias;
    }
    
    public double getAlimentacaoDiaria() {
        return this.alimentacaoDiaria;
    }
    
    public void setAlimentacaoDiaria(double alimentacaoDiaria) {
        this.alimentacaoDiaria = alimentacaoDiaria;
    }
    
    public double CalcularHorasDormidasMensais() {
        return this.horasDormidasDiarias * 30;
    }
    
    public double CalcularAlimentacaoMensal() {
        return this.alimentacaoDiaria * 30;
    }
} 