package pom.myepoxyexample.model;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import pom.myepoxyexample.R;

/**
 * Created by Roy.Leung on 15/12/16.
 */

public class PhotoModel extends EpoxyModelWithHolder<PhotoModel.PhotoHolder> {
    private Context mContext;
    private String mLink;

    public PhotoModel(Context mContext, String mLink) {
        this.mContext = mContext;
        this.mLink = mLink;
    }

    public PhotoModel(long id, Context mContext, String mLink) {
        super(id);
        this.mContext = mContext;
        this.mLink = mLink;
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.module_photo_layout;
    }

    @Override
    protected PhotoHolder createNewHolder() {
        return new PhotoHolder();
    }

    @Override
    public void bind(PhotoHolder holder) {
        super.bind(holder);
        Glide.with(mContext).load(mLink).fitCenter().into(holder.imageView);

    }

    static class PhotoHolder extends EpoxyHolder {
        @BindView(R.id.imageView)
        ImageView imageView;


        @Override
        protected void bindView(View itemView) {
            ButterKnife.bind(this, itemView);
        }
    }
}
