package com.bouzidimhdi.lyndaspringangularapp.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.bouzidimehdi.lyndaspringangularapp.repository")
@EnableTransactionManagement
public class DatabaseConfig {
}
