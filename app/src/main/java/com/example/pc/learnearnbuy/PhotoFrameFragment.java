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

import static com.example.pc.learnearnbuy.R.id.detailsmaterialpf1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialpf2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialpf3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialpf4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialpf5;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialwd5;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialpf1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialpf2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialpf3;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialwd3;


/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoFrameFragment extends Fragment {


    public PhotoFrameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_photo_frame, container, false);


        final ImageView imageviewmaterialpf1=(ImageView)view.findViewById(visibilitymaterialpf1);
        final ImageView imageviewmaterialpf2=(ImageView) view.findViewById(visibilitymaterialpf2);
        final ImageView imageviewmaterialpf3=(ImageView) view.findViewById(visibilitymaterialpf3);
        final ImageView imageviewmaterialpf4=(ImageView) view.findViewById(R.id.visibilitymaterialpf4);
        final ImageView imageviewmaterialpf5=(ImageView) view.findViewById(R.id.visibilitymaterialpf5);

        final LinearLayout linearmaterialpf1=(LinearLayout) view.findViewById(detailsmaterialpf1);
        final LinearLayout linearmaterialpf2=(LinearLayout) view.findViewById(detailsmaterialpf2);
        final LinearLayout linearmaterialpf3=(LinearLayout) view.findViewById(detailsmaterialpf3);
        final LinearLayout linearmaterialpf4=(LinearLayout) view.findViewById(detailsmaterialpf4);
        final LinearLayout linearmaterialpf5=(LinearLayout) view.findViewById(detailsmaterialpf5);


        final ImageView imageviewpf1tutorial=(ImageView) view.findViewById(R.id.pf1tutorial);
        final ImageView imageviewpf2tutorial=(ImageView) view.findViewById(R.id.pf2tutorial);
        final ImageView imageviewpf3tutorial=(ImageView) view.findViewById(R.id.pf3tutorial);
        final ImageView imageviewpf4tutorial=(ImageView) view.findViewById(R.id.pf4tutorial);
        final ImageView imageviewpf5tutorial=(ImageView) view.findViewById(R.id.pf5tutorial);

        final ImageView imageviewpf1=(ImageView) view.findViewById(R.id.pf1image);
        final ImageView imageviewpf2=(ImageView) view.findViewById(R.id.pf2image);
        final ImageView imageviewpf3=(ImageView) view.findViewById(R.id.pf3image);
        final ImageView imageviewpf4=(ImageView) view.findViewById(R.id.pf4image);
        final ImageView imageviewpf5=(ImageView) view.findViewById(R.id.pf5image);


        imageviewpf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialpf1.setVisibility(View.INVISIBLE);

            }
        });

        imageviewpf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialpf2.setVisibility(View.INVISIBLE);

            }
        });

        imageviewpf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialpf3.setVisibility(View.INVISIBLE);

            }
        });

        imageviewpf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialpf4.setVisibility(View.INVISIBLE);

            }
        });

        imageviewpf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialpf5.setVisibility(View.INVISIBLE);

            }
        });




        linearmaterialpf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });



        linearmaterialpf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialpf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });

        linearmaterialpf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialpf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });


        imageviewmaterialpf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialpf1.setVisibility(View.VISIBLE);
                linearmaterialpf1.setVisibility(View.VISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);





            }
        });

        imageviewmaterialpf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialpf2.setVisibility(View.VISIBLE);
                linearmaterialpf2.setVisibility(View.VISIBLE);
                linearmaterialpf1.setVisibility(View.INVISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialpf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialpf3.setVisibility(View.VISIBLE);
                linearmaterialpf3.setVisibility(View.VISIBLE);
                linearmaterialpf2.setVisibility(View.INVISIBLE);
                linearmaterialpf4.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialpf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialpf4.setVisibility(View.VISIBLE);
                linearmaterialpf4.setVisibility(View.VISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);
                linearmaterialpf2.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialpf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialpf5.setVisibility(View.VISIBLE);
                linearmaterialpf5.setVisibility(View.VISIBLE);
                linearmaterialpf4.setVisibility(View.INVISIBLE);


            }


        });




       imageviewpf1tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewpf1tutorial.setVisibility(View.VISIBLE);
                linearmaterialpf1.setVisibility(View.INVISIBLE);
                linearmaterialpf2.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph1VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=fJF1SNLEDmk");


            }


        });

        imageviewpf2tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewpf2tutorial.setVisibility(View.VISIBLE);
                linearmaterialpf2.setVisibility(View.INVISIBLE);
                linearmaterialpf1.setVisibility(View.INVISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph2VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=qpOQHB-c9-k");


            }


        });

        imageviewpf3tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewpf3tutorial.setVisibility(View.VISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);
                linearmaterialpf2.setVisibility(View.INVISIBLE);
                linearmaterialpf4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph3VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=bNI2XJH3Nak");


            }


        });

        imageviewpf4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewpf4tutorial.setVisibility(View.VISIBLE);
                linearmaterialpf4.setVisibility(View.INVISIBLE);
                linearmaterialpf5.setVisibility(View.INVISIBLE);
                linearmaterialpf3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph4VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=UpVClJY_oZc");

            }


        });

        imageviewpf5tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewpf5tutorial.setVisibility(View.VISIBLE);
                linearmaterialpf5.setVisibility(View.INVISIBLE);
                linearmaterialpf4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=JlT4wgccyd8");


            }


        });


        return view;
    }

    public void callYoutubeVideo(String videoLink){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        startActivity(browserIntent);

    }
}

