package dingnyat.common.data.table;

import dingnyat.common.data.search.SearchCriterion;
import dingnyat.common.data.search.SearchRequest;

import java.util.ArrayList;
import java.util.List;

public class DataTableRequest extends SearchRequest {
    private List<Column> columns;
    private Search search;
    private List<Order> order;

    public String sortBy(Order order) {
        return this.columns.get(order.getColumn()).getData();
    }

    public List<String> getSearchableFields() {
        List<String> searchableFields = new ArrayList<>();
        for (Column column : columns) {
            if (column.isSearchable()) searchableFields.add(column.getData());
        }
        return searchableFields;
    }

    public List<String> getOrderableFields() {
        List<String> orderableFields = new ArrayList<>();
        for (Column column : columns) {
            if (column.isOrderable())
                orderableFields.add(column.getData());
        }
        return orderableFields;
    }

    public DataTableRequest() {
    }

    public DataTableRequest(List<Column> columns, Search search, List<Order> order) {
        this.columns = columns;
        this.search = search;
        this.order = order;
    }

    public DataTableRequest(int draw, int length, int start, List<SearchCriterion> searchCriteria, List<Column> columns, Search search, List<Order> order) {
        super(draw, length, start, searchCriteria);
        this.columns = columns;
        this.search = search;
        this.order = order;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
}
