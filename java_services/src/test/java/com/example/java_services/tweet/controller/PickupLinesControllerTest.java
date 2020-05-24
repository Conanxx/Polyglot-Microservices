package com.example.java_services.tweet.controller;

import com.example.java_services.tweet.service.PickupLinesService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PickupLinesController.class)
public class PickupLinesControllerTest {

    @MockBean
    private PickupLinesService pkUpLinesService;

    @Autowired
    private MockMvc mvc;
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRandomPickupLinesTest() throws Exception{

        // Given some fake behavior of service ...
        
        // given(pkupLinesService.getPickupLines()).willReturn()

        // when users access some url ...
        
        // MockHttpServletResponse response = mvc.perform()

        // Then : assert that fake service  get called ...

    }
    
}
