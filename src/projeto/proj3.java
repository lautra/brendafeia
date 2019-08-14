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
public class proj3 {
     String aluno;
     /*
    *método para imprimir aluno
    *@param args String
    *@return void - não retorna nada
    */
    
    public static void main(String[] args) {
        System.out.println("Aluno");
    }/**
     método para retorno de aluno
     * 
     * @return String - aluno (a variável que vai representar um aluno)
     */
    
    public String getAluno(){
        return aluno;
    
    
    }/*método para atribuir um valor ao aluno
        *
        *@return aluno String - aluno
        */
    public void setNome ( String aluno ){
    this.aluno = aluno;
    
    
    }
}
