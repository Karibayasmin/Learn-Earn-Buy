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

import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard5;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard6;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard7;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialcard8;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph5;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialcard1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialcard2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialcard3;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph3;


/**
 * A simple {@link Fragment} subclass.
 */
public class CardFragment extends Fragment {


    public CardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_card, container, false);

        final ImageView imageviewmaterialcard1=(ImageView)view.findViewById(visibilitymaterialcard1);
        final ImageView imageviewmaterialcard2=(ImageView) view.findViewById(visibilitymaterialcard2);
        final ImageView imageviewmaterialcard3=(ImageView) view.findViewById(visibilitymaterialcard3);
        final ImageView imageviewmaterialcard4=(ImageView) view.findViewById(R.id.visibilitymaterialcard4);
        final ImageView imageviewmaterialcard5=(ImageView) view.findViewById(R.id.visibilitymaterialcard5);
        final ImageView imageviewmaterialcard6=(ImageView) view.findViewById(R.id.visibilitymaterialcard6);
        final ImageView imageviewmaterialcard7=(ImageView) view.findViewById(R.id.visibilitymaterialcard7);
        final ImageView imageviewmaterialcard8=(ImageView) view.findViewById(R.id.visibilitymaterialcard8);

        final LinearLayout linearmaterialcard1=(LinearLayout) view.findViewById(detailsmaterialcard1);
        final LinearLayout linearmaterialcard2=(LinearLayout) view.findViewById(detailsmaterialcard2);
        final LinearLayout linearmaterialcard3=(LinearLayout) view.findViewById(detailsmaterialcard3);
        final LinearLayout linearmaterialcard4=(LinearLayout) view.findViewById(detailsmaterialcard4);
        final LinearLayout linearmaterialcard5=(LinearLayout) view.findViewById(detailsmaterialcard5);
        final LinearLayout linearmaterialcard6=(LinearLayout) view.findViewById(detailsmaterialcard6);
        final LinearLayout linearmaterialcard7=(LinearLayout) view.findViewById(detailsmaterialcard7);
        final LinearLayout linearmaterialcard8=(LinearLayout) view.findViewById(detailsmaterialcard8);


        final ImageView imageviewcard1tutorial=(ImageView) view.findViewById(R.id.card1tutorial);
        final ImageView imageviewcard2tutorial=(ImageView) view.findViewById(R.id.card2tutorial);
        final ImageView imageviewcard3tutorial=(ImageView) view.findViewById(R.id.card3tutorial);
        final ImageView imageviewcard4tutorial=(ImageView) view.findViewById(R.id.card4tutorial);
        final ImageView imageviewcard5tutorial=(ImageView) view.findViewById(R.id.card5tutorial);
        final ImageView imageviewcard6tutorial=(ImageView) view.findViewById(R.id.card6tutorial);
        final ImageView imageviewcard7tutorial=(ImageView) view.findViewById(R.id.card7tutorial);
        final ImageView imageviewcard8tutorial=(ImageView) view.findViewById(R.id.card8tutorial);


        final ImageView imageviewcard1=(ImageView) view.findViewById(R.id.card1image);
        final ImageView imageviewcard2=(ImageView) view.findViewById(R.id.card2image);
        final ImageView imageviewcard3=(ImageView) view.findViewById(R.id.card3image);
        final ImageView imageviewcard4=(ImageView) view.findViewById(R.id.card4image);
        final ImageView imageviewcard5=(ImageView) view.findViewById(R.id.card5image);
        final ImageView imageviewcard6=(ImageView) view.findViewById(R.id.card6image);
        final ImageView imageviewcard7=(ImageView) view.findViewById(R.id.card7image);
        final ImageView imageviewcard8=(ImageView) view.findViewById(R.id.card8image);


        imageviewcard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard1.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://31ff868a.ngrok.io/3cd1/index.php");

            }
        });

        imageviewcard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard2.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://d7bc4df6.ngrok.io/3cd2/index.php");

            }
        });

        imageviewcard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard3.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://fcd54348.ngrok.io/ecd1/index.php");

            }
        });

        imageviewcard4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                linearmaterialcard4.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://19f8ecb8.ngrok.io/ecd2/index.php");

            }
        });

        imageviewcard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard5.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://ac83dfea.ngrok.io/ncd1/index.php");

            }
        });

        imageviewcard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard6.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://02d35746.ngrok.io/ncd2/index.php");

            }
        });

        imageviewcard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard7.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://7a429285.ngrok.io/pcd1/index.php");

            }
        });

        imageviewcard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialcard8.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://d1f7bf35.ngrok.io/pcd2/index.php");

            }
        });




        linearmaterialcard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });



        linearmaterialcard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialcard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });

        linearmaterialcard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialcard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });

        linearmaterialcard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });

        linearmaterialcard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });

        linearmaterialcard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });


        imageviewmaterialcard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard1.setVisibility(View.VISIBLE);
                linearmaterialcard1.setVisibility(View.VISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);





            }
        });

        imageviewmaterialcard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard2.setVisibility(View.VISIBLE);
                linearmaterialcard2.setVisibility(View.VISIBLE);
                linearmaterialcard1.setVisibility(View.INVISIBLE);
                linearmaterialcard3.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard3.setVisibility(View.VISIBLE);
                linearmaterialcard3.setVisibility(View.VISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);
                linearmaterialcard4.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard4.setVisibility(View.VISIBLE);
                linearmaterialcard4.setVisibility(View.VISIBLE);
                linearmaterialcard3.setVisibility(View.INVISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard5.setVisibility(View.VISIBLE);
                linearmaterialcard5.setVisibility(View.VISIBLE);
                linearmaterialcard4.setVisibility(View.INVISIBLE);
                linearmaterialcard6.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard6.setVisibility(View.VISIBLE);
                linearmaterialcard6.setVisibility(View.VISIBLE);
                linearmaterialcard5.setVisibility(View.INVISIBLE);
                linearmaterialcard7.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard7.setVisibility(View.VISIBLE);
                linearmaterialcard7.setVisibility(View.VISIBLE);
                linearmaterialcard6.setVisibility(View.INVISIBLE);
                linearmaterialcard8.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialcard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialcard8.setVisibility(View.VISIBLE);
                linearmaterialcard8.setVisibility(View.VISIBLE);
                linearmaterialcard7.setVisibility(View.INVISIBLE);



            }


        });




        imageviewcard1tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard1tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard1.setVisibility(View.INVISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph1VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=870JPSsUmc0&app=desktop");


            }


        });

        imageviewcard2tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard2tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);
                linearmaterialcard1.setVisibility(View.INVISIBLE);
                linearmaterialcard3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph2VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=QjL3Vbw8UQ0");


            }


        });

        imageviewcard3tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard3tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard3.setVisibility(View.INVISIBLE);
                linearmaterialcard2.setVisibility(View.INVISIBLE);
                linearmaterialcard4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph3VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=1L3JKIR8PpQ&app=desktop");


            }


        });

        imageviewcard4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard4tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard4.setVisibility(View.INVISIBLE);
                linearmaterialcard5.setVisibility(View.INVISIBLE);
                linearmaterialcard3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph4VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=4dMfbLrnB6M&app=desktop");

            }


        });

        imageviewcard5tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard5tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard5.setVisibility(View.INVISIBLE);
                linearmaterialcard6.setVisibility(View.INVISIBLE);
                linearmaterialcard4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=0qZPvEzhBR0&app=desktop");


            }


        });

        imageviewcard6tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard6tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard6.setVisibility(View.INVISIBLE);
                linearmaterialcard5.setVisibility(View.INVISIBLE);
                linearmaterialcard7.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=3VEb5QZbr50&app=desktop");


            }


        });

        imageviewcard7tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard7tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard7.setVisibility(View.INVISIBLE);
                linearmaterialcard6.setVisibility(View.INVISIBLE);
                linearmaterialcard5.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=q9ryrLOIB9M");


            }


        });

        imageviewcard8tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewcard8tutorial.setVisibility(View.VISIBLE);
                linearmaterialcard7.setVisibility(View.INVISIBLE);
                linearmaterialcard8.setVisibility(View.INVISIBLE);



                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=qvFdnLsQAi4&app=desktop");


            }


        });


        return view;
    }

    public void callYoutubeVideo(String videoLink){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        startActivity(browserIntent);

    }

}

