package digitalhouse.com.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();

        //Cricao dos Fragments
        Fragment_blue fb = new Fragment_blue();
        Fragment_red fr = new Fragment_red();
        Fragment_green fg = new Fragment_green();

        //Adicionando os Fragmnents da lista
        list.add(fb);
        list.add(fr);
        list.add(fg);

        //Criando um Adapter para o Fragment
        //Ao criar o Adapter, passamos um FragmentManager  e a lista de Fragments que será exibida
        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),list);

        //Criando um objeto ViewPager e associando-0 com o ViewPager do xml
        ViewPager viewPager = findViewById(R.id.viewPager);

        //Inserindo o Adapter no ViewPager
        viewPager.setAdapter(fragmentPageAdapter);

        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);
    }
}
