package iwork.beans;

import java.sql.Timestamp;
import java.util.Date;

public class Job {
	int id,id_user_client;
	String title,type,description,duration,tocken;
	boolean state;
	double budjet;
	Timestamp created_at;
	Timestamp updated_at;
	public Job() {
		}
	public Job(int id, int id_user_client, String title, String type, String description, String duration,
			String tocken, boolean state, double budjet) {
		
		this.id = id;
		this.id_user_client = id_user_client;
		this.title = title;
		this.type = type;
		this.description = description;
		this.duration = duration;
		this.tocken = tocken;
		this.state = state;
		this.budjet = budjet;
		this.created_at = new Timestamp(new Date().getTime());
		this.updated_at = new Timestamp(new Date().getTime());
	}

	
	//Timestamp date = new Timestamp(new Date().getTime());
	

	@Override
	public String toString() {
		return "Job [id=" + id + ", id_user_client=" + id_user_client + ", title=" + title + ", type=" + type
				+ ", description=" + description + ", duration=" + duration + ", tocken=" + tocken + ", state=" + state
				+ ", budjet=" + budjet + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_user_client() {
		return id_user_client;
	}
	public void setId_user_client(int id_user_client) {
		this.id_user_client = id_user_client;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTocken() {
		return tocken;
	}
	public void setTocken(String tocken) {
		this.tocken = tocken;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public double getBudjet() {
		return budjet;
	}
	public void setBudjet(double value) {
		this.budjet = value;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
