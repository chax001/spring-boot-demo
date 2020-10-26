package com.ritesh.conferenceapp.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource datasource() {

		DataSourceBuilder<?> build = DataSourceBuilder.create();
		build.url("jdbc:postgresql://localhost:5432/conference_app");
		build.password("root");
		build.username("postgres");
		return build.build();

	}
}
