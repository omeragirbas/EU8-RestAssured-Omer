package com.cydeo.pojo;

import java.util.List;

public class Search {
    private List<com.cydeo.pojo.Spartan> content;
    private int totalElement;

    @Override
    public String toString() {
        return "Search{" +
                "content=" + content +
                ", totalElement=" + totalElement +
                '}';
    }

    public List<com.cydeo.pojo.Spartan> getContent() {
        return content;
    }

    public void setContent(List<com.cydeo.pojo.Spartan> content) {
        this.content = content;
    }

    public int getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(int totalElement) {
        this.totalElement = totalElement;
    }
}
