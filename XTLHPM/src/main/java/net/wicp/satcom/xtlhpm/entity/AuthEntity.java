package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth", schema = "xtlhpm", catalog = "")
public class AuthEntity {
    private long autoid;
    private String authname;
    private String description;
    private Integer pid;
    private Integer cid;
    private String pname;
    private String url;
    private String imagesrc;
    private Integer authorder;
    private String authgrade;

    @Id
    @Column(name = "autoid", nullable = false)
    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    @Basic
    @Column(name = "authname", nullable = true, length = 50)
    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "pid", nullable = true)
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "cid", nullable = true)
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "pname", nullable = true, length = 50)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 500)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "imagesrc", nullable = true, length = 200)
    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    @Basic
    @Column(name = "authorder", nullable = true)
    public Integer getAuthorder() {
        return authorder;
    }

    public void setAuthorder(Integer authorder) {
        this.authorder = authorder;
    }

    @Basic
    @Column(name = "authgrade", nullable = true, length = 50)
    public String getAuthgrade() {
        return authgrade;
    }

    public void setAuthgrade(String authgrade) {
        this.authgrade = authgrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthEntity that = (AuthEntity) o;
        return autoid == that.autoid &&
                Objects.equals(authname, that.authname) &&
                Objects.equals(description, that.description) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(cid, that.cid) &&
                Objects.equals(pname, that.pname) &&
                Objects.equals(url, that.url) &&
                Objects.equals(imagesrc, that.imagesrc) &&
                Objects.equals(authorder, that.authorder) &&
                Objects.equals(authgrade, that.authgrade);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, authname, description, pid, cid, pname, url, imagesrc, authorder, authgrade);
    }
}
