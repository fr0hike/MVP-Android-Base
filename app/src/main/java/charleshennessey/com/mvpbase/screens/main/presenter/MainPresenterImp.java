package charleshennessey.com.mvpbase.screens.main.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

import charleshennessey.com.mvpbase.base_mvp.model.Model;
import charleshennessey.com.mvpbase.base_mvp.presenter.Presenter;
import charleshennessey.com.mvpbase.base_mvp.view.View;
import charleshennessey.com.mvpbase.dagger._base.DaggerComponent;
import charleshennessey.com.mvpbase.screens.main.model.MainModelImp;

/**
 * Created by ceh024 on 9/5/17.
 */

public class MainPresenterImp implements Presenter {

    private Model model;
    private View view;
    private Context context;

    public MainPresenterImp(){
        model = new MainModelImp();
    }

    @Override
    public void onStart() {
        view.showMsgFromPresenter("On Start");
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {
        view.showMsgFromPresenter("On Pause");
    }

    @Override
    public void onResume() {
        view.showMsgFromPresenter("On Resume");
    }

    @Override
    public void onStop() {
        view.showMsgFromPresenter("On Stop");
    }

    @Override
    public void onDestroy() {
        Toast.makeText(context, "Toast from Presenter using context - onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String doSomething() {
        return model.getData();
    }

    @Override
    public void setView(View v) {
        this.view = v;
    }

    @Override
    public void setContext(Context c) {
        this.context = c;
    }

    @Override
    public void setFragManager(FragmentManager fm) {

    }

    @Override
    public void setInstanceState(Bundle b) {

    }

    @Override
    public void initFragController(DaggerComponent c) {

    }
}
