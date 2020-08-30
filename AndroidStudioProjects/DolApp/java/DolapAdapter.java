package com.example.dolap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DolapAdapter extends BaseAdapter implements View.OnClickListener{
    Context context;
    ArrayList<Urunler> urunler;
    public DolapAdapter(Context context, ArrayList<Urunler> urunler){
        this.context = context;
        this.urunler = urunler;
    }
    @Override
    public int getCount() {
        return urunler.size();
    }

    @Override
    public Object getItem(int position) {
        return urunler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)  {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View satir = inflater.inflate(R.layout.satir, parent, false);

        ImageView resim = satir.findViewById(R.id.fotograf);
        TextView baslik = satir.findViewById(R.id.txtbaslik);
        TextView aciklama = satir.findViewById(R.id.txtaciklama);
        TextView fiyat = satir.findViewById(R.id.txtfiyat);
        final TextView like = satir.findViewById(R.id.txtlike);
        ImageButton begen = satir.findViewById(R.id.btnbegen);

        resim.setImageResource(urunler.get(position).getImage());
        baslik.setText(urunler.get(position).getBaslik());
        aciklama.setText(urunler.get(position).getAciklama());
        fiyat.setText(urunler.get(position).getFiyat()+"");
        like.setText("Like: "+urunler.get(position).getLike());

        begen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urunler.get(position).setLike(urunler.get(position).getLike() + 1);
                like.setText("Like: "+urunler.get(position).getLike());
            }
        });

        return satir;
    }

    @Override
    public void onClick(View v) {

    }
}
