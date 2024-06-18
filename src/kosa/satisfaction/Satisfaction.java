package kosa.satisfaction;

import java.util.ArrayList;
import java.util.List;

public class Satisfaction {
    private List<String> list = new ArrayList<>();
    private String content;

    public Satisfaction() {}

    public void add(String content) {
        list.add(content);
    }

    public String getContent() {
        return content;
    }

    public List<String> getList() {
        return list;
    }
}
