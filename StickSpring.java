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
    private double yPos;
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

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
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
    
    public void setVelocityVec(Vector velocityVec){
        this.velocityVec = velocityVec;
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
        
    }
    
    public double calculateNewY(){
        
    }
    
    public void setPos(double newXPos, double newYPos){
        
    }        
}
