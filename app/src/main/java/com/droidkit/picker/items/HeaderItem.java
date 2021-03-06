package com.droidkit.picker.items;

import android.view.View;
import android.widget.TextView;

import com.droidkit.file.R;

/**
 * Created by kiolt_000 on 14/09/2014.
 */
public class HeaderItem extends ExplorerItem {


    private final String name;

    public HeaderItem(String name) {
        super(null, false);
        this.name = name;
    }



    @Override
    public void bindData(View itemView) {
        TextView historyView = (TextView) itemView.findViewById(R.id.title);
        historyView.setText(name);
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}