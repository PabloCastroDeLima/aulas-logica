public class principal {

      public static void main (String args[]) {

          System.out.println("\f");
            Pessoa pessoa = new Pessoa();
                pessoa.setNome("pessoa");
                System.out.println(pessoa.getNome());
                       pessoa.setNome("Jasinto");
                       pessoa.setSobrenome("pinto");
                       pessoa.setEmail("jasintopinto@gmail.com");
                       pessoa.setDataDeNascimento("14/11/1990");
                            System.out.println("\nNome: " + pessoa.getNome()
                                + "\nSobrenome: " + pessoa.getSobrenome()
                                + "\nEmail: " + pessoa.getEmail()
                                + "\nData de nascimento: " + pessoa.getDataDeNascimento());
                         
                         
                     
             Professor professor = new Professor();
                professor.setNome("\nProfessor");
                    System.out.println(professor.getNome());
                        professor.setNome("Claudio");
                        professor.setSobrenome("Leite");
                        professor.setEmail("claudioleite@gmail.com");
                        professor.setDataDeNascimento("05/10/1974");
                        professor.setNumeroDeRegistro(123);
                        professor.setNumeroDeHorasTrabalhadas(10);
                        professor.setValorHora(15);
                            System.out.println("\nNome: " + professor.getNome()
                                + "\nSobrenome: " + professor.getSobrenome()
                                + "\nEmail: " + professor.getEmail()
                                + "\nData de nascimento: " + professor.getDataDeNascimento()
                                + "\nNumero de registro: " + professor.getNumeroDeRegistro()
                                + "\nNumero de horas trabalhadas: " + professor.getNumeroDeHorasTrabalhadas()
                                + "\nValor Hora: " + professor.getValorHora()
                                + "\nSalario Fixo: " + professor.salariofixo()
                                + "\nFgts: " + professor.fgts());
              Aluno aluno = new Aluno();
                aluno.setNome("\nAluno");
                    System.out.println(aluno.getNome());
                        aluno.setNome("Josney");
                        aluno.setSobrenome("Perreira");
                        aluno.setEmail("josneyperreira@gmail.com");
                        aluno.setDataDeNascimento("10/05/2002");
                        aluno.setNota1(10);
                        aluno.setNota2(5);
                            System.out.println("\nNome: " + aluno.getNome()
                                + "\nSobrenome: " + aluno.getSobrenome()
                                + "\nEmail: " + aluno.getEmail()
                                + "\nData de nascimento: " + aluno.getDataDeNascimento()
                                + "\nNota 1 : " + aluno.getNota1()
                                + "\nNota 2 : " + aluno.getNota2()
                                + "\nAritimetica : " + aluno.aritimetica());
              
              Funcionario funcionario = new Funcionario();
                funcionario.setNome("\nFuncionario");
                    System.out.println(funcionario.getNome());
                        funcionario.setNome("José");
                        funcionario.setSobrenome("silva");
                        funcionario.setEmail("josesilva@gmail.com");
                        funcionario.setDataDeNascimento("14/11/199");
                        funcionario.setSalarioFixo(1500);
                        funcionario.setNumeroDeRegistro(123);
                            System.out.println("\nNome: " + funcionario.getNome()
                                + "\nSobrenome: " + funcionario.getSobrenome()
                                + "\nEmail: " + funcionario.getEmail()
                                + "\nData de nascimeto: " + funcionario.getDataDeNascimento()
                                + "\nSalario fixo: " + funcionario.getSalarioFixo()
                                + "\nNumero de registro: " + funcionario.getNumeroDeRegistro()
                                + "\nFGTS: " + funcionario.fgts());
                            
                        
                    
     }
     
}
