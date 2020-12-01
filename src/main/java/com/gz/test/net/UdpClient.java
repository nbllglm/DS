package com.gz.test.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "我是客户端".getBytes();
        DatagramPacket send = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 5555);
        ds.send(send);

        byte[] buffer = new byte[1000];
        DatagramPacket receve = new DatagramPacket(buffer, buffer.length);
        ds.receive(receve);
        System.out.println("客户端收到: "+new String(receve.getData()));

    }
}
