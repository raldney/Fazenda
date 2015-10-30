/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

/**
 *
 * @author Raldney
 */
public class Animal extends Thread{
    
    private String nomeAnimal;
    private Comedouro comedouro;
    private int totalConsumir;
 
    public Animal(String nomeAnimal, Comedouro c, int totalConsumir) {
        this.nomeAnimal = nomeAnimal;
        comedouro = c;
        this.totalConsumir = totalConsumir;
    }
 
    public void run() {
        System.out.println("A " + nomeAnimal + " chegou para comer!");
        int i = 0;
        while (comedouro.alimentar(nomeAnimal,totalConsumir) > 0) {
            if( i >= 200 ){
                System.out.println("A " + nomeAnimal + " Terminou de comer");
                break;
            }
            i++;
        }
    }
    
}
