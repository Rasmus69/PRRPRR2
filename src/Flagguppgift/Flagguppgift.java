package Flagguppgift;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flagguppgift extends Application{
        static BorderPane main;
        public static void main(String[] args){
            launch(args);

        }

        @Override
        public void start(Stage primaryStage) throws Exception{
            primaryStage.setTitle("Flaggspel");
            primaryStage.show();

            Group root = new Group();

            main = new BorderPane();
            root.getChildren().add(main);


            HBox buttonPane = new HBox();
            main.setTop(buttonPane);

            Button[] buttons = {
                    new Button("Sverige"),
                    new Button("Norige"),
                    new Button("Findland"),
                    new Button("Danmark"),
            };

            buttonPane.getChildren().addAll(buttons);
            for (int i = 0; i < buttons.length; i++) {

                if (i == 0) {
                    buttons[i].setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                            renderFlag("Sverige");
                        }
                    });
                } else if (i == 1) {
                    buttons[i].setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                            renderFlag("Norge");
                        }
                    });
                }
            }

            Scene scene = new Scene(root, 800, 500);
            primaryStage.setTitle("Flagspel");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void renderFlag(String flag){
            BorderPane con = new BorderPane();
            StackPane container = new StackPane();
            container.setAlignment(Pos.CENTER);

            if(flag == "Sverige"){

                Rectangle r = new Rectangle();
                r.setWidth(100);
                r.setHeight(50);
                r.setFill(Color.BLUE);

                Rectangle r2 = new Rectangle();
                r2.setWidth(10);
                r2.setHeight(50);
                r2.setFill(Color.YELLOW);
                r2.setTranslateX(-15);

                Rectangle r3 = new Rectangle();
                r3.setWidth(100);
                r3.setHeight(10);
                r3.setFill(Color.YELLOW);

                container.getChildren().add(r);
                container.getChildren().add(r2);
                container.getChildren().add(r3);

            }else if(flag == "Norge"){

            }

            con.setCenter(container);
            main.setCenter(con);
        }
    }

