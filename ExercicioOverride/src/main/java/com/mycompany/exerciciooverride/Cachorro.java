package com.mycompany.exerciciooverride;

/**
 *
 * @author Ferna
 */
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro se moveu");
    }
    
}
