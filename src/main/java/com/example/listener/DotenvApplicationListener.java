package com.example.listener;

import me.paulschwarz.springdotenv.DotenvPropertySource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DotenvApplicationListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        Object obj = sce.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        if (obj != null && obj instanceof ConfigurableApplicationContext) {
            ConfigurableApplicationContext context = (ConfigurableApplicationContext)obj;
            DotenvPropertySource.addToEnvironment(context.getEnvironment());
        }
    }
}
