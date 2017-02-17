package mongodb;

import com.gogen.Repository.ControlsRepository;
import com.gogen.WorkflowConfig;
import com.gogen.controls.Controls;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {WorkflowConfig.class})
@WebAppConfiguration
@IntegrationTest
public class ControlsResitoryTest {

    @Autowired
    private ControlsRepository controlsRepository;

    @Test
    public void testSave(){
//        controlsRepository.save(new Controls("单选框","http://www.baidu.com"));
    }
}
