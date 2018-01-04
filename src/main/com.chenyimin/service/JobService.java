package service;

import dao.JobDao;
import domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobDao jobDao;

    /**
     * 删除工作
     * @param id 删除的主键
     * @return
     */
    public boolean deleteJob(int id){
        return jobDao.delete(id) > 0;
    }

    public List<Job> queryAllJob(){
        return jobDao.queryAll();
    }

    public boolean updateJob(Job job){
        return jobDao.update(job) > 0;
    }

    public boolean addJob(Job job){
        return jobDao.insert(job) > 0;
    }

}
