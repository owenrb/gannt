package io.owenrbee.gannt.jpa.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Resource {

	@Id
	private String id;
	
	private String name;
	
	@OneToMany(mappedBy = "resource")
	private List<Assignment> assignments;
	
	@ManyToMany
	private Set<Project> projects;
	
	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Resource) {
			Resource that = (Resource) object;
			
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
	 * @return the assignments
	 */
	public List<Assignment> getAssignments() {
		return assignments;
	}

	/**
	 * @param assignments the assignments to set
	 */
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	/**
	 * @return the projects
	 */
	public Set<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}
