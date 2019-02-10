package com.nayanatech.recyclerviewvmedo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ItemModel> itemModelArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        setDataList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(itemModelArrayList);
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.notifyDataSetChanged();


    }

    private void setDataList() {
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));
        itemModelArrayList.add(new ItemModel("VMEDO", "Feb 7 2019,10:30 PM",
                "Health Benefits of strawberry fruit that will amaze you!",
                "10 Likes", "Like", "Share",
                R.drawable.th, R.drawable.orange,
                R.drawable.ic_favorite_black_24dp, R.drawable.ic_share_black_24dp));


    }
}
