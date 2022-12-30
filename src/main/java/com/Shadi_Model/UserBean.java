package com.Shadi_Model;

public class UserBean {
private int id;
private int age;
private String name;
private String gender;
private String number;
private String password;
private String email;
private String city;
private String country;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "UserBean [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", number=" + number
			+ ", password=" + password + ", email=" + email + ", city=" + city + ", country=" + country + "]";
}


}
