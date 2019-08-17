package com.virtusa.numbertoword.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NumberToWordMockMvcTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
    public void testNumberToWordSuccess() throws Exception {
        this.mockMvc.perform(get("/numberToWord/10")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("ten")));
    }
	
	@Test
	public void testNumberToWordFail() throws Exception
	{
		this.mockMvc.perform(get("/numberToWord/20")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("ten")));
		
	}
	
}
