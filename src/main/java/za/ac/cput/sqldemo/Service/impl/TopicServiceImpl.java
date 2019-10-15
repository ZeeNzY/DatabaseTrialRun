package za.ac.cput.sqldemo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.sqldemo.Domain.Topic;
import za.ac.cput.sqldemo.Repository.TopicRepository;
import za.ac.cput.sqldemo.Service.TopicService;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService {

    private static TopicService topicService = null;

    @Autowired
    private TopicRepository topicRepository;

    private TopicServiceImpl(){

    }

    public static TopicService getTopicService()
    {
        if (topicService == null)
        {
            topicService = new TopicServiceImpl();

        }
        return topicService;
    }



    @Override
    public Topic create(Topic topic)
    {
        return this.topicRepository.save(topic);
    }

    @Override
    public Topic read(String s) {
        Optional<Topic> optTopic = this.topicRepository.findById(s);
        return optTopic.orElse(null);
    }

    @Override
    public Topic update(Topic topic) {
        return this.topicRepository.save(topic);
    }

    @Override
    public void delete(String s) {
        this.topicRepository.deleteById(s);
    }


    @Override
    public Topic retrieveByDesc(String topicDesc) {
        List<Topic> topics = getAll();
        for (Topic topic: topics){
            if (topic.getTopic().equalsIgnoreCase(topicDesc))
                return topic;
        }
        return null;
    }

    @Override
    public List<Topic> getAll() {
        return this.topicRepository.findAll();
    }
}
