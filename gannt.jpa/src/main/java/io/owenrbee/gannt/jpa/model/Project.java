package io.owenrbee.gannt.jpa.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Project {

	@Id
	@Column(nullable = false, length = 10)
	private String id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@OneToMany(mappedBy = "project")
	private List<Task> tasks;
	
	@ManyToMany(mappedBy = "projects")
	private Set<Resource> resources;
	
	@ManyToMany(mappedBy = "projects")
	private Set<Role> roles;
	

	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Project) {
			Project that = (Project) object;
			
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
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	/**
	 * @return the resources
	 */
	public Set<Resource> getResources() {
		return resources;
	}

	/**
	 * @param resources the resources to set
	 */
	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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
	
}
