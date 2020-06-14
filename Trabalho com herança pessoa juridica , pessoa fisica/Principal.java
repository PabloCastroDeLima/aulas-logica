 public class Principal {
    
    public static void main (String args[]) {
    
         System.out.println("\f");
           Pessoa pessoa = new Pessoa();
               pessoa.setNome("Pessoa");
               System.out.println(pessoa.getNome());
                           pessoa.setNome("irineu");
                           pessoa.setCodigoDeRegistro(321);
                           pessoa.setProfissao("Corretor");
                                System.out.println ("\nNome: " + pessoa.getNome()
                                    + "\nCodigo De Registro: " + pessoa.getCodigoDeRegistro()
                                    + "\nProfissão: " + pessoa.getProfissao());
                                     
    
            PessoaJuridica pessoajuridica = new PessoaJuridica();
                pessoajuridica.setNome("\nPessoa Juridica");
                System.out.println(pessoajuridica.getNome());
                            pessoajuridica.setCnpj("92.123.123.123");
                            pessoajuridica.setRazaoSocial("ABC eletronicos Ltda");
                            pessoajuridica.setInscricaoEstadual(123);
                            pessoajuridica.setCapitalInicial(2500);
                                 System.out.println ("\nCnpj: " + pessoajuridica.getCnpj()
                                     + "\nRazão social: " + pessoajuridica.getRazaoSocial()
                                     + "\nCapital Inicial" + pessoajuridica.getCapitalInicial()
                                     + "\nInscrição estadual: " + pessoajuridica.getInscricaoEstadual());
                                     
                                     
            PessoaFisica pessoafisica = new PessoaFisica();
                pessoafisica.setNome("\nPessoa Fisica");
                System.out.println(pessoafisica.getNome());
                           pessoafisica.setNome("João");
                           pessoafisica.setCodigoDeRegistro(324);
                           pessoafisica.setProfissao("venderdor de bala");
                           pessoafisica.setCpf("123.123.123.12");
                           pessoafisica.setEstadoCivil("casado");
                           pessoafisica.setDataNascimento("12/12/1970");
                                System.out.println ("\nNome: " + pessoafisica.getNome()
                                    + "\nCodigo De Registro: " + pessoafisica.getCodigoDeRegistro()
                                    + "\nProfissão: " + pessoafisica.getProfissao()
                                    + "\nCPF: " + pessoafisica.getCpf()
                                    + "\nEstado Civil: " + pessoafisica.getEstadoCivil()
                                    + "\nData De Nascimento: " + pessoafisica.getDataNascimento());
                                     
    
    
    }
     
     
 }