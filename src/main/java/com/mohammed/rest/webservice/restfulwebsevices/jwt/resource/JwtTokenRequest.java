package com.mohammed.rest.webservice.restfulwebsevices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {

  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJNb2hhbW1lZCIsImV4cCI6MTU1NjQwMTUwMCwiaWF0IjoxNTU1Nzk2NzAwfQ.Rm_ZLKVro_0zDQtYqknv-u1QZLOycVFIcMzZWdiLUSVjrm7G8hfzOe2TxSEhfW9X7ZW9hpBJfKlC8efJYBVeEw"
//    }


    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
