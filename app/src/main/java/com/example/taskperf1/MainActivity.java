package com.example.taskperf1;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ✅ EdgeToEdge MUST come first
        EdgeToEdge.enable(this);

        // ✅ setContentView only once
        setContentView(R.layout.activity_main);

        // ✅ Window insets listener
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Carousel setup
        ImageCarousel carousel = findViewById(R.id.carousel);
        carousel.registerLifecycle(getLifecycle());

        // Create list of carousel items
        List<CarouselItem> imageList = new ArrayList<>();
        imageList.add(new CarouselItem(R.drawable.book1, "Best Selling Novel"));
        imageList.add(new CarouselItem(R.drawable.book2, "Best Ficton"));
        imageList.add(new CarouselItem(R.drawable.book3, "Best Horror"));

        // Set the images to carousel
        carousel.setData(imageList);

        // Customize carousel behavior
        carousel.setAutoPlay(true);              // Auto-scroll
        carousel.setAutoPlayDelay(3000);         // 3 seconds delay
        carousel.setShowIndicator(true);         // Show dots at bottom
        carousel.setIndicatorMargin(10);         // Margin for dots
    }
}