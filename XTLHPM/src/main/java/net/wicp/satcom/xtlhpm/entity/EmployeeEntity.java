package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "xtlhpm", catalog = "")
public class EmployeeEntity {
    private long autoid;
    private String uuid;
    private String accname;
    private String accpw;
    private String acctype;
    private String realname;
    private String company;
    private String dept;
    private String email;
    private String mobile;
    private String createtime;
    private String updatetime;
    private String bable;
    private String remark;

    @Id
    @Column(name = "autoid", nullable = false)
    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    @Basic
    @Column(name = "uuid", nullable = true, length = 36)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "accname", nullable = true, length = 20)
    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    @Basic
    @Column(name = "accpw", nullable = true, length = 20)
    public String getAccpw() {
        return accpw;
    }

    public void setAccpw(String accpw) {
        this.accpw = accpw;
    }

    @Basic
    @Column(name = "acctype", nullable = true, length = 10)
    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    @Basic
    @Column(name = "realname", nullable = true, length = 20)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "company", nullable = true, length = 100)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "dept", nullable = true, length = 60)
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "createtime", nullable = true, length = 19)
    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "updatetime", nullable = true, length = 19)
    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    @Basic
    @Column(name = "bable", nullable = true, length = 2)
    public String getBable() {
        return bable;
    }

    public void setBable(String bable) {
        this.bable = bable;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return autoid == that.autoid &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(accname, that.accname) &&
                Objects.equals(accpw, that.accpw) &&
                Objects.equals(acctype, that.acctype) &&
                Objects.equals(realname, that.realname) &&
                Objects.equals(company, that.company) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(updatetime, that.updatetime) &&
                Objects.equals(bable, that.bable) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, uuid, accname, accpw, acctype, realname, company, dept, email, mobile, createtime, updatetime, bable, remark);
    }
}
