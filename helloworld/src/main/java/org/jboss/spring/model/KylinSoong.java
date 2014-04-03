package org.jboss.spring.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kylinsoong")
public class KylinSoong implements Serializable {

	private static final long serialVersionUID = 6027058544242203518L;

	private String id;
	
	private String name;
	
	public KylinSoong() {
		
	}

	public KylinSoong(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@Basic(optional = false)
	@GeneratedValue
	@Column(name = "id", nullable = false, length = 32)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "KylinSoong [id=" + id + ", name=" + name + "]";
	}

}
