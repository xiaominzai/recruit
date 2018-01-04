package dao;

import domain.Job;

import java.util.List;

public interface JobDao {
    public int insert(Job job);
    public int delete(int id);
    public int update(Job job);

    /**
     * 查找所有工作
     * @return
     */
    public List<Job> queryAll();
}
