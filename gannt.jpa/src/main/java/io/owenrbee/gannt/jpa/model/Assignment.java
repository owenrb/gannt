package io.owenrbee.gannt.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	
	@Id
	private String id;
	
	private String name;

	@ManyToOne
	private Resource resource;

	@ManyToOne
	private Role role;
	
	@ManyToOne
	private Task task;
	
	private Double effort;
	
	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Assignment) {
			Assignment that = (Assignment) object;
			
			return this.id != null && this.id.equalsIgnoreCase(that.id);
			
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the task
	 */
	public Task getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(Task task) {
		this.task = task;
	}

	/**
	 * @return the effort
	 */
	public Double getEffort() {
		return effort;
	}

	/**
	 * @param effort the effort to set
	 */
	public void setEffort(Double effort) {
		this.effort = effort;
	}

}
