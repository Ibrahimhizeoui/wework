package iwork.beans;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	int id;
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type_user=" + type_user + ", mail=" + mail + ", password="
				+ password + ", remember_token=" + remember_token + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	public User(int id, String name, String type_user, String mail, String password, String remember_token
			) {
		
		this.id = id;
		this.name = name;
		this.type_user = type_user;
		this.mail = mail;
		this.password = password;
		this.remember_token = remember_token;
		this.created_at = new Timestamp(new Date().getTime());
		this.updated_at = new Timestamp(new Date().getTime());
	}
	
	String name,type_user,mail,password,remember_token;
	Timestamp created_at;
	Timestamp updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType_user() {
		return type_user;
	}
	public void setType_user(String type_user) {
		this.type_user = type_user;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemember_token() {
		return remember_token;
	}
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
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
