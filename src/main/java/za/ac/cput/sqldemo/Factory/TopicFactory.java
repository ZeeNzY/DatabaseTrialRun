package za.ac.cput.sqldemo.Factory;

import za.ac.cput.sqldemo.Domain.Topic;
import za.ac.cput.sqldemo.util.Misc;

public class TopicFactory {

    public static Topic buildTopic(String topic){
        return new Topic.Builder()
                .topicID(Misc.generateId())
                .topic(topic)
                .build();
    }
}
