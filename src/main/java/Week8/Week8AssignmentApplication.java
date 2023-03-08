package Week8;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Week8.controller.BeanConfiguration;
import Week8.repository.MenuRepository;
import Week8.bean.Menu;
@SpringBootApplication
public class Week8AssignmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssignmentApplication.class, args);
	}
	
	@Autowired
	MenuRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Menu m = appContext.getBean("menu", Menu.class);
		
		m.setName("Bills Steak house");
		m.setItem("Ribeye");
		m.setPrice(29);
		repo.save(m);
		List<Menu> allMenus = repo.findAll();
		
		for(Menu menus : allMenus) {
			System.out.println(menus.toString());
		}
	}

}
