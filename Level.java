/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgBoys;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author addav
 */
public class Level {
    private ArrayList<Wall> wallList;
    private Image background;

    public Level() {
    }

    public Level(ArrayList<Wall> wallList, Image background) {
        this.wallList = wallList;
        this.background = background;
    }
    
    public void setWallList(ArrayList<Wall> wallList){
        this.wallList = wallList;
    }
    
    public void setBackground(Image background){
        this.background = background;
    }
    
    public void addWall(Wall w){
        wallList.add(w);
    }

    public ArrayList<Wall> getWallList() {
        return wallList;
    }

    public Image getBackground() {
        return background;
    }
    
    public Wall getWall(int index){
        return wallList.get(index);
    }
}
