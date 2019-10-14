package za.ac.cput.sqldemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.sqldemo.Domain.Topic;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

    //List<Topic> findAll();
}
