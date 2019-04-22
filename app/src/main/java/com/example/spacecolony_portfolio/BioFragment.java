package com.example.spacecolony_portfolio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {


    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bio, container, false);

        ImageView avatar = (ImageView) view.findViewById(R.id.SC_foto);
        TextView TxtNama = (TextView) view.findViewById(R.id.TxtNama);
        TextView TxtBio = (TextView) view.findViewById(R.id.TxtAbout);

        StringBuilder stringbuilder = new StringBuilder();

        String message = " blalbalbalblablala ";

        for(int i = 0; i<50;i++){

            stringbuilder.append(message);

        }

        TxtBio.setText(stringbuilder.toString());
        return view;


    }

}
