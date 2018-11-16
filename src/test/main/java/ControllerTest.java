import com.tan.controllers.RequestTestController;
import com.tan.controllers.StudentController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/16
 */
public class ControllerTest {
    @Test
    public void req() throws Exception {
        StudentController controller = new StudentController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/Student")).andExpect(MockMvcResultMatchers.view().name("student"))
        .andExpect(MockMvcResultMatchers.model().attribute("s","12345"));
    }
}
