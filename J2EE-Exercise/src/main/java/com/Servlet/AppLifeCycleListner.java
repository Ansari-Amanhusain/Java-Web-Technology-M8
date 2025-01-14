package com.Servlet;

import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppLifeCycleListner implements ServletContextListener {

    private static final Logger logger = Logger.getLogger(AppLifeCycleListner.class.getName());
    @Override
    public void contextInitialized(ServletContextEvent sce) 
    {
        logger.info("Application started.");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) 
    {
        logger.info("Application stopped."); 
    }
}
