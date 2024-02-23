import cn.redTrip.ApplicationMain;
import cn.redTrip.common.RedisCacheForVisit;
import cn.redTrip.entity.dto.ArticleVisit;
import cn.redTrip.mapper.VisitMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author dzl
 * @date 2024/2/17 22:31
 */
@SpringBootTest(classes = ApplicationMain.class)
public class MyTset {

    @Resource
    private VisitMapper visitMapper;

    @Resource
    private RedisCacheForVisit redisCacheForVisit;

    @Test
    public void FuckTest(){
//        ArticleVisit articleVisit = new ArticleVisit(1,"3","6");
//        ArticleVisit articleVisit1 = new ArticleVisit(1,"7","6");
//        ArticleVisit articleVisit2 = new ArticleVisit(1,"8","6");
//        ArticleVisit articleVisit3 = new ArticleVisit(1,"9","6");
//
//        ArticleVisit[] articleVisits = new ArticleVisit[]{articleVisit,articleVisit1,articleVisit2,articleVisit3};
//        redisCacheForVisit.setVisit(articleVisit);

        System.out.println(redisCacheForVisit.getVisit());
    }
}
