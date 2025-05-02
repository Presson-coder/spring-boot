package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		var oderService = context.getBean(OrderService.class);
		// injecting the PaymentService using constructor injection
		// var orderService = new OrderService(new PayPalPaymentService());
		// orderService.setPaymentService(new StripePaymentService());
		oderService.placeOder();
	}

	// the run method returns an object of type ApplicationContext
    // ApplicationContext is the Spring IoC container - its a storage for our
	// objects (beans)

}
