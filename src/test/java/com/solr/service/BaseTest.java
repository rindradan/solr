package com.solr.service;

import com.solr.service.index.IndexService;
import com.solr.service.search.SolrSearchService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest extends TestCase
{
    private ApplicationContext applicationContext;
    protected IndexService indexService;
    protected SolrSearchService searchService;

    protected void setUp() throws Exception
    {
        super.setUp();
        applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        indexService = (IndexService) getApplicationContext().getBean("indexService");
        searchService = (SolrSearchService) getApplicationContext().getBean("searchService");
    }

    public ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }

}
