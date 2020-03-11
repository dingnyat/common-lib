package dingnyat.common.data.table;

public class Column {
    private String data;
    private String name;
    private boolean orderable;
    private boolean searchable;
    private Search search;

    public Column() {
    }

    public Column(String data, String name, boolean orderable, boolean searchable, Search search) {
        this.data = data;
        this.name = name;
        this.orderable = orderable;
        this.searchable = searchable;
        this.search = search;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrderable() {
        return orderable;
    }

    public void setOrderable(boolean orderable) {
        this.orderable = orderable;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
}
