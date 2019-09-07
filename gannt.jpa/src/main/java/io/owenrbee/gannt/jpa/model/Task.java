package io.owenrbee.gannt.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task {

	@Id
	@Column(nullable = false, length = 10)
	private String id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false, length = 10)
	private String code;
	private int level;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 25)
	private TaskStatus status;
	
	private Long start;
	private Long duration;
	private Long end;
	private boolean startIsMilestone;
	private boolean endIsMilestone;
	
	@OneToMany(mappedBy = "task")
	private List<Assignment> assigs;

	@Column(nullable = false, length = 125)
	private String depends;
	@Column(nullable = false, length = 125)
	private String description;
	private Float progress;
	
	@ManyToOne
	private Project project;
	
	private int order;
	
	@Override
	public boolean equals(Object object) {
		
		if(object instanceof Task) {
			Task that = (Task) object;
			
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the status
	 */
	public TaskStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	/**
	 * @return the start
	 */
	public Long getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Long start) {
		this.start = start;
	}
	/**
	 * @return the duration
	 */
	public Long getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	/**
	 * @return the end
	 */
	public Long getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(Long end) {
		this.end = end;
	}
	/**
	 * @return the startIsMilestone
	 */
	public boolean isStartIsMilestone() {
		return startIsMilestone;
	}
	/**
	 * @param startIsMilestone the startIsMilestone to set
	 */
	public void setStartIsMilestone(boolean startIsMilestone) {
		this.startIsMilestone = startIsMilestone;
	}
	/**
	 * @return the endIsMilestone
	 */
	public boolean isEndIsMilestone() {
		return endIsMilestone;
	}
	/**
	 * @param endIsMilestone the endIsMilestone to set
	 */
	public void setEndIsMilestone(boolean endIsMilestone) {
		this.endIsMilestone = endIsMilestone;
	}
	/**
	 * @return the assigs
	 */
	public List<Assignment> getAssigs() {
		return assigs;
	}
	/**
	 * @param assigs the assigs to set
	 */
	public void setAssigs(List<Assignment> assigs) {
		this.assigs = assigs;
	}
	/**
	 * @return the depends
	 */
	public String getDepends() {
		return depends;
	}
	/**
	 * @param depends the depends to set
	 */
	public void setDepends(String depends) {
		this.depends = depends;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the progress
	 */
	public Float getProgress() {
		return progress;
	}
	/**
	 * @param progress the progress to set
	 */
	public void setProgress(Float progress) {
		this.progress = progress;
	}
	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}
	
	
}
