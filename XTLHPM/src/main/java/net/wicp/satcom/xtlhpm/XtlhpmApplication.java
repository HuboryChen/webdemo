package net.wicp.satcom.xtlhpm;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XtlhpmApplication {

	public static void main(String[] args) {
		System.out.println("test");
		SpringApplication.run(XtlhpmApplication.class, args);
	}
}
