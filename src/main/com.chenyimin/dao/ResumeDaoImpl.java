package dao;

import domain.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResumeDaoImpl implements ResumeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入一份简历
     * @param resume
     */
    public int insertResume(Resume resume){
        String sqlStr = " INSERT INTO t_resume(email, detail, userid) VALUES (?, ?, ?) ";
        Object[] args = {resume.getEmail(), resume.getDetail(), resume.getUserid()};
        return jdbcTemplate.update(sqlStr, args);
    }

    /**
     * 删除简历
     * @param id 简历id
     * @return
     */
    public int deleteResule(int id){
        String sqlStr = " DELETE FROM t_resume WHERE id=? ";
        Object[] args = new Object[]{id};
        return jdbcTemplate.update(sqlStr, args);
    }
}
