package logicyou.shopinfinity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageFlipBanner;
    ImageView imageAmazon;
    ImageView imagesnapDeal;
    ImageView imageAmzBigB;
    ImageView imageFlip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageFlipBanner = (ImageView) findViewById(R.id.imageFlipBanner);
        imageAmazon = (ImageView) findViewById(R.id.imageAmazon);
        imagesnapDeal = (ImageView) findViewById(R.id.imagesnapDeal);
        imageAmzBigB = (ImageView) findViewById(R.id.imageAmzBigB);
        imageFlip = (ImageView) findViewById(R.id.imageFlip);

        //Flipkart Banner
        imageFlipBanner.setOnClickListener(new View.OnClickListener()
            {
            public void onClick(View v) {
                //click button code here
                Uri uri = Uri.parse("https://dl.flipkart.com/dl/?affid=geekyijaz&affExtParam1=aff_appAndroid");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //Amazon Normal
                imageAmazon.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v) {
                        //click button code here
                        Uri uri = Uri.parse("https://www.amazon.in/?&_encoding=UTF8&tag=android0ea-21&linkCode=ur2&linkId=dca6e4eefd74c4118b9efce21d1b804d&camp=3638&creative=24630");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        //Snapdeal Normal
        imagesnapDeal.setOnClickListener(new View.OnClickListener()
                        {
                            public void onClick(View v) {
                                //click button code here
                                Uri uri = Uri.parse("https://www.snapdeal.com/?utm_source=aff_prog&utm_campaign=afts&offer_id=17&aff_id=102733&aff_sub=android");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                            }
                        });
        //Amazon Bigbillion
        imageAmzBigB.setOnClickListener(new View.OnClickListener()
                                {
                                    public void onClick(View v) {
                                        //click button code here
                                        Uri uri = Uri.parse("https://www.amazon.in/?&_encoding=UTF8&tag=android0ea-21&linkCode=ur2&linkId=dca6e4eefd74c4118b9efce21d1b804d&camp=3638&creative=24630");
                                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(intent);
                                    }
                                });
        //Flipkart Normal
                                        imageFlip.setOnClickListener(new View.OnClickListener()
                                        {
                                            public void onClick(View v) {
                                                //click button code here
                                                Uri uri = Uri.parse("https://dl.flipkart.com/dl/?affid=geekyijaz&affExtParam1=aff_appAndroid");
                                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                startActivity(intent);
                                            }
                                        }
        );


    }
}
