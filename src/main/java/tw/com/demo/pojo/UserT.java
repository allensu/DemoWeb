package tw.com.demo.pojo;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the user_t database table.
 * 
 */
@Entity
@Table(name="user_t")
public class UserT implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="User_SQ")
//	private int user_SQ;

	@Id
	@Column(name="Email")
	private String email;

	@Column(name="Name")
	private String name;

    public UserT() {
    }

//	public int getUser_SQ() {
//		return this.user_SQ;
//	}
//
//	public void setUser_SQ(int user_SQ) {
//		this.user_SQ = user_SQ;
//	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}