package dingnyat.common.data.search;

import java.util.List;

public class SearchRequest {
    private int draw;
    private int length;
    private int start;
    private List<SearchCriterion> searchCriteria;

    public SearchRequest() {
    }

    public SearchRequest(int draw, int length, int start, List<SearchCriterion> searchCriteria) {
        this.draw = draw;
        this.length = length;
        this.start = start;
        this.searchCriteria = searchCriteria;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<SearchCriterion> getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(List<SearchCriterion> searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
}
