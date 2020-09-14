package joycai.demo.security.model;


import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class User  {

    String pwd;
    String name;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
