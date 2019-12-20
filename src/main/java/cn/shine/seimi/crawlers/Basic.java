package cn.shine.seimi.crawlers;

import cn.shine.seimi.domain.Movie;
import cn.shine.seimi.service.IMovieService;
import cn.wanghaomiao.seimi.def.BaseSeimiCrawler;
import cn.wanghaomiao.seimi.struct.Request;
import cn.wanghaomiao.seimi.struct.Response;
import org.seimicrawler.xpath.JXDocument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 汪浩淼 [et.tw@163.com]
 * @since 2015/10/21.
 */
//@Crawler(name = "basic_a")
public class Basic extends BaseSeimiCrawler {
    @Autowired
    IMovieService movieService;
    @Override
    public String[] startUrls() {
        ArrayList<String>res=new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            StringBuilder builder=new StringBuilder("https://ss9874.com/serchinfo_censored/");
            builder.append(i+"/categorybt_" +
                    i +
                    ".htm");
            res.add(builder.toString());
        }
        //两个是测试去重的
        return res.toArray(new String[res.size()]);
    }

    @Override
    public void start(Response response) {
        JXDocument doc = response.document();
//        System.out.println(response.getContent());
        try {
            List<Object> urls =
                    doc.sel("//div[@class='Po_topicCG']/a/@href");
            logger.info("{}", urls.size());
            for (Object s:urls){
                push(Request.build(s.toString(),Basic::getTitle));
//                break;
//                push(Request.build(s.toString(),"getTitle"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getTitle(Response response){
        JXDocument doc = response.document();
        try {
            /*logger.info("title:{}",
                    doc.sel("//div[@id='title']/b/text()"));
            logger.info("url:{}",
                     doc.sel("//div[@class='info_cg']/img/@src"));
            logger.info("number:{}",
                    doc.sel("//a[contains(@href,'/serialbt_1.htm')]/text()"));
            logger.info("maker:{}",
                    doc.sel("//a[contains(@href,'/makersbt_1.htm')]/text()"));
            logger.info("publish:{}",
                    doc.sel("//a[contains(@href,'/issuerbt_1.htm')]/text()"));
            logger.info("genre:{}",
                    doc.sel("//a[contains(@href,'/categorybt_1.htm')]/@href"));
            logger.info("actors:{}",
                    doc.sel("//div[@class='av_performer_cg_box']/img/@src"));
            logger.info("actors:{}",
                    doc.sel("//div[@class='av_performer_name_box']/a/@href"));
            logger.info("images:{}",
                    doc.sel("//div[@class='hvr-grow']/a/@href"));
            logger.info("images:{}",
                    doc.sel("//div[@class='hvr-grow']/a/img/@src"));*/
            //do something
            Movie movie=new Movie();
            movie.setMovieTitle(doc.sel("//div[@id='title']/b/text()").get(0).toString());
            movie.setNumber( doc.sel("//a[contains(@href,'/serialbt_1.htm')]/text()").get(0).toString());
            String img = doc.sel("//div[@class='info_cg']/img/@src").get(0).toString();
            movie.setMoviePicDetail(img);
            char[] chars = img.toCharArray();
            chars[chars.length-5]='s';
            movie.setMoviePic(new String(chars));
            movieService.add(movie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
