package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// injecting the PaymentService using constructor injection
		var orderService = new OrderService(new PayPalPaymentService());
		// orderService.setPaymentService(new StripePaymentService());
		orderService.placeOder();
	}

}
