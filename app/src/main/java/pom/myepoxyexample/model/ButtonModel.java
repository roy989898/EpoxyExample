package pom.myepoxyexample.model;

import android.view.View;
import android.widget.Button;

import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import pom.myepoxyexample.R;

/**
 * Created by Roy.Leung on 16/12/16.
 */

public class ButtonModel extends EpoxyModelWithHolder<ButtonModel.ButtonHolder> {
    private String btName="click";
    private View.OnClickListener clickListner;

    public void setBtName(String btName) {
        this.btName = btName;
    }

    public void setClickListner(View.OnClickListener clickListner) {
        this.clickListner = clickListner;
    }

    @Override
    protected ButtonHolder createNewHolder() {
        return new ButtonHolder();
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.module_button_layout;
    }

    @Override
    public void bind(ButtonHolder holder) {
        super.bind(holder);
        holder.btClick.setText(btName);
        if (clickListner != null)
            holder.btClick.setOnClickListener(clickListner);
    }

    static class ButtonHolder extends EpoxyHolder {
        @BindView(R.id.bt_click)
        Button btClick;


        @Override
        protected void bindView(View itemView) {
            ButterKnife.bind(this, itemView);
        }
    }
}
