package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.shape.Path;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Animation Examples");

        Button btn1 = new Button("Colors");
        btn1.setOnAction(new Animation1());
        HBox buttonHb1 = new HBox(10);
        buttonHb1.setAlignment(Pos.CENTER);
        buttonHb1.getChildren().addAll(btn1);

        Button btn2 = new Button("Slider");
        btn2.setOnAction(new Animation2());
        HBox buttonHb2 = new HBox(10);
        buttonHb2.setAlignment(Pos.CENTER);
        buttonHb2.getChildren().addAll(btn2);

        Button btn3 = new Button("Rotation");
        btn3.setOnAction(new Animation3());
        HBox buttonHb3 = new HBox(10);
        buttonHb3.setAlignment(Pos.CENTER);
        buttonHb3.getChildren().addAll(btn3);

        VBox vbox = new VBox(40);
        vbox.setPadding(new Insets(30, 30, 30, 30));
        vbox.getChildren().addAll(buttonHb1, buttonHb2, buttonHb3);

        Scene scene = new Scene(vbox, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class Animation1 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Color Fill Transition");
            stage.setResizable(false);

            Group root = new Group();
            Circle circle = new Circle(100, 100, 50);
            root.getChildren().add(circle);
            Scene scene = new Scene(root, 200, 200);
            stage.setScene(scene);
            stage.show();

            FillTransition ft = new FillTransition(Duration.millis(3000), circle, Color.RED, Color.YELLOW);

            ft.setCycleCount(4);
            ft.setAutoReverse(true);
            ft.play();
        }
    }

    private class Animation2 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Circle Path Transition");
            stage.setResizable(false);

            Group root = new Group();

            Circle circle = new Circle(20, Color.GRAY);
            root.getChildren().add(circle);

            Path path = new Path();
            path.getElements().addAll(new MoveTo(50, 50), new HLineTo(350));
            path.setFill(null);
            path.setStroke(Color.GRAY);
            path.setStrokeWidth(5);
            root.getChildren().add(path);

            Scene scene = new Scene(root, 400, 100);
            stage.setScene(scene);
            stage.show();

            PathTransition pt = new PathTransition(Duration.millis(4000), path, circle);
            pt.setCycleCount(Animation.INDEFINITE);
            pt.setAutoReverse(true);
            pt.play();
        }
    }

    private class Animation3 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Square Rotation Transition");
            stage.setResizable(false);

            Group root = new Group();

            Rectangle rect = new Rectangle(100, 100, 100, 100);
            rect.setFill(Color.BLUE);
            root.getChildren().add(rect);

            FadeTransition ft = new FadeTransition(Duration.millis(3000));
            ft.setFromValue(1);
            ft.setToValue(0.1);
            ft.setCycleCount(Animation.INDEFINITE);
            ft.setAutoReverse(true);

            RotateTransition rt = new RotateTransition(Duration.seconds(5));
            rt.setByAngle(180);
            rt.setCycleCount(Animation.INDEFINITE);
            rt.setAutoReverse(true);

            Scene scene = new Scene(root, 300, 300);
            stage.setScene(scene);
            stage.show();

            ParallelTransition pt = new ParallelTransition(rect, ft, rt);
            pt.play();
        }
    }

    public static void main(String [] args) {

        Application.launch(args);
    }
}
