package bsuir.lVT_lab3.Lobyak.client.main;

import bsuir.lVT_lab3.Lobyak.client.service.ClientLogic;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClientLogic clientLogic = new ClientLogic();
        clientLogic.startClient();
    }
}
