package com.solr.service.search;

import java.util.LinkedList;
import java.util.List;

public class SearchContext
{
    private String q;
    private List<String> filters = new LinkedList<String>();
    private List<String> fields = new LinkedList<String>();
    private String sort;
    private int start;
    private int rows;
    private boolean facet = false;

    public String getQ()
    {
        return q;
    }

    public void setQ(String q)
    {
        this.q = q;
    }

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

    public List<String> getFilters()
    {
        return filters;
    }

    public void setFilters(List<String> filters)
    {
        this.filters = filters;
    }

    public List<String> getFields()
    {
        return fields;
    }

    public void setFields(List<String> fields)
    {
        this.fields = fields;
    }

    public boolean isFacet()
    {
        return facet;
    }

    public void setFacet(boolean facet)
    {
        this.facet = facet;
    }
}
