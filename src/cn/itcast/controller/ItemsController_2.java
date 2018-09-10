package cn.itcast.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.po.Items;

/** 
* <p>Title:SpringMvcFirst</p>
* <p>Description:实现HttpRequestHandler接口</p>
* @author rorycheng
* @Date 2018年9月9日 上午10:47:44
* @version 1.0 
*/
public class ItemsController_2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Items> listItems=new ArrayList<Items>();
		
		Items items_1=new Items();
		items_1.setName("Nick");
		items_1.setPrice(699f);
		items_1.setDetail("这是一双促销的鞋子");
		
		Items items_2=new Items();
		items_2.setName("adidas");
		items_2.setPrice(799f);
		items_2.setDetail("这是新品");
		
		
		listItems.add(items_1);
		listItems.add(items_2);
		//设置数据
		request.setAttribute("listItems", listItems);
		//设置转发视图    arg0 就为视图地址
		request.getRequestDispatcher("/WEB-INF/JSP/Items/itemsList.jsp").forward(request, response);
		
		
		//使用该种接口，通过response设置响应数据格式
	}

}
