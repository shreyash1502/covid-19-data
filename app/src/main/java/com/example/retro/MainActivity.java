package com.example.retro;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {
ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(API.Base_url).addConverterFactory(GsonConverterFactory.create()).build();
        API api=retrofit.create(API.class);
        Call<List<data>> call =api.getData();
        call.enqueue(new Callback<List<data>>() {
            @Override
            public void onResponse(Call<List<data>> call, Response<List<data>> response) {
            List<data> datas=response.body();
            for(data d:datas){
                Log.d("Country", d.getCountry());
                String name[]=new String[datas.size()];
                for(int i=0;i<datas.size();i++){
                    name[i]=datas.get(i).getCountry();
                }
                listview.setAdapter(
                        new ArrayAdapter<String>(
                                getApplicationContext(),android.R.layout.activity_list_item,name
                        )
                );
            }
            }
            @Override
            public void onFailure(Call<List<data>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
