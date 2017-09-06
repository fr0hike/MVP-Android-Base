package charleshennessey.com.mvpbase.base_mvp.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import charleshennessey.com.mvpbase.base_mvp.view.View;
import charleshennessey.com.mvpbase.dagger._base.DaggerComponent;


/**
 * Created by ceh024 on 9/5/17.
 * Base Presenter, extend for further functionalty
 */

public interface Presenter<T> {
    /* LIFECYCLE START */

    void onStart();
    void onCreate();
    void onPause();
    void onResume();
    void onStop();
    void onDestroy();

    /* LIFECYCLE STOP  */

    /* MODEL CALLS START */

    String doSomething();

    /* MODEL CALLS STOP  */

    /* VIEW START */

    void setView(View v);
    void setContext(Context c);

    /* VIEW STOP */


    /* FRAGMENT SUPPORT START*/

    void setFragManager(FragmentManager fm);
    void setInstanceState(Bundle b);
    //Note this is specific to each componet
    void initFragController(DaggerComponent c);

    /* FRAGMENT SUPPORT END */

}
