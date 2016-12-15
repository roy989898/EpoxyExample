package pom.myepoxyexample.model;

import com.airbnb.epoxy.EpoxyModel;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class HeaderModel extends EpoxyModel {
    private String header;

    public HeaderModel(String header) {
        this.header = header;
    }

    @Override
    protected int getDefaultLayout() {
        return 0;
    }
}
