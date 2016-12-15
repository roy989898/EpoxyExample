package pom.myepoxyexample.model;

import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithHolder;

import pom.myepoxyexample.Photo;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class PhotoModel extends EpoxyModelWithHolder{

    @Override
    protected EpoxyHolder createNewHolder() {
        return null;
    }

    @Override
    protected int getDefaultLayout() {
        return R;
    }
}
