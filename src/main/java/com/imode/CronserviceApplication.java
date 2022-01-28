package com.imode;

import com.imode.model.PaymentDetails;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
//@EnableScheduling
@OpenAPIDefinition(info=@Info(title="Cron Service API", version = "2.0", description = "Spring Boot Template"))
//public class CronserviceApplication implements CommandLineRunner {
public class CronserviceApplication {

    //@Autowired
    //private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(CronserviceApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "Select * from PaymentDetails";
//        List<PaymentDetails> payments = jdbcTemplate.query(sql, BeanPropertyRowMapper
//        .newInstance(PaymentDetails.class));
//
//        payments.forEach(System.out :: println);
//
//    }
}
