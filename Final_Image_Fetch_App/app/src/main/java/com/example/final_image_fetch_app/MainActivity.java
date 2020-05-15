package com.example.final_image_fetch_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList <String> imgnames=new ArrayList<String>();
        final ArrayList<ImageView> pics=new ArrayList<ImageView>();

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(FetchFromResource.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FetchFromResource fetchFromResource=retrofit.create(FetchFromResource.class);
        Call<List<MyObjects>> call = fetchFromResource.getMyObjects();
        call.enqueue(new Callback<List<MyObjects>>() {
            @Override
            public void onResponse(Call<List<MyObjects>> call, Response<List<MyObjects>> response) {
                List<MyObjects> myObjects=response.body();
                for (MyObjects obj:myObjects){
                    Log.d("id",obj.getId());
                    Log.d("imagename",obj.getImagename());
                    addImageNamesInArrayList(imgnames,obj.getImagename());
                }
                addArrayImgtolayout(pics,imgnames);
            }
            @Override
            public void onFailure(Call<List<MyObjects>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"onFailure",Toast.LENGTH_LONG).show();
            }
        });

    }
    private void addImageNamesInArrayList(ArrayList <String> imgnames,String Imagename){
        imgnames.add(Imagename);
    }
    private void addArrayImgtolayout(ArrayList<ImageView> pics, ArrayList <String> imgnames){
        LinearLayout linearLayout=findViewById(R.id.LinearLayout_id);

        for(int i=0;i<imgnames.size();i++) {
            pics.add(i,new ImageView(this));
            String url = FetchFromResource.ROOT_URL + imgnames.get(i);
            loadImageFromURL(url, pics.get(i));
            linearLayout.addView(pics.get(i));
            TextView ImgNameView=new TextView(this);
            ImgNameView.setText(imgnames.get(i));
            ImgNameView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            linearLayout.addView(ImgNameView);
            Log.d("Image from url : ",url);

        }
    }
    public void loadImageFromURL(String url1,ImageView imageView) {
        Picasso.with(MainActivity.this).load(url1).into(imageView); //Picasso 2.5.2
        //Picasso.get().load(url1).into(iv); //Picasso 2.71828
    }
}
