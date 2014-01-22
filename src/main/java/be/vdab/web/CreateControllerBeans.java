package be.vdab.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("be.vdab.web")
public class CreateControllerBeans extends WebMvcConfigurationSupport {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/JSP/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/images/**")
	.addResourceLocations("/images/");
	registry.addResourceHandler("/styles/**").addResourceLocations("/styles/");
	registry.addResourceHandler("/scripts/**").addResourceLocations("/scripts/");
	}
}
