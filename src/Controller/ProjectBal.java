/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sheha
 */
public class ProjectBal {

    public void insertProject(ProjectBean project) {
        try {
            String query = "INSERT INTO project (ProjectName, ProjectDescription, StartDate, EndDate, Status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, project.getProjectName());
            ps.setString(2, project.getProjectDescription());
            ps.setObject(3, project.getStartDate());
            ps.setObject(4, project.getEndDate());
            ps.setString(5, project.getStatus());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Project has been added successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
       public ProjectBean loadProjectById(int projectId) {
        ProjectBean bean = null;
        try {
            String query = "SELECT * FROM project WHERE ProjectId = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setInt(1, projectId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String projectName = rs.getString("ProjectName");
                String projectDescription = rs.getString("ProjectDescription");
                Date startDate = rs.getDate("StartDate");
                Date endDate = rs.getDate("EndDate");
                String status = rs.getString("Status");

                bean = new ProjectBean(projectId, projectName, projectDescription, startDate, endDate, status);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return bean;
    }


    public List<ProjectBean> loadProjects() {
        List<ProjectBean> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM project";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int projectId = rs.getInt("ProjectId");
                String projectName = rs.getString("ProjectName");
                String projectDescription = rs.getString("ProjectDescription");
                Date startDate = rs.getDate("StartDate");
                Date endDate = rs.getDate("EndDate");
                String status = rs.getString("Status");
                ProjectBean project = new ProjectBean(projectId, projectName, projectDescription, startDate, endDate, status);
                list.add(project);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return list;
    }

    public void updateProject(ProjectBean project) {
        try {
            String query = "UPDATE project SET ProjectName = ?, ProjectDescription = ?, StartDate = ?, EndDate = ?, Status = ? WHERE ProjectId = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, project.getProjectName());
            ps.setString(2, project.getProjectDescription());
            ps.setObject(3, project.getStartDate());
            ps.setObject(4, project.getEndDate());
            ps.setString(5, project.getStatus());
            ps.setInt(6, project.getProjectId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Project has been updated successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void deleteProject(int projectId) {
        try {
            String query = "DELETE FROM project WHERE ProjectId = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setInt(1, projectId);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Project has been deleted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
