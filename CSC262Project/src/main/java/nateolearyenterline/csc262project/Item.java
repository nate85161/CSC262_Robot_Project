/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nateolearyenterline.csc262project;

import javafx.scene.control.Label;

/**
 *
 * @author all
 */
public class Item extends Label {
    String name;
    boolean payload = false;
    
    Item(String name,double x, double y){
        super(name);
        setLayoutX(x);
        setLayoutY(y);
    }
    
}
