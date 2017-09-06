package charleshennessey.com.mvpbase.screens.main.model;

import charleshennessey.com.mvpbase.base_mvp.model.Model;

/**
 * Created by ceh024 on 9/5/17.
 */

public class MainModelImp implements Model {
    @Override
    public String getData() {
        return "You returned data from the Model";
    }
}
