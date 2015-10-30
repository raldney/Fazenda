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
public class Comedouro {

    public int conteudo = 10;
    private boolean disponivel;

    public synchronized void encher(String nomeFazendeiro, int valor) {
        while (disponivel == true) {
            try {
                System.out.println("Seu " + nomeFazendeiro + " esperando...");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        conteudo += valor;
        System.out.println("Seu " + nomeFazendeiro + " colocou " + conteudo + " KG de comida");
        disponivel = true;
        notifyAll();
    }

    public synchronized int alimentar(String nomeAnimal,int quantidade) {
        int i = 0;
        while (disponivel == false) {
            try {
                System.out.println("A " + nomeAnimal
                            + " esta aguardando a comida...");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(conteudo < quantidade)
            return 0;
        conteudo -= quantidade;
                        disponivel = false;

        System.out.println("A " + nomeAnimal + " comeu: "
                + quantidade);
        notifyAll();
        return conteudo;
    }
}
