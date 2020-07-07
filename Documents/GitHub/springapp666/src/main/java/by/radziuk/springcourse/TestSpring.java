package by.radziuk.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");*/
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);
        /*Music musicBean = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }

}
