class Cachorro extends Animal {
    
    private String raca;
    private double metrosCaminhadosDiarios;
    private double alimentacaoDiaria;

    public Cachorro() {
        super();
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public double getAlimentacaoDiaria() {
        return this.alimentacaoDiaria;
    }
    
    public void setAlimentacaoDiaria(double alimentacaoDiaria) {
        this.alimentacaoDiaria = alimentacaoDiaria;
    }
    
    public double getMetrosCaminhadosDiarios() {
        return this.metrosCaminhadosDiarios;
    }
    
    public void setMetrosCaminhadosDiarios(double metrosCaminhadosDiarios) {
        this.metrosCaminhadosDiarios = metrosCaminhadosDiarios;
    }
    
    public double CalcularAlimetacaoMensal() {
     return this.alimentacaoDiaria * 30;
    }
    
    public double CalcularMetrosCaminhadosMensais() {
     return this.metrosCaminhadosDiarios * 30;
    }
    
    
}