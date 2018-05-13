package sample.client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textMsg;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8189;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String s = null;
                        try {
                            s = in.readUTF();
                            textArea.appendText(s + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            });
            t.setDaemon(true);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg() {
        try {
            out.writeUTF(textMsg.getText());
            textMsg.clear();
            textMsg.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
