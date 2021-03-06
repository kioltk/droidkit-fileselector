package com.droidkit.picker.items;

import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import com.droidkit.file.R;
import com.droidkit.picker.file.ExploreItemViewHolder;

/**
 * Created by kiolt_000 on 22/09/2014.
 */
public class ExternalStorageItem extends ExplorerItem {
    private final String name;

    public ExternalStorageItem(String name, int imageId) {
        super(Environment.getExternalStorageDirectory(),false, "", imageId,true);
        this.name = name;
    }

    @Override
    public String getTitle() {
        return name;
    }






    @Override
    public void bindData(ExploreItemViewHolder holder) {
        holder.setTitle(getTitle());
        holder.disableSubtitle();
        holder.disableDivider();
    }
}
