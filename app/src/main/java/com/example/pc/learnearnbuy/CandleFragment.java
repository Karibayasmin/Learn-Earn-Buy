package com.example.pc.learnearnbuy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ZoomControls;


import static com.example.pc.learnearnbuy.R.id.detailsmaterialca1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialca2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialca3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialca4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialca5;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph5;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialca1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialca2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialca3;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph3;


/**
 * A simple {@link Fragment} subclass.
 */
public class CandleFragment extends Fragment {


    public CandleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_candle, container, false);

        final ImageView imageviewmaterialca1=(ImageView)view.findViewById(visibilitymaterialca1);
        final ImageView imageviewmaterialca2=(ImageView) view.findViewById(visibilitymaterialca2);
        final ImageView imageviewmaterialca3=(ImageView) view.findViewById(visibilitymaterialca3);
        final ImageView imageviewmaterialca4=(ImageView) view.findViewById(R.id.visibilitymaterialca4);
        final ImageView imageviewmaterialca5=(ImageView) view.findViewById(R.id.visibilitymaterialca5);

        final LinearLayout linearmaterialca1=(LinearLayout) view.findViewById(detailsmaterialca1);
        final LinearLayout linearmaterialca2=(LinearLayout) view.findViewById(detailsmaterialca2);
        final LinearLayout linearmaterialca3=(LinearLayout) view.findViewById(detailsmaterialca3);
        final LinearLayout linearmaterialca4=(LinearLayout) view.findViewById(detailsmaterialca4);
        final LinearLayout linearmaterialca5=(LinearLayout) view.findViewById(detailsmaterialca5);


        final ImageView imageviewca1tutorial=(ImageView) view.findViewById(R.id.ca1tutorial);
        final ImageView imageviewca2tutorial=(ImageView) view.findViewById(R.id.ca2tutorial);
        final ImageView imageviewca3tutorial=(ImageView) view.findViewById(R.id.ca3tutorial);
        final ImageView imageviewca4tutorial=(ImageView) view.findViewById(R.id.ca4tutorial);
        final ImageView imageviewca5tutorial=(ImageView) view.findViewById(R.id.ca5tutorial);


        final ImageView imageviewca1=(ImageView) view.findViewById(R.id.ca1image);
        final ImageView imageviewca2=(ImageView) view.findViewById(R.id.ca2image);
        final ImageView imageviewca3=(ImageView) view.findViewById(R.id.ca3image);
        final ImageView imageviewca4=(ImageView) view.findViewById(R.id.ca4image);
        final ImageView imageviewca5=(ImageView) view.findViewById(R.id.ca5image);


        imageviewca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialca1.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://d18c4ebd.ngrok.io/cn1/index.php");

            }
        });

        imageviewca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialca2.setVisibility(View.INVISIBLE);

                callYoutubeVideo("https://c56982a8.ngrok.io/cn2/index.php");

            }
        });

        imageviewca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialca3.setVisibility(View.INVISIBLE);


            }
        });

        imageviewca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialca4.setVisibility(View.INVISIBLE);

            }
        });

        imageviewca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialca5.setVisibility(View.INVISIBLE);

            }
        });



        linearmaterialca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");



            }
        });



        linearmaterialca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });

        linearmaterialca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
                // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });


        imageviewmaterialca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialca1.setVisibility(View.VISIBLE);
                linearmaterialca1.setVisibility(View.VISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);





            }
        });

        imageviewmaterialca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialca2.setVisibility(View.VISIBLE);
                linearmaterialca2.setVisibility(View.VISIBLE);
                linearmaterialca1.setVisibility(View.INVISIBLE);
                linearmaterialca3.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialca3.setVisibility(View.VISIBLE);
                linearmaterialca3.setVisibility(View.VISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);
                linearmaterialca4.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialca4.setVisibility(View.VISIBLE);
                linearmaterialca4.setVisibility(View.VISIBLE);
                linearmaterialca3.setVisibility(View.INVISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialca5.setVisibility(View.VISIBLE);
                linearmaterialca5.setVisibility(View.VISIBLE);
                linearmaterialca4.setVisibility(View.INVISIBLE);


            }


        });




        imageviewca1tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewca1tutorial.setVisibility(View.VISIBLE);
                linearmaterialca1.setVisibility(View.INVISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph1VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=qOIhA4vI14E");


            }


        });

        imageviewca2tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewca2tutorial.setVisibility(View.VISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);
                linearmaterialca1.setVisibility(View.INVISIBLE);
                linearmaterialca3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph2VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=hiZo9upJNvQ ");


            }


        });

        imageviewca3tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewca3tutorial.setVisibility(View.VISIBLE);
                linearmaterialca3.setVisibility(View.INVISIBLE);
                linearmaterialca2.setVisibility(View.INVISIBLE);
                linearmaterialca4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph3VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=iixFtj_tG-I");


            }


        });

        imageviewca4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewca4tutorial.setVisibility(View.VISIBLE);
                linearmaterialca4.setVisibility(View.INVISIBLE);
                linearmaterialca5.setVisibility(View.INVISIBLE);
                linearmaterialca3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph4VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=X3FTktqEyLA");

            }


        });

        imageviewca5tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewca5tutorial.setVisibility(View.VISIBLE);
                linearmaterialca5.setVisibility(View.INVISIBLE);
                linearmaterialca4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=e3lK0-p5vRE");


            }


        });


        return view;
    }

    public void callYoutubeVideo(String videoLink){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        startActivity(browserIntent);
    }

}
