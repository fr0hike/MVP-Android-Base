package charleshennessey.com.mvpbase.base_mvp.view;

import android.os.Bundle;

/**
 * Created by ceh024 on 9/5/17.
 *
 * Base View, extend for further functionality
 */

public interface View<T> {
    void terminate();
    void initDaggerForPresenter(Bundle bundle);
    void showMsgFromPresenter(String msg);
}
