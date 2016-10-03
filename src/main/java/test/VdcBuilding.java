package test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "layout_building_map")
public class VdcBuilding implements Serializable {
	private static final long serialVersionUID = -9031205453286307307L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@Column(name="PARENT_SITE_UID")
	private int parentSiteUid;
	// private Long age;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getParentSiteUid() {
		return parentSiteUid;
	}

	public void setParentSiteUid(int parentSiteUid) {
		this.parentSiteUid = parentSiteUid;
	}

}