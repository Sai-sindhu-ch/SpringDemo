/**
 * 
 */
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author sindhu
 * entity class User
 */
@Entity
public class User {
	public User(){
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * this variable id is of type integer  used to store user id 
	 */
	public int id;
	/**
	 * this variable gender is of type string  used to store user gender 
	 */
	public String gender;
	/**
	 * this variable is of type string used to store user name
	 */
	public String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.gender + " " + this.name + " "+ this.id; 
	}
}
