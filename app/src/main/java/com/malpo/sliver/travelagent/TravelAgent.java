package com.malpo.sliver.travelagent;

import android.content.Context;
import android.content.Intent;

import com.malpo.sliver.ui.SampleActivity;

public class TravelAgent {
    public static void routeToSample(Context context) {
        Intent intent = new Intent(context, SampleActivity.class);
        context.startActivity(intent);
    }
}
