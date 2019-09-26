package Flagguppgift;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Flagguppgift extends Application{
        public static void main(String[] args){
            launch(args);

        }

        @Override
        public void start(Stage primaryStage) throws Exception{
            primaryStage.setTitle("Flaggspel");
            primaryStage.show();

            Group root = new Group();

            HBox buttonPane = new HBox();
            root.getChildren().add(buttonPane);

            Button[] buttons = {
                    new Button("Sverige"),
                    new Button("Norige"),
                    new Button("Findland"),
                    new Button("Danmark"),
            };

            buttonPane.getChildren().addAll(buttons);

            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (i == 0){
                            renderFlag("Sverige");
                        }else if (i == 1){
                            renderFlag("Norge");
                        }
                    }
                });
            }

            Scene scene = new Scene(root, 1200, 600);
            primaryStage.setTitle("Flagspel");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void renderFlag(String flag){

        }
    }

