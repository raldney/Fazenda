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
public class Fazenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comedouro comedouro = new Comedouro();
        Fazendeiro fazendeiro1 = new Fazendeiro("Luiz", comedouro);
        Fazendeiro fazendeiro2 = new Fazendeiro("Antonio", comedouro);
        Animal animal1 = new Animal("Vaca", comedouro, 20);
        Animal animal2 = new Animal("Cavalo", comedouro, 20);
        Animal animal3 = new Animal("Porco", comedouro, 20);
        Animal animal4 = new Animal("Galinha", comedouro, 20);

        fazendeiro1.start();
        animal1.start();
        animal2.start();
        fazendeiro2.start();
        animal3.start();
        animal4.start();
        

    }

}
