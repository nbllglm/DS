package com.gz.test.net;

import java.io.*;
import java.net.*;

public class TcpClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
            InputStream fis = new FileInputStream("asd.txt");
            byte[] buffer = new byte[20];
            while ((fis.read(buffer)) != -1) {
                socket.getOutputStream().write(buffer);
            }
           socket.shutdownOutput();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer1 = new byte[20];
            while ((inputStream.read(buffer1)) != -1) {
                System.out.println(new String(buffer1));
            }
            socket.close();
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
