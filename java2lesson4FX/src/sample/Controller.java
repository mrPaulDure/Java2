package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    public TextArea chatWindow;
    public TextField chatField;
    public Button sendBtn;

    public void sendMsg() {
        chatWindow.appendText(chatField.getText() + "\n");
        chatField.clear();
        chatField.requestFocus();
    }
}
