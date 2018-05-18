
package Controller;

import Modelos.Ruta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("form.htm")

public class FormController {
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form()
        {
            ModelAndView mav=new ModelAndView();
            mav.setViewName("form");
            mav.addObject("ruta", new Ruta());
            return mav;
        }
    
}
