package com.example.wikiexample;

import android.app.Activity;
import android.os.Bundle;

import com.wikitude.architect.ArchitectStartupConfiguration;
import com.wikitude.architect.WearableArchitectView;

import java.io.IOException;

public class MainActivity extends Activity {

    private WearableArchitectView wearableArchitectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wearableArchitectView = new WearableArchitectView(this);
        ArchitectStartupConfiguration configuration = new ArchitectStartupConfiguration();
        configuration.setLicenseKey("2tFveeemL3vm+GnBomyRoN36ELNg7PsgB0YLk/wqjL6aqr+5hlMN+uecw1F/U+d/aJ0FmUKWJO6GtHU4eGrKhHYgpd7QUKxOFRcNOBMqr79ZWd65W02ZxiwtWCKWtu2ThBu4OqOc25Dz6CZbtQvRWlkhqCuvpcLkCa0lAkQQ7KBTYWx0ZWRfX3peg41ZKm6ualAkx/TRPiZbxkPrOmp9TZIJob4H85lkMOuTnnF01V2X9f2OfFp0y1aKb3Pabueg6nYcptGE22Gw57EFsFoMg+Ish6lZxdhD5jUBPwuO7BRDb0tgMVvNegB6qVe/SQDJ4TZ5+jAdELoE8rdhp9M1jkMlB1cKOzvPImXkdEvFaLyqfNlulxSI/CO6mBi9Tk+MK4JidOtss81D5DnWQ3/tkG9fR8UkIHD9isn5+wBk3LZvu2nWFUdhnP0oMJkwU/WETWDRAlxVWQbWiPncadr37aqtRvgyabL4qkgzURGxKuAL+nc9ws+HQqPSAkPNTbgIGHCU5JxANE6bVqsGw5c6LNLhhgsD3gPDIQk0inDH43FwXektfXPRFm3Gdtpz1/6zxwkYW1q487XxR5eOEn0ljpF9QOHd6rDc1vsxvsoeoB6ldunpyXl+xbbZeF6bULn1hyjPLrptWET7Pn7ITO79+CAaYANhBizOCprjYsNSR6KFndg9nNNeQI6HNYsa1LL4");
        wearableArchitectView.onCreate(configuration);
        setContentView(wearableArchitectView);
    }

    @Override
    protected void onPostCreate(final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.wearableArchitectView.onPostCreate();
        try {
            this.wearableArchitectView.load("index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.wearableArchitectView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.wearableArchitectView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.wearableArchitectView.onDestroy();
    }
}
