package com.sonoscape;

import ch.ethz.ssh2.Connection;

public class SSHClient {
    public static void main(String[] args) {
        Connection connection = RemoteUtils.login("192.168.9.155", "chenkun", "123");
        String content = RemoteUtils.execute(connection, "top");
        System.out.println(content);
    }
}
