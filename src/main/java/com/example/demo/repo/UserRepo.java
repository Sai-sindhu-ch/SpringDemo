/**
 * 
 */
package com.example.demo.repo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.User;

/**
 * @author sindhu
 *
 */
public interface UserRepo extends JpaRepository<User, Integer>{

	/**
	 * @param name
	 * @return
	 */
	User findByName(String name);
//	@Query("select user from User user where user.name = ?1")
//  User retrieveByName(String name);
//	@Query("select user from User user where user.name =:name and user.gender =:gender ")
//	User retrieveByNameAndGender(@Param("name") String name,@Param("gender") String gender );
	/**
	 * @param name
	 * @param gender
	 * @return
	 */
	@Query("select user from User user where user.name =?1 and user.gender =?2 ")
	User retrieveByNameAndGender(String name, String gender );
	
	/**
	 * @param name
	 * @param id
	 */
	@Transactional
	@Modifying
	@Query("UPDATE User user SET user.name =:name WHERE user.id =:id")
	void updateName(@Param("name") String name,@Param("id") int id );
	
}
