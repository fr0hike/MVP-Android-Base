package charleshennessey.com.mvpbase.dagger._base;

import charleshennessey.com.mvpbase.screens.main.view.MainActivity;

/**
 * Created by ceh024 on 9/5/17.
 * Base component interface. Define all injectible view here, then create
 * your proper component for your scope.
 */

public interface DaggerComponent {
    /* MAIN ACTIVITY START */
    void inject(MainActivity target);
    /* MAIN ACTIVITY STOP  */
}
