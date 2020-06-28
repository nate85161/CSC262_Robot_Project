/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nateolearyenterline.csc262project;

/**
 *
 * @author all
 */
public class Robot {
    
    private int x;
    private int y;
    private char payload;
    private String name;
    private Grid grid;

    public Robot(String name) {
        this.name = name;
        x = 0;
        y = 0;
        payload = ' ';
    }

    /**
     * Picks up the item from the grid at location x & y
     * 
     * @param locationX 
     * @param locationY
     */
    boolean pickUp(int locationX, int locationY,Grid grid) {
        if (x!=locationX || y!=locationY){
            System.out.printf("%s is not at (%d,%d)\n",name,locationX,locationY);
            return false;
        }
       else if (grid.getValueAt(locationX, locationY) != '.' && payload == ' '){
            payload = grid.getValueAt(locationX, locationY);
            grid.setValueAt(locationX, locationY, '.');
            return true;
        }
        else
           return false; 
    }

    // Checks for Char at spot on grid and if not drops off a Char
    boolean dropOff(int lx, int ly, Grid grid) {
        if (x!=lx || y!=ly){
            System.out.printf("%s is not at (%d,%d)\n",name,lx,ly);
            return false;
        }
       else if (grid.getValueAt(lx, ly) == '.' && payload != ' '){
            grid.setValueAt(lx, ly, payload);
            payload = ' ';
            return true;
        }
        else
           System.out.println("No payload to drop off");
           return false; 
    }

    // Moves Robot to the right on the grid
    void moveRight() {
        if(x==24)
            System.out.println("Right boundary reached\n");
        else
            x++;
        
    }

    // Moves robot to the left on the grid
    void moveLeft() {
        if(x==0)
            System.out.println("Left boundary reached\n");
        else
            x--;
    }

    // Moves robot up on the grid
    void moveUp() {
        if(y==0)
            System.out.println("Top boundary reached\n");
        else
            y--;
    }

    // Moves robot down on the grid.
    void moveDown() {
        if(y==24)
            System.out.println("Bottom boundary reached\n");
        else
            y++;
    }

    // TODO Explain what it does...
    boolean moveTo(int locationX, int locationY) {
        if (locationX > grid.nofCols || locationY > grid.nofRows) {
            return false;
        }
        int a = Math.abs(x-locationX);
        int b = Math.abs(y-locationY);
        if (x < locationX){
            for(int i = 0; i < a; i++)
                moveRight();
        }
        else{
            for(int i = 0; i < a; i++)
                moveLeft();
        }
        if (y > locationY){
            for(int i = 0; i < b; i++)
                moveUp();
        }
        else{
            for(int i = 0; i < b; i++)
                moveDown();
        }

        return true;
    }

    // TODO Explain what it does...
    void placeItem(int locationX, int locationY, char item) {
        grid.setValueAt(locationX, locationY, item);
    }

    // TODO Explain what it does...
    public void useGrid(Grid grid) {
        this.grid = grid;
    }
    
    // TODO Explain what it does...
    void printLocation() {
        String formatStr = "Robot %s is at %d, %d\n";
        System.out.printf(formatStr, name, x, y);
    }

   
}

