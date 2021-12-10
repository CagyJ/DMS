package com.system.dms;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.system.dms.controller.PageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class DmsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void indexForwardedTest() throws Exception {
		mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("index.html"))
				.andExpect(handler().handlerType(PageController.class));
	}

	@Test
	void ordersForwardedTest() throws Exception {
		mockMvc.perform(get("/orders"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("orders.html"))
				.andExpect(handler().handlerType(PageController.class));
	}

	@Test
	void carsForwardedTest() throws Exception {
		mockMvc.perform(get("/cars"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("cars.html"))
				.andExpect(handler().handlerType(PageController.class));
	}

	// TODO test login, histories and greeting page
	@Test
	void historiesForwardedTest() throws Exception {
		mockMvc.perform(get("/histories"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("histories.html"))
				.andExpect(handler().handlerType(PageController.class));
	}

}
