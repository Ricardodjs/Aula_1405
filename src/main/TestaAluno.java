
package main;

import escola.Aluno;

public class TestaAluno {
   
    public static void main(String[] args){
        
        Aluno a1 = new Aluno("Carla", "007");
        //Aluno a1 = new Aluno();
        //a1.setNome("Carla");
        //a1.setMatricula("007");
        
        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
    }
}
