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



import static com.example.pc.learnearnbuy.R.id.detailsmaterialph1;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph2;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph3;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph4;
import static com.example.pc.learnearnbuy.R.id.detailsmaterialph5;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph1;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph2;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph3;
import static com.example.pc.learnearnbuy.R.id.visibilitymaterialph4;



/**
 * A simple {@link Fragment} subclass.
 */
public class PenHolderFragment extends Fragment {


    public PenHolderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_pen_holder, container, false);

        final ImageView imageviewmaterialph1=(ImageView)view.findViewById(visibilitymaterialph1);
        final ImageView imageviewmaterialph2=(ImageView) view.findViewById(visibilitymaterialph2);
        final ImageView imageviewmaterialph3=(ImageView) view.findViewById(visibilitymaterialph3);
        final ImageView imageviewmaterialph4=(ImageView) view.findViewById(R.id.visibilitymaterialph4);
        final ImageView imageviewmaterialph5=(ImageView) view.findViewById(R.id.visibilitymaterialph5);

        final LinearLayout linearmaterialph1=(LinearLayout) view.findViewById(detailsmaterialph1);
        final LinearLayout linearmaterialph2=(LinearLayout) view.findViewById(detailsmaterialph2);
        final LinearLayout linearmaterialph3=(LinearLayout) view.findViewById(detailsmaterialph3);
        final LinearLayout linearmaterialph4=(LinearLayout) view.findViewById(detailsmaterialph4);
        final LinearLayout linearmaterialph5=(LinearLayout) view.findViewById(detailsmaterialph5);


        final ImageView imageviewph1tutorial=(ImageView) view.findViewById(R.id.ph1tutorial);
        final ImageView imageviewph2tutorial=(ImageView) view.findViewById(R.id.ph2tutorial);
        final ImageView imageviewph3tutorial=(ImageView) view.findViewById(R.id.ph3tutorial);
        final ImageView imageviewph4tutorial=(ImageView) view.findViewById(R.id.ph4tutorial);
        final ImageView imageviewph5tutorial=(ImageView) view.findViewById(R.id.ph5tutorial);

        final ImageView imageviewph1=(ImageView) view.findViewById(R.id.ph1image);
        final ImageView imageviewph2=(ImageView) view.findViewById(R.id.ph2image);
        final ImageView imageviewph3=(ImageView) view.findViewById(R.id.ph3image);
        final ImageView imageviewph4=(ImageView) view.findViewById(R.id.ph4image);
        final ImageView imageviewph5=(ImageView) view.findViewById(R.id.ph5image);


        imageviewph1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialph1.setVisibility(View.INVISIBLE);

            }
        });

        imageviewph2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialph2.setVisibility(View.INVISIBLE);

            }
        });

        imageviewph3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialph3.setVisibility(View.INVISIBLE);

            }
        });

        imageviewph4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialph4.setVisibility(View.INVISIBLE);

            }
        });

        imageviewph5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearmaterialph5.setVisibility(View.INVISIBLE);

            }
        });




        linearmaterialph1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });



        linearmaterialph2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialph3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });

        linearmaterialph4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");

            }
        });


        linearmaterialph5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(getActivity(), AllProductsBuy.class);
               // startActivity(intent);

                callYoutubeVideo("https://e0958f92.ngrok.io/shop/index.php");
            }
        });


        imageviewmaterialph1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialph1.setVisibility(View.VISIBLE);
                linearmaterialph1.setVisibility(View.VISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);





            }
        });

        imageviewmaterialph2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialph2.setVisibility(View.VISIBLE);
                linearmaterialph2.setVisibility(View.VISIBLE);
                linearmaterialph1.setVisibility(View.INVISIBLE);
                linearmaterialph3.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialph3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialph3.setVisibility(View.VISIBLE);
                linearmaterialph3.setVisibility(View.VISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);
                linearmaterialph4.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialph4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialph4.setVisibility(View.VISIBLE);
                linearmaterialph4.setVisibility(View.VISIBLE);
                linearmaterialph3.setVisibility(View.INVISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);


            }


        });

        imageviewmaterialph5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewmaterialph5.setVisibility(View.VISIBLE);
                linearmaterialph5.setVisibility(View.VISIBLE);
                linearmaterialph4.setVisibility(View.INVISIBLE);


            }


        });




        imageviewph1tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewph1tutorial.setVisibility(View.VISIBLE);
                linearmaterialph1.setVisibility(View.INVISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph1VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=RbtGfI4TzUU");


            }


        });

        imageviewph2tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewph2tutorial.setVisibility(View.VISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);
                linearmaterialph1.setVisibility(View.INVISIBLE);
                linearmaterialph3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph2VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=xqzlQhYm5u8");


            }


        });

        imageviewph3tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewph3tutorial.setVisibility(View.VISIBLE);
                linearmaterialph3.setVisibility(View.INVISIBLE);
                linearmaterialph2.setVisibility(View.INVISIBLE);
                linearmaterialph4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph3VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=OIO6E_KUnUU");


            }


        });

        imageviewph4tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewph4tutorial.setVisibility(View.VISIBLE);
                linearmaterialph4.setVisibility(View.INVISIBLE);
                linearmaterialph5.setVisibility(View.INVISIBLE);
                linearmaterialph3.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph4VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=hFCXBuFxQGk");

            }


        });

        imageviewph5tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.e("Onclick","Onclick");
                imageviewph5tutorial.setVisibility(View.VISIBLE);
                linearmaterialph5.setVisibility(View.INVISIBLE);
                linearmaterialph4.setVisibility(View.INVISIBLE);


                //Intent intent = new Intent(getActivity(), Ph5VedioTutorial.class);
                //startActivity(intent);
                callYoutubeVideo("https://www.youtube.com/watch?v=hFCXBuFxQGk");


            }


        });


        return view;
    }

    public void callYoutubeVideo(String videoLink){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        startActivity(browserIntent);

    }
}
