package sn.isi.controller;

import sn.isi.doa.IRoles;
import sn.isi.doa.RolesImpl;
import sn.isi.entities.Roles;

public class main {
    public static void main(String[] args){
        IRoles iRoles = new RolesImpl();
        Roles roles = new Roles();
        roles.setNom("admin");
        int ok = iRoles.add(roles);
        System.out.println(ok);
    }
}
