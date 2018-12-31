package com.example.user.sample;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainNavigation extends AppCompatActivity {

    //private FrameLayout mMainFrame;
    private BottomNavigationView mMainNav;
    private ClassFragment classFragment;
    private CodeFragment codeFragment;
    private ProFragment proFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

        //mMainFrame = (FrameLayout) findViewById(R.id.main_layout);
        mMainNav = findViewById(R.id.main_nav);

        classFragment = new ClassFragment();
        codeFragment = new CodeFragment();
        proFragment = new ProFragment();

        setFragment(classFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.class_nav:
                        setFragment(classFragment);
                        return true;
                    case R.id.code_nav:
                        setFragment(codeFragment);
                        return true;
                    case R.id.profile_nav:
                        setFragment(proFragment);
                        return true;
                    default:
                        return false;
                }
            }

            private void setFragment(android.support.v4.app.Fragment fragment) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_layout, fragment);
                fragmentTransaction.commit();
            }
        });
    }

    private void setFragment(ClassFragment classFragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_layout,classFragment);
        fragmentTransaction.commit();
    }
}
