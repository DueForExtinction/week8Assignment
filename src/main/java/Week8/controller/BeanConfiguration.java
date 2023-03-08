/**
 * 
 */
package Week8.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Week8.bean.Menu;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 7, 2023
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Menu menu() {
		Menu bean = new Menu();
		return bean;
	}
}
