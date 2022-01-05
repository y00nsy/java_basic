package com.kh.practice.list.music.model.vo;

public class Music {

    private String title;
    private String singer;

    public Music() {
    }

    public Music(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

   // public boolean equals(Object o) {}

    //public int compareTo(Object o) {}
}
