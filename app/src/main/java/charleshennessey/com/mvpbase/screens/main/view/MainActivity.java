package charleshennessey.com.mvpbase.screens.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import charleshennessey.com.mvpbase.R;
import charleshennessey.com.mvpbase.base_mvp.presenter.Presenter;
import charleshennessey.com.mvpbase.base_mvp.view.View;
import charleshennessey.com.mvpbase.dagger._main.DaggerMainComponent;
import charleshennessey.com.mvpbase.dagger._main.MainComponent;
import charleshennessey.com.mvpbase.dagger._main.MainPresenterModule;



public class MainActivity extends AppCompatActivity implements View {

    @Inject
    Presenter presenter;

    @Override
    protected void onStart() {
        presenter.onStart();
        super.onStart();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDaggerForPresenter(savedInstanceState);
        presenter.onCreate();
        Toast.makeText(this, presenter.doSomething(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        presenter.onPause();
        super.onPause();
    }
    @Override
    protected void onResume(){
        presenter.onResume();
        super.onResume();
    }
    @Override
    protected void onStop() {
        presenter.onStop();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void terminate() {
        finish();
    }

    @Override
    public void initDaggerForPresenter(Bundle bundle) {
        MainComponent component = DaggerMainComponent.builder()
                .mainPresenterModule(new MainPresenterModule())
                .build();
        component.inject(this);
        presenter.setView(this);
        presenter.setContext(this);
        //If we choose to use fragments
        //presenter.setFragManager(getSupportFragmentManager());
        //presenter.setInstanceState(bundle);
        //presenter.initFragController(component);
    }

    @Override
    public void showMsgFromPresenter(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
