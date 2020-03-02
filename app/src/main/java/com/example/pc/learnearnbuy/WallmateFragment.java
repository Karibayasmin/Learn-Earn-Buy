package com.example.pc.learnearnbuy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.example.pc.learnearnbuy.R.id.detailsmaterialph1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph5;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd5;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph3;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd3;


/**
 * A simple {@link Fragment} subclass.
 */
public class WallmateFragment extends Fragment {


    public WallmateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_wallmate, container, false);

        final ImageView imageviewmaterialwd1=(ImageView)view.findViewById(visibilitymaterialwd1);
        final ImageView imageviewmaterialwd2=(ImageView) view.findViewById(visibilitymaterialwd2);
        final ImageView imageviewmaterialwd3=(ImageView) view.findViewById(visibilitymaterialwd3);
        final ImageView imageviewmaterialwd4=(ImageView) view.findViewById(R.id.visibilitymaterialwd4);
        final ImageView imageviewmaterialwd5=(ImageView) view.findViewById(R.id.visibilitymaterialwd5);

        final LinearLayout linearmaterialwd1=(LinearLayout) view.findViewById(detailsmaterialwd1);
        final LinearLayout linearmaterialwd2=(LinearLayout) view.findViewById(detailsmaterialwd2);
        final LinearLayout linearmaterialwd3=(LinearLayout) view.findViewById(detailsmaterialwd3);
        final LinearLayout linearmaterialwd4=(LinearLayout) view.findViewById(detailsmaterialwd4);
        final LinearLayout linearmaterialwd5=(LinearLayout) view.findViewById(detailsmaterialwd5);


        final ImageView imageviewwd1tutorial=(ImageView) view.findViewById(R.id.wd1tutorial);
        final ImageView imageviewwd2tutorial=(ImageView) view.findViewById(R.id.wd2tutorial);
        final ImageView imageviewwd3tutorial=(ImageView) view.findViewById(R.id.wd3tutorial);
        final ImageView imageviewwd4tutorial=(ImageView) view.findViewById(R.id.wd4tutorial);
        final ImageView imageviewwd5tutorial=(ImageView) view.findViewById(R.id.wd5tutorial);


        final ImageView imageviewwd1=(ImageView) view.findViewById(R.id.wd1image);
        final ImageView imageviewwd2=(ImageView) view.findViewById(R.id.wd2image);
        final ImageView imageviewwd3=(ImageView) view.findViewById(R.id.wd3image);
        final ImageView imageviewwd4=(ImageView) view.findViewById(R.id.wd4image);
        final ImageView imageviewwd5=(ImageView) view.findViewById(R.id.wd5image);


        imageviewwd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialwd1.setVisibility(View.INVISIBLE);

            }
        });

        imageviewwd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialwd2.setVisibility(View.INVISIBLE);

            }
        });

        imageviewwd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialwd3.setVisibility(View.INVISIBLE);

            }
        });

        imageviewwd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialwd4.setVisibility(View.INVISIBLE);

            }
        });

        imageviewwd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialwd5.setVisibility(View.INVISIBLE);

            }
        });




        linearmaterialwd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });



        linearmaterialwd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialwd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });

        linearmaterialwd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialwd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });


        imageviewmaterialwd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialwd1.setVisibility(View.VISIBLE);
                linearmaterialwd1.setVisibility(View.VISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);





            }
        });

        imageviewmaterialwd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialwd2.setVisibility(View.VISIBLE);
                linearmaterialwd2.setVisibility(View.VISIBLE);
                linearmaterialwd1.setVisibility(View.INVISIBLE);
                linearmaterialwd3.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialwd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialwd3.setVisibility(View.VISIBLE);
                linearmaterialwd3.setVisibility(View.VISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);
                linearmaterialwd4.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialwd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialwd4.setVisibility(View.VISIBLE);
                linearmaterialwd4.setVisibility(View.VISIBLE);
                linearmaterialwd3.setVisibility(View.INVISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialwd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialwd5.setVisibility(View.VISIBLE);
                linearmaterialwd5.setVisibility(View.VISIBLE);
                linearmaterialwd4.setVisibility(View.INVISIBLE);


            }


        });




        imageviewwd1tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewwd1tutorial.setVisibility(View.VISIBLE);
                linearmaterialwd1.setVisibility(View.INVISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph1VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=s5zo9BTQGmw");


            }


        });

        imageviewwd2tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewwd2tutorial.setVisibility(View.VISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);
                linearmaterialwd1.setVisibility(View.INVISIBLE);
                linearmaterialwd3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph2VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=lFvV6qzzUQA");


            }


        });

        imageviewwd3tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewwd3tutorial.setVisibility(View.VISIBLE);
                linearmaterialwd3.setVisibility(View.INVISIBLE);
                linearmaterialwd2.setVisibility(View.INVISIBLE);
                linearmaterialwd4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph3VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=6C-HnA_0lFo&list=PLFaXLRtoovDaeXE4-n-lCPBuPfSRnZmxx");


            }


        });

        imageviewwd4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewwd4tutorial.setVisibility(View.VISIBLE);
                linearmaterialwd4.setVisibility(View.INVISIBLE);
                linearmaterialwd5.setVisibility(View.INVISIBLE);
                linearmaterialwd3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph4VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=OCBB-m1Vo00");

            }


        });

        imageviewwd5tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewwd5tutorial.setVisibility(View.VISIBLE);
                linearmaterialwd5.setVisibility(View.INVISIBLE);
                linearmaterialwd4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=SDZQCLfMSlE");


            }


        });


        return view;
    }

    public void callYoutubeVideo(String videoLink){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        startActivity(browserIntent);

    }
}
