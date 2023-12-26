package org.mylearnings.adapterpattern;

public class Program {
    public static void main(String[] args) {
        String webHost="Host:https://google.com\n\r";
        WebService service=new WebService(webHost);
        WebAdapter webAdapter=new WebAdapter();
        webAdapter.connect(service);
        WebClient client=new WebClient(webAdapter);
        client.doWork();
    }
}
