import javafx.application.Application;
import javafa.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

  public void start(Stage primaryStage){
    //Override the start method in the Application class
    Button btOK=new Button("OK");
    Scene scene=new Scene(btOK,200,250);
    primaryStage.setTitle("MyJavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  //main 
}
