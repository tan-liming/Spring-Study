package com.everything;

import com.Host;
import com.Rent;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocation p = new ProxyInvocation();
        p.setTarget(host);
        Rent proxy =  (Rent)p.getProxy();//注意！！！！这里要用接口来接，而不是Host！！！
        proxy.rent();
    }

}
