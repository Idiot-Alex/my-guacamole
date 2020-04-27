package com.hotstrip.my_guacamole;

import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.net.GuacamoleSocket;
import org.apache.guacamole.net.GuacamoleTunnel;
import org.apache.guacamole.net.InetGuacamoleSocket;
import org.apache.guacamole.net.SimpleGuacamoleTunnel;
import org.apache.guacamole.protocol.ConfiguredGuacamoleSocket;
import org.apache.guacamole.protocol.GuacamoleConfiguration;
import org.apache.guacamole.servlet.GuacamoleHTTPTunnelServlet;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HttpTunnelServlet extends GuacamoleHTTPTunnelServlet {

    @Override
    @PostMapping(value = "/tunnel")
    protected GuacamoleTunnel doConnect(HttpServletRequest httpServletRequest) throws GuacamoleException {
        String hostName = "192.168.12.50";
        int port = 4823;

        // Guacamole 配置
        GuacamoleConfiguration configuration = new GuacamoleConfiguration();
        configuration.setProtocol("rdp");
        configuration.setParameter("hostname", "192.168.12.69");
        configuration.setParameter("port", "3389");
        configuration.setParameter("username", "administrator");
        configuration.setParameter("password", "123456");
        configuration.setParameter("ignore-cert", "true");

        GuacamoleSocket socket = new ConfiguredGuacamoleSocket(new InetGuacamoleSocket(hostName, port), configuration);
        GuacamoleTunnel tunnel = new SimpleGuacamoleTunnel(socket);
        return tunnel;
    }
}
