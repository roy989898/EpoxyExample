package pom.myepoxyexample;

import com.airbnb.epoxy.EpoxyAdapter;

import java.util.Collection;

import pom.myepoxyexample.model.HeaderModel;
import pom.myepoxyexample.model.LoaderModel;
import pom.myepoxyexample.model.PhotoModel;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class PhotoAdapter extends EpoxyAdapter {
    private final LoaderModel loaderModel = new LoaderModel();

    public PhotoAdapter() {
        addModels(new HeaderModel("My Photos"), loaderModel);
    }

    public void addPhotos(Collection<Photo> photos) {
        hideModel(loaderModel);
        for (Photo photo : photos) {
            insertModelBefore(new PhotoModel(photo), loaderModel);
        }
    }
}
