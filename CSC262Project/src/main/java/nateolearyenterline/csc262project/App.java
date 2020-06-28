package nateolearyenterline.csc262project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //mainText.getChildren().add(print2D());
        scene = new Scene(loadFXML("primary"), 640, 480);
        //scene = new Scene(print2D(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        Robot r1 = new Robot("Nate");
        Robot r2 = new Robot("Abby");
        Grid grid = new Grid(25, 25);

        grid.setValueAt(10, 8, 'B');
        grid.setValueAt(22, 4, 'C');

        r1.useGrid(grid);
        r2.useGrid(grid);

        r1.moveTo(23, 24);
        r2.moveTo(15, 3);
        
        r1.printLocation();
        r2.printLocation();

        grid.print2D();
        
        
        r1.moveTo(10,8);
        r2.moveTo(22,4);
        
        r1.pickUp(10,8,grid);
        r2.pickUp(22,4,grid);
        
        r1.moveTo(20,20);
        r2.moveTo(0,0);
        
        r1.dropOff(20,20,grid);
        r2.dropOff(0,0,grid);
        
        r1.printLocation();
        r2.printLocation();

        grid.print2D();
        

    }
}