package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    int result;
    int current;
    int savedNum;
    TextField answer = new TextField();
    boolean newVal = true;
    String operator;

    @Override
    public void start(Stage primaryStage) throws Exception{


        primaryStage.setTitle("Calculator");

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.TOP_LEFT);
        layout.setHgap(20);
        layout.setVgap(15);
        layout.setPadding(new Insets(10, 10, 10, 10));


        answer.setText("0");
        answer.setFont(Font.font("Tahoma", FontWeight.BLACK, 20));
        answer.setAlignment(Pos.TOP_RIGHT);
        layout.add(answer,0,0,1,1);

        final Scene calcScene = new Scene(layout,240, 280);

        final IntButton zeroBTN = new IntButton(0,"0");
        zeroBTN.setMinSize(50,25);
        final IntButton oneBTN = new IntButton(1,"1");
        oneBTN.setMinSize(50,25);
        final IntButton twoBTN = new IntButton(2,"2");
        twoBTN.setMinSize(50,25);
        final IntButton threeBTN = new IntButton(3,"3");
        threeBTN.setMinSize(50,25);
        final IntButton fourBTN = new IntButton(4,"4");
        fourBTN.setMinSize(50,25);
        final IntButton fiveBTN = new IntButton(5,"5");
        fiveBTN.setMinSize(50,25);
        final IntButton sixBTN = new IntButton(6,"6");
        sixBTN.setMinSize(50,25);
        final IntButton sevenBTN = new IntButton(7,"7");
        sevenBTN.setMinSize(50,25);
        final IntButton eightBTN = new IntButton(8,"8");
        eightBTN.setMinSize(50,25);
        final IntButton nineBTN = new IntButton(9,"9");
        nineBTN.setMinSize(50,25);

        Button point = new Button(".");
        point.setMinSize(50,25);
        Button posNeg = new Button("+/-");
        posNeg.setMinSize(50,25);
        Button equals = new Button("=");
        equals.setMinSize(50,25);
        Button CE = new Button("CE");
        CE.setMinSize(50,25);
        final Button C = new Button("C");
        C.setMinSize(50,25);
        Button delete = new Button("<-");
        delete.setMinSize(50,25);
        Button divide = new Button("/");
        divide.setMinSize(50,25);
        Button times = new Button("x");
        times.setMinSize(50,25);
        Button minus = new Button("-");
        minus.setMinSize(50,25);
        Button plus = new Button("+");
        plus.setMinSize(50,25);

        HBox hbOne = new HBox(5);
        HBox hbTwo = new HBox(5);
        HBox hbThree = new HBox(5);
        HBox hbFour = new HBox(5);
        HBox hbFive = new HBox(5);

        hbOne.getChildren().add(CE);
        hbOne.getChildren().add(C);
        hbOne.getChildren().add(delete);
        hbOne.getChildren().add(divide);

        hbTwo.getChildren().add(sevenBTN);
        hbTwo.getChildren().add(eightBTN);
        hbTwo.getChildren().add(nineBTN);
        hbTwo.getChildren().add(times);

        hbThree.getChildren().add(fourBTN);
        hbThree.getChildren().add(fiveBTN);
        hbThree.getChildren().add(sixBTN);
        hbThree.getChildren().add(minus);

        hbFour.getChildren().add(oneBTN);
        hbFour.getChildren().add(twoBTN);
        hbFour.getChildren().add(threeBTN);
        hbFour.getChildren().add(plus);

        hbFive.getChildren().add(zeroBTN);
        hbFive.getChildren().add(point);
        hbFive.getChildren().add(posNeg);
        hbFive.getChildren().add(equals);

        VBox V1 = new VBox(15);

        V1.getChildren().add(hbOne);
        V1.getChildren().add(hbTwo);
        V1.getChildren().add(hbThree);
        V1.getChildren().add(hbFour);
        V1.getChildren().add(hbFive);

        layout.add(V1,0,2);

        oneBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(oneBTN.getText());
                    } else {
                        answer.appendText(oneBTN.getText());
                    }
                }
                else{
                    answer.appendText(oneBTN.getText());
                }
            }
        });

        twoBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(twoBTN.getText());
                    } else {
                        answer.appendText(twoBTN.getText());
                    }
                }
                else{
                    answer.appendText(twoBTN.getText());
                }
            }
        });

        threeBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(threeBTN.getText());
                    } else {
                        answer.appendText(threeBTN.getText());
                    }
                }
                else{
                    answer.appendText(threeBTN.getText());
                }
            }
        });

        fourBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(fourBTN.getText());
                    } else {
                        answer.appendText(fourBTN.getText());
                    }
                }
                else{
                    answer.appendText(fourBTN.getText());
                }
            }
        });

        fiveBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(fiveBTN.getText());
                    } else {
                        answer.appendText(fiveBTN.getText());
                    }
                }
                else{
                    answer.appendText(fiveBTN.getText());
                }
            }
        });

        sixBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(sixBTN.getText());
                    } else {
                        answer.appendText(sixBTN.getText());
                    }
                }
                else{
                    answer.appendText(sixBTN.getText());
                }
            }
        });

        sevenBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(sevenBTN.getText());
                    } else {
                        answer.appendText(sevenBTN.getText());
                    }
                }
                else{
                    answer.appendText(sevenBTN.getText());
                }
            }
        });

        eightBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(eightBTN.getText());
                    } else {
                        answer.appendText(eightBTN.getText());
                    }
                }
                else{
                    answer.appendText(eightBTN.getText());
                }
            }
        });

        nineBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    answer.setText("0");
                    if (answer.getCharacters().toString().equals("0")) {
                        answer.setText(nineBTN.getText());
                    } else {
                        answer.appendText(nineBTN.getText());
                    }
                }
                else{
                    answer.appendText(nineBTN.getText());
                }
            }
        });

        zeroBTN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (newVal) {
                    newVal = false;
                    if (!answer.getCharacters().toString().equals("0")) {
                        answer.setText("0");
                    }
                }
                else{
                    if (!answer.getCharacters().toString().equals("0")) {
                        answer.appendText(zeroBTN.getText());

                }
            }
        }});

            CE.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer.setText("0");
                current = 0;
                newVal = true;
            }
        });

        C.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer.setText("0");
                current = 0;
                result = 0;
                savedNum = 0;
                newVal = true;
            }
        });

        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                savedNum = Integer.valueOf(answer.getCharacters().toString());
                newVal = true;
                operator = "+";
            }
        });

        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                savedNum = Integer.valueOf(answer.getCharacters().toString());
                newVal = true;
                operator = "-";
            }
        });

        times.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                savedNum = Integer.valueOf(answer.getCharacters().toString());
                newVal = true;
                operator = "*";
            }
        });

        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                savedNum = Integer.valueOf(answer.getCharacters().toString());
                newVal = true;
                operator = "/";
            }
        });


        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                current = Integer.valueOf(answer.getCharacters().toString());

                if (operator.equals("+")){
                    result = savedNum + current;
                    answer.setText(Integer.toString(result));
                }
                else if(operator.equals("-")){
                    result = savedNum - current;
                    answer.setText(Integer.toString(result));
                }
                else if(operator.equals("*")){
                    result = savedNum * current;
                    answer.setText(Integer.toString(result));
                }
                else if (operator.equals("/")){
                    if (current == 0){
                        Alert.display("Error", "Division error: Cannot divide by 0.");
                        answer.setText("0");
                    }
                    else if(!(savedNum%current == 0)){
                        Alert.display("Error", Integer.toString(savedNum) + " not divisible by " + Integer.toString(current));
                        answer.setText("0");
                    }
                    else{
                        result = savedNum/current;
                        answer.setText(Integer.toString(result));
                    }
                }
                newVal = true;
            }
        });









        primaryStage.setScene(calcScene);

        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
