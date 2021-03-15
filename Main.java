/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neoncontrol;

/**
 *
 * @author jakot
 */
public class NeonControl {

   public void start(Stage stage) throws Exception{
    
        // Create a scene and place it in the stage
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("NeonControl"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
