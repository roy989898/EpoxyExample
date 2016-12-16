package pom.myepoxyexample;

import android.content.Context;

import com.airbnb.epoxy.EpoxyAdapter;

import pom.myepoxyexample.model.ButtonModel;
import pom.myepoxyexample.model.HeaderModel;
import pom.myepoxyexample.model.PhotoModel;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class ComplexAdapter extends EpoxyAdapter {
    Context mContex;


    public ComplexAdapter(Context mContex) {
        this.mContex = mContex;
        String link = "http://heroes.values.com/4453/images/large/simle.jpg";
        HeaderModel header = new HeaderModel("My Photos");
        ButtonModel button = new ButtonModel();
        PhotoModel photo = new PhotoModel(mContex, link);
        addModels(header,button,photo);
    }

    /*public void addPhotos(Collection<Photo> photos) {
        hideModel(loaderModel);
        for (Photo photo : photos) {
            insertModelBefore(new PhotoModel(photo), loaderModel);
        }
    }*/
}
