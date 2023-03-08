/**
 * 
 */
package Week8.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Week8.bean.Menu;
/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 7, 2023
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
