/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negaard_3_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author DrKairos
 */
public class Negaard_3_methodmadness extends Application {
    
   
 public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(275, 275);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
//        drawSomeCircle(gc, 25, 66, 43);
        drawLotsOfCircles(gc, 50);
        drawHouse(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawSomeCircle(GraphicsContext gc, int x, int y, int d){
        gc.setFill(Color.DARKGREEN);
        gc.strokeRect(x, y, d, d);
    }
    private void drawLotsOfCircles(GraphicsContext gc, int num){
        for(int i=0; i < num; i++){
            drawSomeCircle(gc, 25*i, (25*i), 25);
        }
    }
    private void drawHouse(GraphicsContext gc){
        gc.fillText("Chess Board", 100, 10);
    }
    private void drawShapes(GraphicsContext gc) {
       gc.fillRect(0, 250, 25, 25);
       gc.fillRect(25, 225, 25, 25);
       gc.fillRect(50, 200, 25, 25);
       gc.fillRect(75, 175, 25, 25);
       gc.fillRect(100, 150, 25, 25);
       gc.fillRect(150, 100, 25, 25);
       gc.fillRect(175, 75, 25, 25);
       gc.fillRect(200, 50, 25, 25);
       gc.fillRect(225, 25, 25, 25);
       gc.fillRect(250, 0, 25, 25);
       
       gc.fillRect(0, 0, 25, 25);
       gc.fillRect(0, 50, 25, 25);
       gc.strokeRect(0, 75, 25, 25);
       gc.fillRect(0, 100, 25, 25);
       gc.strokeRect(0, 125, 25, 25);
       gc.fillRect(0, 150, 25, 25);
       gc.strokeRect(0, 175, 25, 25);
       gc.fillRect(0, 200, 25, 25);
       
       gc.fillRect(50, 0, 25, 25);
       gc.strokeRect(75, 0, 25, 25);
       gc.fillRect(100, 0, 25, 25);
       gc.strokeRect(125, 0, 25, 25);
       gc.fillRect(150, 0, 25, 25);
       gc.strokeRect(175, 0, 25, 25);
       gc.fillRect(200, 0, 25, 25);
       gc.strokeRect(225, 0, 25, 25);
       
       gc.fillRect(25, 25, 25, 25);
       gc.fillRect(25, 75, 25, 25);
       gc.fillRect(25, 125, 25, 25);
       gc.strokeRect(25, 175, 25, 25);
       gc.fillRect(25, 225, 25, 25);
       gc.fillRect(25, 175, 25, 25);
       gc.strokeRect(25, 200, 25, 25);
       gc.strokeRect(25, 250, 25, 25);
       
       gc.fillRect(50, 50, 25, 25);
       gc.fillRect(50, 100, 25, 25);
       gc.fillRect(50, 150, 25, 25);
       gc.fillRect(50, 250, 25, 25);
       
       gc.fillRect(75, 25, 25, 25);
       gc.strokeRect(75, 50, 25, 25);
       gc.fillRect(75, 75, 25, 25);
       gc.strokeRect(75, 100, 25, 25);
       gc.fillRect(75, 125, 25, 25);
       gc.strokeRect(75, 150, 25, 25);
       gc.fillRect(75, 175, 25, 25);
       gc.strokeRect(75, 200, 25, 25);
       gc.fillRect(75, 225, 25, 25);
       gc.strokeRect(75, 250, 25, 25);
       
       gc.fillRect(100, 50, 25, 25);
       gc.fillRect(100, 100, 25, 25);
       gc.fillRect(100, 150, 25, 25);
       gc.fillRect(100, 200, 25, 25);
       gc.fillRect(100, 250, 25, 25);
       gc.fillRect(125, 25, 25, 25);
       gc.fillRect(125, 75, 25, 25);
       gc.fillRect(125, 125, 25, 25);
       gc.fillRect(125, 175, 25, 25);
       gc.fillRect(125, 225, 25, 25);
       
       gc.fillRect(150, 50, 25, 25);
       gc.fillRect(150, 100, 25, 25);
       gc.fillRect(150, 150, 25, 25);
       gc.fillRect(150, 200, 25, 25);
       gc.fillRect(150, 250, 25, 25);
       
       gc.fillRect(175, 25, 25, 25);
       gc.fillRect(175, 125, 25, 25);
       gc.fillRect(175, 175, 25, 25);
       gc.fillRect(175, 225, 25, 25);
       
       gc.fillRect(200, 50, 25, 25);
       gc.fillRect(200, 100, 25, 25);
       gc.fillRect(200, 150, 25, 25);
       gc.fillRect(200, 200, 25, 25);
       gc.fillRect(200, 250, 25, 25);
       
       gc.fillRect(225, 25, 25, 25);
       gc.fillRect(225, 75, 25, 25);
       gc.fillRect(225, 125, 25, 25);
       gc.fillRect(225, 175, 25, 25);
       gc.fillRect(225, 225, 25, 25);
       
       gc.fillRect(250, 50, 25, 25);
       gc.fillRect(250, 100, 25, 25);
       gc.fillRect(250, 150, 25, 25);
       gc.fillRect(250, 200, 25, 25);
       gc.fillRect(250, 250, 25, 25);
                      
    }
}

