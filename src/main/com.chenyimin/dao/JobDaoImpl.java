package dao;

import domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JobDaoImpl implements JobDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Job job) {
        String sqlStr = " INSERT INTO t_job(jobname, img, title, fu_titile, address) VALUES(?, ?, ?,?,?) ";
        Object[] args = new Object[]{job.getJobname(),job.getImg(), job.getTitle(), job.getFu_title(), job.getAddress()};
        return jdbcTemplate.update(sqlStr,args);
    }

    @Override
    public int delete(int id) {
        String sqlStr = " DELETE FROM t_job WHERE id=? ";
        Object[] args = new Object[]{id};
        return jdbcTemplate.update(sqlStr, args);
    }

    @Override
    public List<Job> queryAll() {
        String sqlStr = " SELECT * FROM t_job ";
        RowMapper<Job> mapper = new BeanPropertyRowMapper<Job>(Job.class);
        List<Job> job = jdbcTemplate.query(sqlStr,mapper,50);
        return job;
    }

    @Override
    public int update(Job job) {
        String sqlStr = " UPDATE t_job SET jobname=?, img=?,title=? ,fu_titile=?, address=? WHERE id=?";
        return jdbcTemplate.update(sqlStr,new Object[]{job.getJobname(),job.getImg(),job.getTitle(),job.getFu_title(),job.getAddress()});
    }
}
