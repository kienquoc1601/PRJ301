/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;
import model.Role;

/**
 *
 * @author LEGION OS
 */
public class AccountDBContext extends DBContext<Account>{
    

    public Account getAccountByUsernamePassword(String username, String password) {
        try {
            String sql = "SELECT a.username,a.password,a.admin\n" +
                                "       ,ISNULL(r.rid,-1) as rid,r.rname, ISNULL(f.fid,-1) as fid,f.fname,f.url\n" +
                                "       FROM Account a LEFT JOIN RoleAccount ra ON a.username = ra.username\n" +
                                "       LEFT JOIN [Role] r ON r.rid = ra.rid\n" +
                                "       LEFT JOIN RoleFeature rf ON rf.rid = r.rid\n" +
                                "       LEFT JOIN Feature f ON f.fid = rf.fid\n" +
                                "       WHERE a.username = ? AND a.password = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            Account account =null;
            Role currentRole = new Role();
            currentRole.setId(-1);
            Feature currentFeature = new Feature();
            currentFeature.setId(-1);
            while (rs.next()) {
                if(account ==  null)
                {
                    account = new Account();
                    account.setUsername(rs.getString("username"));
                    account.setAdmin(rs.getBoolean("admin"));
                    
                }
                int rid = rs.getInt("rid");
                if(rid!=-1)
                {
                    if(currentRole.getId()!= rid)
                    {
                        currentRole = new Role();
                        currentRole.setId(rid);
                        currentRole.setName(rs.getString("rname"));
                        account.getRoles().add(currentRole);
                    }
                }
                
                int fid = rs.getInt("fid");
                if(fid != -1)
                {
                    if(currentFeature.getId() != fid)
                    {
                        currentFeature = new Feature();
                        currentFeature.setId(fid);
                        currentFeature.setName(rs.getString("fname"));
                        currentFeature.setUrl(rs.getString("url"));
                        currentRole.getFeatures().add(currentFeature);
                    }
                }
                
            }
            
            return account;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public ArrayList<Account> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
