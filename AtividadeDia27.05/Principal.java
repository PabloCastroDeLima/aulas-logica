/**
 * Write a description of class Aluno here.
 *
 * @author Pablo castro
 * @version 1.0
 * @since 9/05/2020 - 17:43
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Ze");
        aluno.setNota1(8.6);
        aluno.setNota2(7.2);
        aluno.setTotalAulas(6);
        aluno.setNumeroPresencas(5);
        
        System.out.println(aluno);
        
    }
}
