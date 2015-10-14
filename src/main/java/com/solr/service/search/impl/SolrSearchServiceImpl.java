package com.solr.service.search.impl;

import com.solr.service.search.SearchContext;
import com.solr.service.search.SolrSearchService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

public class SolrSearchServiceImpl implements SolrSearchService
{
    // TODO : add solrServer to properties
    private HttpSolrServer solrServer;

    public SolrSearchServiceImpl()
    {
        solrServer = new HttpSolrServer("http://localhost:6080/solr");
    }

    public SolrDocumentList searchElement(SearchContext sc) throws SolrServerException
    {
        SolrQuery query = new SolrQuery();
        query.setQuery(sc.getQ());

        if (sc.getFilters() != null)
            for (String filter : sc.getFilters())
            {
                query.addFilterQuery(filter);
            }

        if (sc.getFields() != null)
            for (String field : sc.getFields())
            {
                query.addField(field);
            }

        query.setFacet(sc.isFacet());

        query.setStart(sc.getStart());
        query.setRows(sc.getRows());

        QueryResponse queryResponse = solrServer.query(query);

        return queryResponse.getResults();
    }

}
