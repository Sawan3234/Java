package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

   

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bPane = new BorderPane();
        bPane.setTop(new TextField("Top"));
        bPane.setBottom(new TextField("Bottom"));
        bPane.setLeft(new TextField("Left"));
        bPane.setRight(new TextField("Right"));
        bPane.setCenter(new Button("Center Button"));

        Scene scene = new Scene(bPane, 500, 200);

        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show(); // ✅ was stage.show()
    }

    public static void main(String[] args) {
        launch(args);
    }
}