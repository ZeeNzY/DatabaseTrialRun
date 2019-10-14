package za.ac.cput.sqldemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class IndexController {

    @RequestMapping(value = {"/", "/sqlDemo"})
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Welcome to the home of Discussions", HttpStatus.OK);
    }
}
