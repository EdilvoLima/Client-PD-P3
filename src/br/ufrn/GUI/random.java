/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

/**
 *
 * @author Pedro
 */
public class random {

    public Integer randomizarNumeroPositivo(int num) {

        return (int) (num * Math.random());

    }

    public Integer randomizarNumeroNegativo(int num) {

        return (int) (-num * Math.random());

    }

    public Integer randomizarBarulho(int valor) {
        int random = 0;
        if (valor < 70 && valor > 0) {
            random = randomizarNumeroPositivo(10) + randomizarNumeroNegativo(10) + valor;
            if (random > 70) {
                while (random > 70) {
                    random = randomizarNumeroNegativo(10) + valor;
                }
            } else if (random < 0) {
                while (random < 0) {
                    random = randomizarNumeroPositivo(10) + valor;
                }
            }
        } else if (valor < 0) {
            while (valor < 0) {
                random = randomizarNumeroPositivo(10) + valor;
            }
        } else if (valor > 70) {
            while(valor > 70){
            random = randomizarNumeroNegativo(10) + valor;
            }
        }
        return random;

    }
}
