package com.example.notifications.push_notifications;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.notifications.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;

import static android.content.ContentValues.TAG;


public class MyFireBaseInstanceService extends FirebaseMessagingService {
    String token;



    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.e(TAG, "onNewToken: "+s );
        FirebaseInstanceId.getInstance().getInstanceId();

    }

}
