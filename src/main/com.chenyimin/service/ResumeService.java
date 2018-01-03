package service;

import dao.ResumeDao;
import domain.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    /**
     * 插入简历
     * @param resume
     * @return
     */
    public boolean insertResume(Resume resume){
        int status = resumeDao.insertResume(resume);
        return status > 0;
    }

    /**
     * 删除简历
     * @param id
     * @return
     */
    public boolean deleteResume(int id){
        int status = resumeDao.deleteResule(id);
        return status > 0;
    }
}
