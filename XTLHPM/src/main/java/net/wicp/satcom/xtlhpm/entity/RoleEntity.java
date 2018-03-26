package net.wicp.satcom.xtlhpm.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "xtlhpm", catalog = "")
public class RoleEntity {
    private long autoid;
    private String rolename;
    private String rolecode;

    @Id
    @Column(name = "autoid", nullable = false)
    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    @Basic
    @Column(name = "rolename", nullable = true, length = 50)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Basic
    @Column(name = "rolecode", nullable = true, length = 50)
    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return autoid == that.autoid &&
                Objects.equals(rolename, that.rolename) &&
                Objects.equals(rolecode, that.rolecode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(autoid, rolename, rolecode);
    }
}
