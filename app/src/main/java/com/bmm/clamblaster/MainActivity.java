package com.bmm.clamblaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* 0. Create Account in github.com & install Github for windows Client(109mb)
* 1. VCS -> Enable Version Control Integration... -> Git -> ok (Created Git repository in c:\Users\)
* 2. VCS -> Import into Version Control -> Share Project on GitHub -> Master Password: -> ok ->
*       New repository name: & Description -> share -> ok -> Successfully shared project on GitHub
* 3. refresh GitHub page & see repositories
*
* after change
*  1.VCS -> Commit Changes... -> Commit Message -> Commit and Push... -> Push -> Push successful
*/


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
