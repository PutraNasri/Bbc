package es.esy.kinketkuena.bbc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class home extends Fragment {

    public home() {
    }
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_home, container, false);
        Button mtk = (Button) rootview.findViewById(R.id.mtk);
        Button ips = (Button) rootview.findViewById(R.id.ips);

        mtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), mtk.class);
                startActivity(intent);
            }
        });
        ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), mtk.class);
                startActivity(intent);
            }
        });
        return rootview;
    }
}
