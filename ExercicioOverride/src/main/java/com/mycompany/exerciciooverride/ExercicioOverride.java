package com.mycompany.exerciciooverride;

/**
 *
 * @author Ferna
 */
public class ExercicioOverride {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.emitirSom();
        animal.mover();
        
        animal = new Gato();
        animal.emitirSom();
        animal.mover();
    }
}
