package com.solr.service.search;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocumentList;

public interface SolrSearchService
{
    SolrDocumentList searchElement(SearchContext sc) throws SolrServerException;
}
