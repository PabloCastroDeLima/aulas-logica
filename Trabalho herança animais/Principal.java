public class Principal {

       public static void main (String args[]) {
        
           System.out.println("\f");
            Animal animal = new Animal();
            
            
            
                
            Gato gato = new Gato();
                gato.setNome("Gato");
                System.out.println(gato.getNome());
                            gato.setNome("psi");
                            gato.setIdade("7 anos");
                            gato.setRaca("Persa ");
                            gato.setHorasDormidasDiarias(10);
                            gato.setAlimentacaoDiaria(65);
                                System.out.println("\nNome: " + gato.getNome()
                                                 + "\nIdade: " +  gato.getIdade()
                                                 + "\nRaça: " + gato.getRaca()
                                                 + "\nHoras Dormidas Diarias: " + gato.getHorasDormidasDiarias()
                                                 + "\nAlimentação Diaria em gramas:  " + gato.getAlimentacaoDiaria()
                                                 + "\nHoras Dormidar Mensais: " + gato.CalcularHorasDormidasMensais()
                                                 + "\nAlimentação Mensal em gramas: " + gato.CalcularAlimentacaoMensal());
                            
                            
            
           
            Cachorro cachorro = new Cachorro();
                cachorro.setNome("Cachorro");
                System.out.println(cachorro.getNome());
                cachorro.setNome("Thor");
                cachorro.setIdade("11 anos");
                cachorro.setRaca("Labrador");
                cachorro.setMetrosCaminhadosDiarios(800);
                cachorro.setAlimentacaoDiaria(200);
                    System.out.println("\nNome: " + cachorro.getNome()
                                                 + "\nIdade: " +  cachorro.getIdade()
                                                 + "\nRaça: " + cachorro.getRaca()
                                                 + "\nIdade: " + cachorro.getIdade()
                                                 + "\nMetros Caminhados diarios: " + cachorro.getMetrosCaminhadosDiarios()
                                                 + "\nAlimentação Diaria em grmas: " + cachorro.getAlimentacaoDiaria()
                                                 + "\nAlimentação mensal em gramas: " + cachorro.CalcularAlimetacaoMensal()
                                                 + "\nMetros caminhados mensais: " + cachorro.CalcularMetrosCaminhadosMensais());
                
        } 
        
        
        
        
}