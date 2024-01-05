package net.javaguides.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lamp")
public class Lamp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "lamp_street_numer")
	private String lamp_street_numer;
	
	@Column(name = "lamp_is_done")
	private int lamp_is_done;
	
	@Column(name = "lamp_problem")
	private String lamp_problem;
	
	@Column(name = "lamp_icon_color")
	private String lamp_icon_color;
	
	public String getLamp_street_numer() {
		return lamp_street_numer;
	}
	
	@Column(name = "lamp_picture_url")
	private String lamp_picture_url;
	
	@Column(name = "lamp_region")
	private String lamp_region;
	
	@Column(name = "lamp_project")
	private String lamp_project;
	
	@Column(name = "lamp_numer")
	private String lamp_numer;
	
	@Column(name = "lamp_street")
	private String lamp_street;
	
	@Column(name = "lamp_armatuur")
	private String lamp_armatuur;
	
	@Column(name = "lamp_mast")
	private String lamp_mast;
	
	@Column(name = "lamp_longitude")
	private double lamp_longitude;
	
	@Column(name = "lamp_latitude")
	private double lamp_latitude;
	
	@Column(name = "lamp_rdx")
	private double lamp_rdx;
	
	@Column(name = "lamp_rdy")
	private double lamp_rdy;
	
	@Column(name = "lamp_obj_numer")
	private String lamp_obj_numer;

	public Lamp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lamp(String lamp_street_numer, int lamp_is_done, String lamp_problem, String lamp_icon_color,
			String lamp_picture_url, String lamp_region, String lamp_project, String lamp_numer, String lamp_street,
			String lamp_armatuur, String lamp_mast, long lamp_longitude, long lamp_latitude, double lamp_rdx,
			double lamp_rdy, String lamp_obj_numer) {
		super();
		this.lamp_street_numer = lamp_street_numer;
		this.lamp_is_done = lamp_is_done;
		this.lamp_problem = lamp_problem;
		this.lamp_icon_color = lamp_icon_color;
		this.lamp_picture_url = lamp_picture_url;
		this.lamp_region = lamp_region;
		this.lamp_project = lamp_project;
		this.lamp_numer = lamp_numer;
		this.lamp_street = lamp_street;
		this.lamp_armatuur = lamp_armatuur;
		this.lamp_mast = lamp_mast;
		this.lamp_longitude = lamp_longitude;
		this.lamp_latitude = lamp_latitude;
		this.lamp_rdx = lamp_rdx;
		this.lamp_rdy = lamp_rdy;
		this.lamp_obj_numer = lamp_obj_numer;
	}

	public void setLamp_street_numer(String lamp_street_numer) {
		this.lamp_street_numer = lamp_street_numer;
	}

	public int getLamp_is_done() {
		return lamp_is_done;
	}

	public void setLamp_is_done(int lamp_is_done) {
		this.lamp_is_done = lamp_is_done;
	}

	public String getLamp_problem() {
		return lamp_problem;
	}

	public void setLamp_problem(String lamp_problem) {
		this.lamp_problem = lamp_problem;
	}

	public String getLamp_icon_color() {
		return lamp_icon_color;
	}

	public void setLamp_icon_color(String lamp_icon_color) {
		this.lamp_icon_color = lamp_icon_color;
	}

	public String getLamp_picture_url() {
		return lamp_picture_url;
	}

	public void setLamp_picture_url(String lamp_picture_url) {
		this.lamp_picture_url = lamp_picture_url;
	}

	public String getLamp_region() {
		return lamp_region;
	}

	public void setLamp_region(String lamp_region) {
		this.lamp_region = lamp_region;
	}

	public String getLamp_project() {
		return lamp_project;
	}

	public void setLamp_project(String lamp_project) {
		this.lamp_project = lamp_project;
	}

	public String getLamp_numer() {
		return lamp_numer;
	}

	public void setLamp_numer(String lamp_numer) {
		this.lamp_numer = lamp_numer;
	}

	public String getLamp_street() {
		return lamp_street;
	}

	public void setLamp_street(String lamp_street) {
		this.lamp_street = lamp_street;
	}

	public String getLamp_armatuur() {
		return lamp_armatuur;
	}

	public void setLamp_armatuur(String lamp_armatuur) {
		this.lamp_armatuur = lamp_armatuur;
	}

	public String getLamp_mast() {
		return lamp_mast;
	}

	public void setLamp_mast(String lamp_mast) {
		this.lamp_mast = lamp_mast;
	}

	public double getLamp_longitude() {
		return lamp_longitude;
	}

	public void setLamp_longitude(long lamp_longitude) {
		this.lamp_longitude = lamp_longitude;
	}

	public double getLamp_latitude() {
		return lamp_latitude;
	}

	public void setLamp_latitude(long lamp_latitude) {
		this.lamp_latitude = lamp_latitude;
	}

	public double getLamp_rdx() {
		return lamp_rdx;
	}

	public void setLamp_rdx(double lamp_rdx) {
		this.lamp_rdx = lamp_rdx;
	}

	public double getLamp_rdy() {
		return lamp_rdy;
	}

	public void setLamp_rdy(double lamp_rdy) {
		this.lamp_rdy = lamp_rdy;
	}

	public String getLamp_obj_numer() {
		return lamp_obj_numer;
	}

	public void setLamp_obj_numer(String lamp_obj_numer) {
		this.lamp_obj_numer = lamp_obj_numer;
	}

	
}
