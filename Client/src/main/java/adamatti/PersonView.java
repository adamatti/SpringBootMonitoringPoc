package adamatti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/person")
public class PersonView {
    private static Logger logger = LoggerFactory.getLogger(PersonView.class);

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List list(){
        logger.info("List called");
        return buildList();
    }

    private List buildList(){
        List list = new ArrayList();
        list.add(buildPerson(1,"Marcelo"));
        list.add(buildPerson(2,"Adamatti"));
        return list;
    }

    private Map buildPerson(Integer id, String name){
        Map map = new HashMap();
        map.put("id",id);
        map.put("name",name);
        return map;
    }
}
