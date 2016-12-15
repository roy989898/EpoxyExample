package pom.myepoxyexample.model;

import android.view.View;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;


import butterknife.BindView;
import butterknife.ButterKnife;
import pom.myepoxyexample.R;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class HeaderModel extends EpoxyModelWithHolder<HeaderModel.HeaderHolder> {
    private String header;

    public HeaderModel(String header) {
        this.header = header;
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.header_module_layout;
    }

    @Override
    public void bind(HeaderHolder holder) {
        super.bind(holder);
        holder.tvHeader.setText(header);
    }


    @Override
    protected HeaderHolder createNewHolder() {
        return new HeaderHolder();
    }


    static class HeaderHolder extends EpoxyHolder {
        @BindView(R.id.tv_header)
        TextView tvHeader;


        @Override
        protected void bindView(View itemView) {
            ButterKnife.bind(this, itemView);
        }
    }
}
