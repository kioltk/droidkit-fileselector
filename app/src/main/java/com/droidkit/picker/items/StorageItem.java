package com.droidkit.picker.items;

import android.view.View;
import android.widget.TextView;

import com.droidkit.file.R;
import com.droidkit.picker.file.ExploreItemViewHolder;

import java.io.File;

public class StorageItem extends ExplorerItem {
    private final String name;

    public StorageItem(String name) {
        super(new File("/"), false, "", R.drawable.picker_memory, true);
        this.name = name;
    }

    @Override
    public String getTitle() {
        return name;
    }



    @Override
    public void bindData(View itemView) {
    }

    @Override
    public void bindData(ExploreItemViewHolder holder) {
        holder.setTitle(getTitle());
        holder.disableSubtitle();
        holder.disableDivider();
    }
}
