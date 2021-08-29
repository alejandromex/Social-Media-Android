
package com.example.socialmedia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.socialmedia.R;
import com.example.socialmedia.fragments.ChatsFragment;
import com.example.socialmedia.fragments.FiltersFragment;
import com.example.socialmedia.fragments.HomeFragment;
import com.example.socialmedia.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(new HomeFragment());
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            item -> {
                switch (item.getItemId()) {
                    case R.id.btnMenuHome:
                        openFragment(new HomeFragment());
                        return true;
                    case R.id.btnMenuChat:
                        openFragment(new ChatsFragment());
                        return true;
                    case R.id.btnMenuFiltro:
                        openFragment(new FiltersFragment());
                        return true;
                    case R.id.btnMenuProfile:
                        openFragment(new ProfileFragment());
                    default:
                        break;
                }
                return true;
            };

    public void openFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}