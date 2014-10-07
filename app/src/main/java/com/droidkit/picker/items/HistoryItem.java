package com.droidkit.picker.items;

import android.view.View;
import android.widget.TextView;

import com.droidkit.file.R;

/**
 * Created by kiolt_000 on 14/09/2014.
 */
public class HistoryItem extends ExplorerItem {
    private final boolean hasHistory;

    public HistoryItem() {
        super(null, false);
        hasHistory = true;
    }

    public HistoryItem(boolean hasHistory) {
        super(null,false);
        this.hasHistory = hasHistory;
    }



    @Override
    public void bindData(View itemView) {
        TextView historyView = (TextView) itemView;
        if (!hasHistory){
            (historyView).setText(R.string.picker_files_recent_empty);
        }
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}