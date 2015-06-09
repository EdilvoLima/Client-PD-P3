/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.controlers;

/**
 *
 * @author Edilvo
 */
public class testes {
    
    public static void main(String[] args) throws InterruptedException {
        
        UpdateWeather atualizar = new ConcreteUpdateWeather();
        
        atualizar.updateWeather(28, 25, 25, 30, 33, 43);
        Thread.sleep(15000);
        atualizar.updateWeather(87, 22, 25, 30, 33, 21);
        Thread.sleep(1500);
        atualizar.updateWeather(5, 22, 25, 30, 67, 80);
        Thread.sleep(1500);
        atualizar.updateWeather(28, 22, 25, 30, 59, 34);
        atualizar.updateWeather(28, 21, 25, 49, 33, 90);
        Thread.sleep(3000);
        atualizar.updateWeather(28, 27, 25, 30, 78, 50);
        Thread.sleep(1500);
        atualizar.updateWeather(28, 19, 21, 30, 83, 58);
        Thread.sleep(1500);
        atualizar.updateWeather(34, 27, 25, 30, 33, 89);
        Thread.sleep(3000);
        atualizar.updateWeather(28, 33, 25, 30, 67, 49);
        Thread.sleep(3000);
        atualizar.updateWeather(28, 32, 25, 30, 76, 59);
        Thread.sleep(1500);
        atualizar.updateWeather(28, 27, 25, 55, 80, 66);
        Thread.sleep(1500);
        atualizar.updateWeather(12, 27, 25, 30, 60, 33);
        
    }
    
}
