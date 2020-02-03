package cs301.birthdaycake;

import cs301.birthdaycake.CakeView;
import cs301.birthdaycake.CakeView;

public class CakeController {

    private CakeView viewCake;
    private CakeModel modelCake;

    public CakeController(CakeView hey){
        this.viewCake = hey;
        this.modelCake = hey.getCakeModel();
    }


}
