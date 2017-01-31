package com.example.rajesh.beatbox;

/**
 * Created by Rajesh on 1/31/2017.
 */

public class Sound {

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    private String mAssetPath;

    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = mAssetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
            }
}
