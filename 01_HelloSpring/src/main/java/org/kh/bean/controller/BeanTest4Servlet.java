package org.kh.bean.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.bean.model.vo.CollectionMap;
import org.kh.bean.model.vo.CollectionSet;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Servlet implementation class BeanTest4Servlet
 */
public class BeanTest4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanTest4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AbstractApplicationContext cntx =new GenericXmlApplicationContext("/applicationContext.xml");
		
		CollectionMap bean=cntx.getBean("mapBean",CollectionMap.class);
		Map<String,String> map=bean.getAddressMap();
		
		Set<String> keys=map.keySet();
		Iterator<String> iter=keys.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println("이름 :"+key +"/ 주소:"+map.get(key));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
