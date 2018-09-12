package cn.itcast.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import cn.itcast.po.Items;

/** 
* <p>Title:SpringMvcFirst</p>
* <p>Description:实现controller接口</p>
* @author rorycheng
* @Date 2018年9月9日 上午10:47:44
* @version 1.0 
*/
@Controller
public class ItemsController_3 {
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() {

		//控制器调用service中方法数据，此处模拟静态数据
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
		
		
		ModelAndView modelAndView=new ModelAndView();
		//modelAndview中该方法相当于request中setAttribute
		modelAndView.addObject("listItems",listItems);
		
		//指定视图
		modelAndView.setViewName("/WEB-INF/JSP/Items/itemsList.jsp");
		
		return modelAndView;
	}
}
