package com.open.api.api;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class APIController {

    @GetMapping
    public String api(HttpServletRequest request, HttpServletResponse response) {

        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();

        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        StringBuilder builder = new StringBuilder()
                .append("Remote Addr : ")
                .append(remoteAddr)
                .append("\nRemote Host : ")
                .append(remoteHost)
                .append("\nRemote Port : ")
                .append(remotePort);

        if (inetAddress != null) {
            String canonicalHostName = inetAddress.getCanonicalHostName();
            String hostAddress = inetAddress.getHostAddress();
            String hostName = inetAddress.getHostName();

            builder.append("\nCanonical HostName : ")
            .append(canonicalHostName)
            .append("\nHost Address : ")
            .append(hostAddress)
            .append("\nHostName : ")
            .append(hostName);
        }

        return builder.toString();
    }

}
