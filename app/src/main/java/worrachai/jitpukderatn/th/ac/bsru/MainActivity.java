package worrachai.jitpukderatn.th.ac.bsru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        getSupportFragmentManager().beginTransaction().add(R.id.LayoutMainFragment, new MainFragment()).commit();



    }  //Main method

}   //Main Class
