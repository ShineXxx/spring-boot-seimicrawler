package cn.shine.seimi.service.impl;

import cn.shine.seimi.SeimiCrawlerApplication;
import cn.shine.seimi.domain.Movie;
import cn.shine.seimi.service.IMovieService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SeimiCrawlerApplication.class)
public class MovieServiceImplTest {

    @Autowired
    IMovieService movieService;

    @Test
    public void findByNum() {
//        log.info(movieService.findByNum("YMDD-158").toString());
    }

    @Test
    public void findByPage(){
        IPage<Movie> listByPage = movieService.findListByPage(1, 10);
        listByPage.getRecords().forEach(movie -> {
            log.info(movie.toString());
        });
    }
}