package com.recycleplus.projetorecycleplus;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link creditosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class creditosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public creditosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment creditosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static creditosFragment newInstance(String param1, String param2) {
        creditosFragment fragment = new creditosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_creditos, container, false);
        Button btnReferencias = view.findViewById(R.id.btnReferencias);

        ScrollView scrollView = view.findViewById(R.id.scrollViewCreditos);
        scrollView.setScrollBarSize(25);

        btnReferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaReferencias = new Intent(getContext(), Referencias.class);
                startActivity(telaReferencias);
            }
        });

        return view;
    }
}