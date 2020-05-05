package yuhan03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "classpath:applicationCTX.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		History history = ctx.getBean("history",History.class);
		
		history.junior();
		
	}

}
