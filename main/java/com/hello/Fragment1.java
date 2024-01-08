package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // Hubungkan CardView dari layout fragment_1.xml untuk romance1
        CardView cardViewCrashLandingOnYou = view.findViewById(R.id.cdMenu1);
        // Tambahkan onClickListener untuk CardView romance1
        cardViewCrashLandingOnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka CrashLandingOnYou saat CardView romance1 diklik
                Intent intent = new Intent(getActivity(), CrashLandingOnYou.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk romance2
        CardView cardViewHospitalPlaylist = view.findViewById(R.id.cdMenu2);
        // Tambahkan onClickListener untuk CardView romance2
        cardViewHospitalPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka HospitalPlaylist saat CardView romance2
                Intent intent = new Intent(getActivity(), HospitalPlaylist.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk romance3
        CardView cardViewStartUp = view.findViewById(R.id.cdMenu3);
        // Tambahkan onClickListener untuk CardView romance3
        cardViewStartUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka StartUp saat CardView romance3 diklik
                Intent intent = new Intent(getActivity(), StartUp.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
