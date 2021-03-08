/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgBoys;

import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;



/**
 *
 * @author addav
 */
public class StickSpring {
    private double YPos;
    private double xPos;
    private double angle = 0;
    
    private Vector velVector;
    private double mass;
    
    private Image image;
    
    private Rectangle spring1HB;
    private Rectangle spring2HB;
    private Rectangle stickHB;

    public StickSpring() {
    }
    
    public StickSpring(Vector velVector){
        this.velVector = velVector;
    }

    public double getYPos() {
        return YPos;
    }

    public void setYPos(double YPos) {
        this.YPos = YPos;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Vector getVelocityVec(){
        return velVector;
    }
    
    public void setVelocityVec(Vector velVector){
        this.velVector = velVector;
    }
    
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void rotate(){
        double currentAngle = this.getAngle();
    }
    
    public double calculateNewX(){
        double newX = getXPos()+getVelocityVec().getX();
        return newX;
    }
    
    public double calculateNewY(){
        double newY = getYPos()+getVelocityVec().getY();
        return newY;
    }
    
    public void setPos(double newXPos, double newYPos){
        
    }        
}
