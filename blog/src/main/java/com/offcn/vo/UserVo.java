package com.offcn.vo;

import com.offcn.bean.Role;
import com.offcn.bean.User;

public class UserVo extends User {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
