package com.malpo.sliver.sample.travelagent;

import android.content.Context;
import android.content.Intent;

import com.malpo.sliver.sample.ui.SampleActivity;

public class TravelAgent {
    public static void routeToSample(Context context) {
        Intent intent = new Intent(context, SampleActivity.class);
        context.startActivity(intent);
    }
}
