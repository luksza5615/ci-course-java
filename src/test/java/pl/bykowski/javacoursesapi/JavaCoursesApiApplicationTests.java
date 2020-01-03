package pl.bykowski.javacoursesapi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JavaCoursesApiApplicationTests {

    @Autowired
    private VideoCourseRepository videoCourseRepository;

    @Test
    public void checkNumberOfElements() {
        VideoCourse videoCourse = new VideoCourse();
        videoCourseRepository.save(videoCourse);
        Assert.assertEquals(1, videoCourseRepository.findAll().size());
    }
}
