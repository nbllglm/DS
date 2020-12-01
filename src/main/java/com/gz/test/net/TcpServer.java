package com.gz.test.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            int count = 0;
            while (true) {
                Socket socket = serverSocket.accept();
                FileOutputStream fileOutputStream = new FileOutputStream(count++ + ".txt");
                byte[] buffer = new byte[20];
                while ((socket.getInputStream().read(buffer)) != -1) {
                    fileOutputStream.write(buffer);
                }
                socket.getOutputStream().write("Server: 上传成功".getBytes());
                socket.close();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }

}
