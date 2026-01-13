package controller;

import core.Strength;
import units.helicopter.Helicopter;
import units.tank.Tank;
import units.submarine.Submarine;




public class Starter {
    public static void main(String args[]){
        // Create the main controller (Observer)
        MainController controller = new MainController();
        controller.setVisible(true);
        
        // Create all defense units (Observables)
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        
        // Register units with the controller
        controller.registerUnit(helicopter);
        controller.registerUnit(tank);
        controller.registerUnit(submarine);
        
        // Make all units visible
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        
        // Set locations to avoid overlap
        controller.setLocation(50, 50);
        helicopter.setLocation(50, 400);
        tank.setLocation(550, 400);
        submarine.setLocation(550, 50);
        
        // Send initial strength signal to demonstrate Observer pattern
        helicopter.setStrength(Strength.HIGH);
        tank.setStrength(Strength.MEDIUM);
        submarine.setStrength(Strength.LOW);
    }
}
