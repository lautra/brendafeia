/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author 20151064010430
 */
public class proj2 {
     String professor;
     /*
    *método para imprimir professor
    *@param args String
    *@return void - não retorna nada
    */
    
    public static void main(String[] args) {
        System.out.println("Professor");
    }
    /**
     método para retorno de professor
     * 
     * @return String -´professor (a variável que vai representar um professor)
     */
    public String getProfessor(){
        return professor;
    
    
    }/*método para atribuir um valor ao professor
        *
        *@return professor String - professor
        */
    public void setMatricula ( String professor ){
    this.professor = professor;
    
    
    }
}
