package Main_Code;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root=loader.load();
        getMessage get=loader.getController();
        Scene scene=new Scene(root);

        String css = this.getClass().getResource("/Stylesheet/stylesheet.css").toExternalForm();
        scene.getStylesheets().add(css);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode()){
                    case ENTER:
                        get.Send();
                }
            }
        });


        primaryStage.setResizable(false);
        primaryStage.setTitle("ChatBot");
        primaryStage.getIcons().add(new Image("/Image/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(event->{
                event.consume();
                logout(primaryStage);
        });
    }
    public void logout(Stage primaryStage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you sure you want to close?");
        if (alert.showAndWait().get() == ButtonType.OK){
            primaryStage.close();
        }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
