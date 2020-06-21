package com.example.java_services.tweet.controller;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.service.PickupLinesService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

// import org.junit.Before;
// import org.junit.Test;

@RunWith(SpringRunner.class)
@WebMvcTest(PickupLinesController.class)
public class PickupLinesControllerTest {

   @MockBean
   private PickupLinesService pkUpLinesService;

   @Autowired
   private MockMvc mvc;

   private JacksonTester<PickupLines> json;

   @BeforeEach
   public void setUp() throws Exception {
       JacksonTester.initFields(this, new ObjectMapper());
   }

   @Test
   public void getRandomPickupLinesTest() throws Exception{

       PickupLines funny = new PickupLines("Hey!");
       
       // Given some fake behavior of service ...

       given(pkUpLinesService.getPickupLines()).willReturn(Optional.of(funny));

       // when users access some url ...

       MockHttpServletResponse response = mvc.perform(get("/lines/random").accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();

       // Then : assert that fake service  get called ...
       assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       assertThat(response.getContentAsString()).isEqualTo(json.write(funny).getJson());
   }

}
