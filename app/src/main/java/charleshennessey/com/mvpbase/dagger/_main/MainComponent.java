package charleshennessey.com.mvpbase.dagger._main;


import charleshennessey.com.mvpbase.dagger._base.DaggerComponent;
import dagger.Component;

/**
 * Created by ceh024 on 9/5/17.
 */

@MainPresenterScope
@Component(modules = {MainPresenterModule.class})
public interface MainComponent extends DaggerComponent {
}
