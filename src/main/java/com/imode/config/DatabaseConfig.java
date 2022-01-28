package com.imode.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@Data
@PropertySource("classpath:application.properties")
public class DatabaseConfig {

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.username}")
    private String dataSourceUsername;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword;

    @Value("${spring.datasource.driverClassName}")
    private String dataSourceDriverClassName;


//    @Bean(name = "dbProductService")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Primary
//    public DataSource createProductServiceDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "jdbcProductService")
//    @Autowired
//    public JdbcTemplate createJdbcTemplate_ProductService(@Qualifier("dbProductService") DataSource productServiceDS) {
//        return new JdbcTemplate(productServiceDS);
//    }


//    @Bean(name = "dbUserService")
//    @ConfigurationProperties(prefix = "spring.dbUserService")
//    public DataSource createUserServiceDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//
//    @Bean(name = "jdbcUserService")
//    @Autowired
//    public JdbcTemplate createJdbcTemplate_UserService(@Qualifier("dbUserService") DataSource userServiceDS) {
//        return new JdbcTemplate(userServiceDS);
//    }

// Datasource for MSSQL Database
    //@Bean(name = "mssqlDataSource")
    //@Primary
    @Bean
    public DataSource getDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(dataSourceDriverClassName);
        dataSourceBuilder.url(dataSourceUrl);
        dataSourceBuilder.username(dataSourceUsername);
        dataSourceBuilder.password(dataSourcePassword);
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        dataSource = getDataSource();
        return new JdbcTemplate(dataSource);
    }


// Datasource for H2 Database
//    @Bean(name = "h2DataSource")
//    public DataSource h2DataSource()
//    {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
//        dataSourceBuilder.url("jdbc:h2:file:C:/temp/test");
//        dataSourceBuilder.username("sa");
//        dataSourceBuilder.password("");
//        return dataSourceBuilder.build();
//    }


}
