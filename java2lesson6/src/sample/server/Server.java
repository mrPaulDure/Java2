package sample.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Server is running, waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String msg = in.readUTF();
                if (msg.equals("end")) break;
                System.out.println("from client: " + msg);
                out.writeUTF("Echo: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
