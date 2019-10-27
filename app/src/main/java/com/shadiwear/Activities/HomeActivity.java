package com.shadiwear.Activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.shadiwear.CustomAdapter.MainProductListAdapter;
import com.shadiwear.Models.MainProductListModel;
import com.shadiwear.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rvMainProduct;
    private ArrayList<MainProductListModel> products = new ArrayList<>();
    private DrawerLayout dlMain;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView nv;
    private Toolbar tbMain;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvMainProduct = findViewById(R.id.rv_main_product);
        dlMain = findViewById(R.id.dl_main);
        nv = findViewById(R.id.nv);
        tbMain = findViewById(R.id.tb_main);

        setSupportActionBar(tbMain);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerToggle = new ActionBarDrawerToggle(this, dlMain, R.string.open, R.string.close);
        dlMain.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        MainProductListAdapter adapter = new MainProductListAdapter(this, products);
        rvMainProduct.setAdapter(adapter);
        rvMainProduct.setLayoutManager(new GridLayoutManager(this, 2));

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.account:
                        Toast.makeText(HomeActivity.this, "My Account", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        Toast.makeText(HomeActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mycart:
                        Toast.makeText(HomeActivity.this, "My Cart", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });


        MainProductListModel model = new MainProductListModel(
                1,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_89Rcx-t-k4vU6S2gZi4QSUbqoSz2LE0sR9cXb5p9bbINpipk",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/1727861/2017/1/18/11484736092003-Shaftesbury-London-Men-Blazers-5241484736091725-1.jpg",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxSWLtghWikVXbW8rHTG0qQCwJ6cEp1WWcAyALerG-zxaTaYUVPw",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4b7djMYB2sK21X4sfSsPSFzby_Y4hk1IbAANfDkpFm5fs1c8A",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfUWJNT4xNvwbO72dZZwu5fiHNLF-8a_SdEyHGiRFwBiEgWlgLPw",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4BYvjSdt6vbBja1bVZnT4DX7MZZY-A1R-kJ7FTY1hFxmMxE8XPQ",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaNWs0m54iwuY7znbwW5k2tx6BJhlICyn8QyU7RAjPO5YWtOe0",
                new String[]{""},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        model = new MainProductListModel(2,
                "https://assets.panashindia.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/1/8/1868lg02-2002.jpg",
                new String[]{"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"},
                "Bridal suit",
                "Surat",
                "3/09/2019-20/02/2020",
                1000,
                "description",
                0);
        products.add(model);

        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
