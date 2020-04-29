package com.docker.maik.helloworlddockerboot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldIpController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() throws UnknownHostException {
		
		environment.getProperty("server.port");
	    // Local address
	    String localAddress = InetAddress.getLocalHost().getHostAddress();
	    String localName = InetAddress.getLocalHost().getHostName();

	    // Remote address
	    String remoteAddress = InetAddress.getLoopbackAddress().getHostAddress();
	    String remoteName =InetAddress.getLoopbackAddress().getHostName();
	    
		return String.format("Hello World from (Local): %s , %s , (remote) %s , %s",
				localAddress, localName, remoteAddress, remoteName);
	}

}
