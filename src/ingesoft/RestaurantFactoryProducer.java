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
public class RestaurantFactoryProducer {
    public RestaurantAbstractFactory getRestaurantAbstractFactory(int type) {
        switch(type) {
            case 1: return new Restaurant1Factory();
            case 2: return new Restaurant2Factory();
            default: return null;
        }
    }
}
