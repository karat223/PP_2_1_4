package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    @Autowired
    private Ocean1 ocean;

    @Autowired
    public KoscheiTheDeathless(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
