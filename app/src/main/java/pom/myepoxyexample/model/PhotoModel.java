package pom.myepoxyexample.model;

import com.airbnb.epoxy.EpoxyModel;

import pom.myepoxyexample.Photo;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class PhotoModel extends EpoxyModel{
    private Photo photo;

    public PhotoModel(Photo photo) {
        this.photo = photo;
    }

    @Override
    protected int getDefaultLayout() {
        return 0;
    }
}
