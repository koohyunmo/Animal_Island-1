package petstone.project.animalisland.activity;

<<<<<<< HEAD
=======
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

>>>>>>> 606206004206bda025175208b1ab87dd2811ed38
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import petstone.project.animalisland.R;
<<<<<<< HEAD
=======
import petstone.project.animalisland.component.ChatComponent;
>>>>>>> 606206004206bda025175208b1ab87dd2811ed38
import petstone.project.animalisland.component.MypageComponent;
import petstone.project.animalisland.component.PetFriendComponent;
import petstone.project.animalisland.component.RehomeComponent;

//메인
public class MainActivity extends AppCompatActivity {

    //선언부
    BottomNavigationView bottomNavi;
    RehomeComponent homeFrag;
    PetFriendComponent petFrag;
    ChatComponent chatFrag;
    MypageComponent myFrag;



    //화면 초기화
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        


        bottomNavi = findViewById(R.id.bottom_tab);
        chatFrag = new ChatComponent();
        homeFrag = new RehomeComponent();
        petFrag = new PetFriendComponent();
        myFrag = new MypageComponent();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,homeFrag).commitAllowingStateLoss();

        bottomNavi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, homeFrag).commitAllowingStateLoss();
                        return true;
                    case R.id.bottom_petfriend:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, petFrag).commitAllowingStateLoss();
                        return true;
                    case R.id.bottom_chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, chatFrag).commitAllowingStateLoss();
                        return true;
                    case R.id.bottom_mypage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, myFrag).commitAllowingStateLoss();
                        return true;
                }
                return false;
            }
        });
    }
}