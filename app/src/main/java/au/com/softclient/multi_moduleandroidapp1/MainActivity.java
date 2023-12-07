package au.com.softclient.multi_moduleandroidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import au.com.softclient.mymodule1.NotificationUtil;

public class MainActivity extends AppCompatActivity {
    private NotificationUtil notificationUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationUtil = new NotificationUtil(getApplicationContext());

        Button chatButton = findViewById(R.id.chatButton);

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open ChatActivity when the button is clicked
                Intent chatIntent = new Intent(MainActivity.this,au.com.softclient.mymodule1.Module1MainActivity.class);
                startActivity(chatIntent);
                notificationUtil.sendHighPriorityNotification("New Notification", "Module1MainActivity: " );

            }
        });
    }
}