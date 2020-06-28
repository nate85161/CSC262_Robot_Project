package nateolearyenterline.csc262project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import java.util.Random;

public class PrimaryController {
    
    
    
    @FXML
    private GUIRobot selectedRobot;
    
    @FXML
    private Item newItem;
    
    @FXML
    private Pane mainPane;

    @FXML
    private Button btnLeft;

    @FXML
    private Button btnRight;

    @FXML
    private Button btnUp;

    @FXML
    private Button btnDown;

    @FXML
    private Button btnPickUp;

    @FXML
    private Button btnDropOff;

    @FXML
    private Button btnSpdLft;

    @FXML
    private Button btnSpdRgt;

    @FXML
    private Button btnSdUp;

    @FXML
    private Button btnSpdDwn;

    @FXML
     void initialize() {
        Random i = new Random();
        char c = (char)(i.nextInt(26)+'A');
        int x = i.nextInt(600);
        int y = i.nextInt(273);
        System.out.printf("X = %d Y = %d\n",x, y);
        GUIRobot r1 = new GUIRobot("Nate",20,20);
        Item item = new Item(""+c,x,y);
        newItem = item;
        selectedRobot = r1;
        mainPane.getChildren().add(item);
        mainPane.getChildren().add(r1);   
    }

    @FXML
    void dropOff(ActionEvent event) {
        System.out.println("Drop Off");
        newItem.payload = false;
    }

    @FXML
    void moveDown(ActionEvent event) {
        System.out.println("Move Down");
        selectedRobot.moveDown();
        if (newItem.payload == true){
            newItem.setLayoutY(selectedRobot.getLayoutY());
        }
    }

    @FXML
    void moveLeft(ActionEvent event) {
        System.out.println("Move Left");
        selectedRobot.moveLeft();
        if (newItem.payload == true){
            newItem.setLayoutX(selectedRobot.getLayoutX());
        }
    }

    @FXML
    void moveRight(ActionEvent event) {
        System.out.println("Move Right");        
        selectedRobot.moveRight();
        if (newItem.payload == true){
            newItem.setLayoutX(selectedRobot.getLayoutX());
        }
    }

    @FXML
    void moveUp(ActionEvent event) {
        System.out.println("Move Up");
        selectedRobot.moveUp();
        if (newItem.payload == true){
            newItem.setLayoutY(selectedRobot.getLayoutY());
        }
    }

    @FXML
    void pickUp(ActionEvent event) {
        boolean itemHere = false; 
        if (selectedRobot.getLayoutX() == newItem.getLayoutX() && selectedRobot.getLayoutY() == newItem.getLayoutY())//intersects(item.getBoundsInParent()); 
            itemHere = true;
        if (itemHere == false){
            System.out.println("No Item Here"); 
        }
        else 
            System.out.println("Picked up Item");
            newItem.payload = true;
       
        
    }
       @FXML
    void speedLeft(ActionEvent event) {
        System.out.println("Move Left");
    selectedRobot.moveLeftFast();
        if (newItem.payload == true){
            newItem.setLayoutX(selectedRobot.getLayoutX());
        }
    }

    @FXML
    void speedRight(ActionEvent event) {
     System.out.println("Move Right");        
       selectedRobot.moveRightFast();
        if (newItem.payload == true){
            newItem.setLayoutX(selectedRobot.getLayoutX());
        }
    }
    @FXML
    void SpeedUp(ActionEvent event) {
       System.out.println("Move Up");
        selectedRobot.moveUp();
        if (newItem.payload == true){
            newItem.setLayoutY(selectedRobot.getLayoutY());
        }
    }

    @FXML
    void speedDown(ActionEvent event) {
        System.out.println("Move Down");
        selectedRobot.moveDownFast();
        if (newItem.payload == true){
            newItem.setLayoutY(selectedRobot.getLayoutY());
        }
    }
    }


