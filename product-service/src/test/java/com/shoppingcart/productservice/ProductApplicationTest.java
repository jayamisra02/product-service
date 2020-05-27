package com.shoppingcart.productservice;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void checkForP1() throws Exception {
		this.mockMvc.perform(get("/getProductbyPid/"+1)).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Iphone")));
	}
	
	@Test
	public void checkForP2() throws Exception {
		this.mockMvc.perform(get("/getProductbyPid/"+2)).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Macbook")));
	}
	
	@Test
	public void checkForProducts() throws Exception {
		this.mockMvc.perform(get("/getProduct/")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Ipad")));
	}
	
	
}
