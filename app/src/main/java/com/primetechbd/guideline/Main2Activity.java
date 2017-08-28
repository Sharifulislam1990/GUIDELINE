package com.primetechbd.guideline;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class Main2Activity extends AppCompatActivity {

    EditText mSearchBoxEditeText;
    TextView mUrlDisplayTextView;
    TextView mSearchResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mSearchBoxEditeText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);

        mSearchResult = (TextView) findViewById(R.id.tv_github_search_result_json);

    }

//    void makeGithubSerachQuery(){
//
//        String githubQuery = mSearchBoxEditeText.getText().toString();
//        URL githubSearchUr1 = NetworkUtils.buildUr1(githubQuery);
//        mUrlDisplayTextView.setText(githubSearchUr1.toString());
//
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemThatWasSelected = item.getItemId();
        if(menuItemThatWasSelected == R.id.action_search){
            Context context = Main2Activity.this;
            String message = "Search clicked";
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
