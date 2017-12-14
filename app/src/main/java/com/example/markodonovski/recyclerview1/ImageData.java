package com.example.markodonovski.recyclerview1;

import java.io.Serializable;

/**
 * Created by markodonovski on 12/14/17.
 */

public class ImageData implements Serializable{

    String likes;
    String favorites;
    String tags;
    String previewURL;
    String webformatURL;
    String userImageURL;

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public ImageData(String webformatURL) {
        this.webformatURL = webformatURL;
    }

}
