package hello.serverlet.web.frontcontroller.v3;

import hello.serverlet.web.frontcontroller.ModelView;
import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);

}
