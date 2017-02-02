package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.awt.*;
import java.io.File;
import java.io.PrintWriter;

public class Controller {

    public ProgressBar progressBar;
    public Label headerText;
    public Label saveText;
    public Label countText;
    public TextArea textArea;
    public Button saveButton;
    public Button countButton;
    public Window stage;
    public Desktop desktop;


    public void setSaveButtonOnClick(ActionEvent actionEvent) {
        saveText.setText("File saved");
        String contents = textArea.getText();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            try (PrintWriter out = new PrintWriter(file)) {
                out.println(contents);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void setCountButtonOnClick(ActionEvent actionEvent) {
        Counter cnt = new Counter();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            countText.setText("the count is: " + cnt.count(file));
        }
        double progress = 0.0;
        for (double i = 0.0; i < 100.0; i++) {
            i = progress;
            progress++;
            progressBar.setProgress(progress);
        }

    }
}
