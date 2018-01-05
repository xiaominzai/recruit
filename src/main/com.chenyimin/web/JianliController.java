package web;

import domain.Resume;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.ResumeService;
import units.Shangchuan;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class JianliController {
    @Autowired
    private ResumeService service;

    @RequestMapping(value = "jianli.html")
    public ModelAndView RegisterPage(String name, @RequestParam() MultipartFile file, HttpServletRequest request) {

        if (!file.isEmpty() && !name.equals("") && file != null && name != null) {
            // 获取物理路径
            String targetDirectory = request.getSession().getServletContext().getRealPath("/images");
            String tmpFileName = file.getOriginalFilename(); // 上传的文件名
            int dot = tmpFileName.lastIndexOf('.');
            String ext = "";  //文件后缀名
            if ((dot > -1) && (dot < (tmpFileName.length() - 1))) {
                ext = tmpFileName.substring(dot + 1);
            }
            // 其他文件格式不处理
            if ("png".equalsIgnoreCase(ext) || "jpg".equalsIgnoreCase(ext) || "gif".equalsIgnoreCase(ext)) {
                // 重命名上传的文件名
                String targetFileName = Shangchuan.renameFileName(tmpFileName);
                // 保存的新文件
                File target = new File(targetDirectory, targetFileName);

                try {
                    // 保存文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), target);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Resume u = new Resume();
                u.setEmail(name);
                u.setDetail(request.getContextPath() + "/images/" + targetFileName);
                service.insertResume(u);
            }

            return new ModelAndView("resume", "error", "上传成功");
        }

        return new ModelAndView("resume", "error", "内容没有填写完整");
    }

}
