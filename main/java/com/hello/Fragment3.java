package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        // Hubungkan CardView dari layout fragment_3.xml untuk action1
        CardView cardViewSweetHome = view.findViewById(R.id.cdMenu1);
        // Tambahkan onClickListener untuk CardView action1
        cardViewSweetHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka SweetHome saat CardView action1 diklik
                Intent intent = new Intent(getActivity(), SweetHome.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_3.xml untuk action2
        CardView cardViewOnePiece = view.findViewById(R.id.cdMenu2);
        // Tambahkan onClickListener untuk CardView action2
        cardViewOnePiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka OnePiece saat CardView action2
                Intent intent = new Intent(getActivity(), OnePiece.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_3.xml untuk action3
        CardView cardViewSquidGame = view.findViewById(R.id.cdMenu3);
        // Tambahkan onClickListener untuk CardView action3
        cardViewSquidGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka SquidGame saat CardView action3 diklik
                Intent intent = new Intent(getActivity(), SquidGame.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
