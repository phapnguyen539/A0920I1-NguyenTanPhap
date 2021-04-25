package dao.impl;

import dao.IStudentDAO;
import model.Student;
import ultils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements IStudentDAO {
    private static final String INSERT_STUDENT_SQL = "Insert into STUDENT(id, name, age, address) values (?, ?, ?, ?)";
    private static final String SELECT_STUDENT_BY_ID = "Select * from STUDENT where id = ?";
    private static final String SELECT_ALL_STUDENT = "Select * from STUDENT";
    private static final String DELETE_USER_BY_ID = "Delete from STUDENT where id = ?";
    private static final String UPDATE_USER = "Update STUDENT set name = ?, age = ?, address = ? where id = ?";
    @Override
    public void insertStudent(Student student) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            // Tao connection
            connection = ConnectionDB.getConnection();
            // Tao statement
            statement = connection.prepareStatement(INSERT_STUDENT_SQL);

            // Set parameter vao statement
            statement.setString(1, student.getId());
            statement.setString(2, student.getName());
            statement.setInt(3, student.getAge());
            statement.setString(4, student.getAddress());

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Student getStudent(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Student> studentList = new ArrayList<>();
        try {
            // Tao connection
            connection = ConnectionDB.getConnection();
            // Tao statement
            statement = connection.prepareStatement(SELECT_ALL_STUDENT);

            // Get du lieu tu DB vao resultset
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");

                Student student = new Student(id, name, age, address);
                studentList.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }


}
