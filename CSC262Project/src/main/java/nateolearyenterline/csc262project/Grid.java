/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nateolearyenterline.csc262project;

/**
 *This class creates the grid
 * @author all
 */
public class Grid {
    char[][] grid = new char[25][25];
    int nofRows = 25; // Number of rows
    int nofCols = 25; // Number of columns

    public Grid() {
        init();
    }

    public Grid(int nofRows, int nofCols) {
        this.nofRows = nofRows;
        this.nofCols = nofCols;
        init();
    }

    private void init() {
        for (int y = 0; y < nofRows; y++) {
            for (int x = 0; x < nofCols; x++) {
                grid[x][y] = '.';
            }
        }
    }

    public void setValueAt(int x, int y, char val) {
        grid[x][y] = val;
    }
    public char getValueAt(int x, int y){
        return grid[x][y];
    }
    
    public void print2D() {
        System.out.println("--------------------------------------------------");
        for (int y = 0; y < nofRows; y++) {
            for (int x = 0; x < nofCols; x++) {
                char ch = grid[x][y];
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }    
}

