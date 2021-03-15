package piyush;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

private static Stage Idstage = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/input.fxml"));
        primaryStage.setTitle("ID Card");
        primaryStage.setScene(new Scene(root, 414, 493));
        primaryStage.show();

        CreateIdStage();
    }

public void CreateIdStage() {
    Idstage = new Stage();
    Idstage.setTitle("ID");
    Idstage.setAlwaysOnTop(true);
    Idstage.setResizable(false);
    Idstage.initModality(Modality.APPLICATION_MODAL);
}

public static Stage getIdstage(){return Idstage;}


    public static void main(String[] args) {
        launch(args);
    }
}
