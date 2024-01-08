package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        // Hubungkan CardView dari layout fragment_2.xml untuk fantasy1
        CardView cardViewHowlsMovingCastle = view.findViewById(R.id.cdMenu1);
        // Tambahkan onClickListener untuk CardView fantasy1
        cardViewHowlsMovingCastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka HowlsMovingCastle saat CardView fantasy1 diklik
                Intent intent = new Intent(getActivity(), SpiritedAway.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_2.xml untuk fantasy2
        CardView cardViewSpiritedAway = view.findViewById(R.id.cdMenu2);
        // Tambahkan onClickListener untuk CardView fantasy2
        cardViewSpiritedAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka SpiritedAway saat CardView fantasy2
                Intent intent = new Intent(getActivity(), HowlsMovingCastle.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_2.xml untuk fantasy3
        CardView cardViewPonyo = view.findViewById(R.id.cdMenu3);
        // Tambahkan onClickListener untuk CardView fantasy3
        cardViewPonyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka Ponyo saat CardView fantasy3 diklik
                Intent intent = new Intent(getActivity(), Ponyo.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
