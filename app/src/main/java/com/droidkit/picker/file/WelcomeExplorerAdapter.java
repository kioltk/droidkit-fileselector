package com.droidkit.picker.file;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.droidkit.file.R;
import com.droidkit.picker.items.ExplorerItem;
import com.droidkit.picker.items.HeaderItem;

import java.util.ArrayList;

/**
 * Created by kiolt_000 on 14/09/2014.
 */
public class WelcomeExplorerAdapter extends ExplorerAdapter {
    public WelcomeExplorerAdapter(Activity activity, ArrayList<ExplorerItem> items) {
        super(activity, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        ExplorerItem item = getItem(position);
        if (item instanceof HeaderItem) {

            itemView = View.inflate(context, R.layout.picker_item_header, null);
            itemView.setTag("header");
            item.bindData(itemView);
            return itemView;
        } else {
            if (convertView != null && !convertView.getTag().equals("header"))
                return super.getView(position, convertView, parent);
            else
                return super.getView(position, null, parent);
        }

    }
}