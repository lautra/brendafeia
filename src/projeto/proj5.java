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
public class proj5 {
     String bebida;
     /*
    *método para imprimir bebida
    *@param args String
    *@return void - não retorna nada
    */
    
    public static void main(String[] args) {
        System.out.println("Bebida");
    }/**
     método para retorno de bebida
     * 
     * @return String - bebida (a variável que vai representar uma bebida)
     */
    
    public String getBebida(){
        return bebida;
    
    
    }/*método para atribuir um valor a bebida
        *
        *@return bebida String - animal
        */
    public void setTipo ( String bebida ){
    this.bebida = bebida;
    
    
    }
}
