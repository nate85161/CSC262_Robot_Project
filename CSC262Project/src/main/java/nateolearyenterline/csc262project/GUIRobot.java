/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nateolearyenterline.csc262project;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author all
 */
public class GUIRobot extends Circle{
    private String name;
    private double deltaX = 1;
    private double deltaY = 1;
    
    
    GUIRobot(String name, double x, double y){
        this.name = name;
        setLayoutX(x);
        setLayoutY(y);
        setFill(Paint.valueOf("red"));
        setRadius(20);
        
    }
    
    public void moveUp(){
        double y = getLayoutY();
        y -= deltaY;
        setLayoutY(y);
    }
    public void moveUpFast(){
        double y = getLayoutY();
        y -= deltaY*10;
        setLayoutY(y);
        
    }
    public void moveDown(){
        double y = getLayoutY();
        y += deltaY;
        setLayoutY(y);
    }
    public void moveDownFast(){
        double y = getLayoutY();
        y += deltaX*10;
        setLayoutY(y);
        
    }
    public void moveLeft(){
        double x = getLayoutX();
        x -= deltaX;
        setLayoutX(x);
        
    }
    public void moveLeftFast(){
        double x = getLayoutX();
        x -= deltaX*10;
        setLayoutX(x);
        
    }
    public void moveRight(){
        double x = getLayoutX();
        x += deltaX;
        setLayoutX(x);
        
    }
    public void moveRightFast(){
        double x = getLayoutX();
        x += deltaX*10;
        setLayoutX(x);
        
    }
    
}
