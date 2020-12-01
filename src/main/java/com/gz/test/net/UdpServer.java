package com.gz.test.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5555);

        byte[] buffer = new byte[1000];
        DatagramPacket receve = new DatagramPacket(buffer, buffer.length);
        ds.receive(receve);
        System.out.println("服务器收到：" + new String(receve.getData()));


        byte[] bytes = "我是服务器".getBytes();
        DatagramPacket send = new DatagramPacket(bytes, bytes.length, receve.getAddress(), receve.getPort());
        ds.send(send);

    }
}
