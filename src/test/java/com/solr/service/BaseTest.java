package com.solr.service;

import com.solr.service.index.IndexService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest extends TestCase
{
    private ApplicationContext applicationContext;
    protected IndexService indexService;

    protected void setUp() throws Exception
    {
        super.setUp();
        applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        indexService = (IndexService) getApplicationContext().getBean("indexService");
    }

    public ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }

}
