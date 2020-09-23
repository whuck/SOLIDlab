package edu.wctc.independentcopy.reader;

import java.util.List;

public class ListReader implements Reader {
    private List list;

    public ListReader(List list) {
        this.list = list;
    }

    @Override
    public String readln() {
        return "";
    }
}
