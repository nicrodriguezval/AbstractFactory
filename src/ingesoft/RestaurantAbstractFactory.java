/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingesoft;

/**
 *
 * @author nicro
 */
public abstract class RestaurantAbstractFactory {
    abstract public FastFood getFastFood(String type);
    
    abstract public Drink getDrink(String type);
}
