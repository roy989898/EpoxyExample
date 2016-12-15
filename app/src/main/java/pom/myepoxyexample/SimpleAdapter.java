package pom.myepoxyexample;

import com.airbnb.epoxy.EpoxyAdapter;

import pom.myepoxyexample.model.HeaderModel;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class SimpleAdapter extends EpoxyAdapter {

    public SimpleAdapter() {
        addModel(new HeaderModel("Hello World"));
    }
}
