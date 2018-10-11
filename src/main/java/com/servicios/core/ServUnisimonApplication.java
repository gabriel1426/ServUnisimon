package com.servicios.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.servicios.core.controller.CrosFilter;

@SpringBootApplication
public class ServUnisimonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServUnisimonApplication.class, args);
	}
	
	//exemplo de view resolver que te ajuda a devolver jsp, se sua aplicação usar jsp como view
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}

	
	@Configuration
    public static class PathMatchingConfigurationAdapter extends WebMvcConfigurerAdapter {
 
		@Override
        public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
            configurer.favorPathExtension(false);
        }
    }
	// configuração do ContentNegotiationViewResolver
	@Bean
	public ContentNegotiatingViewResolver contentNegotiatingViewResolver(ContentNegotiationManager negotiationManager) {

	    List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
	    viewResolvers.add(internalResourceViewResolver());
	    viewResolvers.add(new JsonViewResolver());
	    // outros view resolvers pra outros media types

	    ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
	    viewResolver.setViewResolvers(viewResolvers);
	    viewResolver.setContentNegotiationManager(negotiationManager);
	    return viewResolver;

	}
	
	
	@Bean
	public FilterRegistrationBean corsFilterRegistration() {
		FilterRegistrationBean registrationBean=
				new FilterRegistrationBean(new CrosFilter());
		registrationBean.setName("CORS FILTER");
		registrationBean.addUrlPatterns("/*");
		registrationBean.setOrder(1);
		return registrationBean;
	}
}
