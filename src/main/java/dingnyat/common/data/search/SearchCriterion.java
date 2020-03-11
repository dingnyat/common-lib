package dingnyat.common.data.search;

public class SearchCriterion {
    private String key;
    private SearchOperator operator;
    private Object value;

    public SearchCriterion() {
    }

    public SearchCriterion(String key, SearchOperator operator, Object value) {
        this.key = key;
        this.operator = operator;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SearchOperator getOperator() {
        return operator;
    }

    public void setOperator(SearchOperator operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
