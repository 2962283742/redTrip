import cn.redTrip.ApplicationMain;
import cn.redTrip.entity.dto.ArticleVisit;
import cn.redTrip.mapper.VisitMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author dzl
 * @date 2024/2/17 22:31
 */
@SpringBootTest(classes = ApplicationMain.class)
public class MyTset {

    @Resource
    private VisitMapper visitMapper;

    @Test
    public void FuckTest(){
        ArticleVisit articleVisit = visitMapper.selectById(1);
        System.out.println(articleVisit);

    }
}
