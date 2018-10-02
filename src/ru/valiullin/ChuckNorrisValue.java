package ru.valiullin;

import java.util.Arrays;

public class ChuckNorrisValue {

    private static String id;
    private static String joke;
    private static String[] categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public ChuckNorrisValue() {
    }

    public ChuckNorrisValue(String id, String joke, String[] categories) {
        this.id = id;
        this.joke = joke;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "ChuckNorrisValue{" +
                "id='" + id + '\'' +
                ", joke='" + joke + '\'' +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }
}
