package za.ac.cput.sqldemo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "myTopics")
public class Topic {
    @Id
    private String topicID;
    @Column(name = "topic_discussion")
  //  @OneToMany()
    private String topic;

    private Topic() {

    }

    private Topic(Builder builder) {
        this.topicID = builder.topicID;
        this.topic = builder.topic;

    }



    public String getTopicID() {
        return topicID;
    }

    public String getTopic() {
        return topic;
    }


    public String toString() {
        String str;
        str = "Topic ID " + getTopicID() + " Topic: " + getTopic();
        return str;
    }

    public static class Builder {
        private String topicID;
        private String topic;


        public Builder topicID(String topicID) {
            this.topicID = topicID;
            return this;
        }

        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public Builder copy(Topic topic)
        {
            this.topicID = topic.topicID;
            this.topic = topic.topic;

            return this;
        }

        public Topic build() {
            return new Topic(this);
        }

    }

}
