package za.ac.cput.sqldemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.sqldemo.Domain.ResponseObj;
import za.ac.cput.sqldemo.Domain.Topic;
import za.ac.cput.sqldemo.Factory.ResponseObjFactory;
import za.ac.cput.sqldemo.Factory.TopicFactory;
import za.ac.cput.sqldemo.Service.TopicService;

import java.util.List;

@RestController
@RequestMapping("sqlDemo/lookup/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping(value = "/create/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createTopic(@PathVariable String subject)
    {
        System.out.println("Enter value: " + subject);

        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(),
                "Topic created!!");

        Topic savedTopic;

        if (subject == null || subject.trim().isEmpty() || subject.trim().equalsIgnoreCase("null"))
        {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide a Topic!");
        }
        else{
            savedTopic = topicService.retrieveByDesc(subject);

            if (savedTopic != null)
            {
                responseObj.setResponseDescription("Topic already exists!");
            } else{
                savedTopic = TopicFactory.buildTopic(subject);
                savedTopic = topicService.create(savedTopic);
            }
            responseObj.setResponse(savedTopic);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll()
    {
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString()
                , "Success");
        List<Topic> topics = topicService.getAll();
        responseObj.setResponse(topics);
        return ResponseEntity.ok(responseObj);
    }

}
