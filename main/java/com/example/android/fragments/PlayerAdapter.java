package com.example.android.fragments;

/**
 * Created by jtv2391 on 11/30/17.
 */

public interface PlayerAdapter {

    void loadMedia(int resourceId);

    void release();

    boolean isPlaying();

    void play();

    void reset();

    void pause();

    void initializeProgressCallback();

    void seekTo(int position);
}
