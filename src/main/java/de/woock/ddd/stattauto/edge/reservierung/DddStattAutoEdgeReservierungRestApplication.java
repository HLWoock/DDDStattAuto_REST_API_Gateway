package de.woock.ddd.stattauto.edge.reservierung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import de.woock.ddd.stattauto.edge.reservierung.pre.PreFilter;

@EnableZuulProxy
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class DddStattAutoEdgeReservierungRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddStattAutoEdgeReservierungRestApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
}
