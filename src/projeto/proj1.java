/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Laurinha e Brendão
 * @since '06-08-2019'
 */
public class proj1 {
    /* atributo criado */
    String animal;  
    /*
    *método para imprimir animal
    *@param args String
    *@return void - não retorna nada
    */
    public static void main(String[] args) {
        System.out.println("Animal"); 
    }
    /**
     método para retorno de animal
     * 
     * @return String - animal (a variável que vai representar um animal)
     */
    public String getAnimal(){
        return animal; 
       
    }
      /*método para atribuir um valor ao animal
        *
        *@return animal String - animal
        */
    public void setNome ( String animal ){
  
    this.animal = animal;
    
    
    }
    
}
