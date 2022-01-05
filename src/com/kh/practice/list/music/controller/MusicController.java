package com.kh.practice.list.music.controller;

import com.kh.practice.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicController {

    private List<Music> musicList = new ArrayList<>();

    public int addList(Music music) {
        musicList.add(music);
        return 1;
    }

    public int addAtZero(Music music) {
        musicList.add(0, music);
        return 1;
    }

    public List printAll() {
        return musicList;
    }

    public Music searchMusic(String title) {
        return null;
    }

    public Music removeMusic(String title) {
        return null;

    }

    public int ascTitle() {
        musicList.sort(Music::compareTo);
        return 1;
    }

    public int descSinger() {
        return 1;
    }

}
