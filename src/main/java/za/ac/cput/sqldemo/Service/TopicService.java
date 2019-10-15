package za.ac.cput.sqldemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.sqldemo.Domain.Topic;


import java.util.ArrayList;
import java.util.List;

@Service
public interface TopicService extends IService<Topic, String>{

    Topic retrieveByDesc(String topicDesc);
    List<Topic> getAll();

}
