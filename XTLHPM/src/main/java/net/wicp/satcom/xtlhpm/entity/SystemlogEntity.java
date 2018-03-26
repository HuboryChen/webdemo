package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "systemlog", schema = "xtlhpm", catalog = "")
public class SystemlogEntity {
    private long autoid;
    private String accname;
    private String realname;
    private String mobile;
    private String opertype;
    private String contents;
    private String contentd;
    private String remark;
    private String operatetime;

    @Id
    @Column(name = "autoid", nullable = false)
    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    @Basic
    @Column(name = "accname", nullable = true, length = 50)
    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Basic
    @Column(name = "realname", nullable = true, length = 30)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 11)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "opertype", nullable = true, length = 20)
    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype;
    }

    @Basic
    @Column(name = "contents", nullable = true, length = 200)
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "contentd", nullable = true, length = 1000)
    public String getContentd() {
        return contentd;
    }

    public void setContentd(String contentd) {
        this.contentd = contentd;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "operatetime", nullable = true, length = 19)
    public String getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(String operatetime) {
        this.operatetime = operatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemlogEntity that = (SystemlogEntity) o;
        return autoid == that.autoid &&
                Objects.equals(accname, that.accname) &&
                Objects.equals(realname, that.realname) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(opertype, that.opertype) &&
                Objects.equals(contents, that.contents) &&
                Objects.equals(contentd, that.contentd) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(operatetime, that.operatetime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, accname, realname, mobile, opertype, contents, contentd, remark, operatetime);
    }
}
