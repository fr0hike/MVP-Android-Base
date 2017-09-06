package charleshennessey.com.mvpbase.dagger._main;

import charleshennessey.com.mvpbase.base_mvp.presenter.Presenter;
import charleshennessey.com.mvpbase.screens.main.presenter.MainPresenterImp;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ceh024 on 9/5/17.
 */

@Module
public class MainPresenterModule {
    @Provides
    @MainPresenterScope
    Presenter provideMainPresenter(){
        return new MainPresenterImp();
    }
}
