package com.galaxy.lesson1;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class fileController {
    @RequestMapping("/downloadFile")
    public void downloadFile(String fileName, HttpServletResponse response) throws IOException {
        //寻找文件路径
        String path = ResourceUtils.getURL("classpath:").getPath() + "files";
        System.out.println(fileName);

        //输入流   根据文件地址和路径，读到程序当中来
        FileInputStream input = new FileInputStream(new File(path, fileName));
        //输出流
        ServletOutputStream output = response.getOutputStream();

        //如果需要显示下载窗口，每次均已附件的形式下载
        // 每次下载都以附件的形式下载，如果没有标明，且浏览器可以打开文件--直接打开
        response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode(fileName,"UTF-8"));

        //将输入流写到输入流里面
        IOUtils.copy(input, output);
        //安静的关闭
        IOUtils.closeQuietly(input);
        IOUtils.closeQuietly(output);

        //强制关闭  等于强行拔电源
//        input.close();
//        output.close();
    }



















    @RequestMapping("/moreUploadFile")
    public String moreUploadFile(HttpServletRequest request, MultipartFile[] uploads) throws Exception {
        for (MultipartFile upload : uploads) {
            System.out.println("SpringMVC方式上传优化---多文件");
            String path = ResourceUtils.getURL("classpath:").getPath() + "upload";
            System.out.println(path);
            File dir = new File(path);
            if (!dir.exists())
                dir.mkdir();

            //优化日期
            String dateDirStr = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            File dateDir = new File(path, dateDirStr);
            if (!dateDir.exists())
                dateDir.mkdir();

            //优化文件名
            String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + UUID.randomUUID().toString().replace("-","");
            String extension = FilenameUtils.getExtension(upload.getOriginalFilename());
            filename = filename + "." + extension;
            upload.transferTo(new File(dateDir, filename));

        }



        return "success";
    }

    @RequestMapping("/uploadFile2")
    public String uploadFile2(MultipartFile upload, HttpServletRequest request) throws Exception {
        System.out.println("SpringMVC上传优化");
        //获取服务器文件路径
        String path = ResourceUtils.getURL("classpath:").getPath() + "upload";
        System.out.println(path);

        //优化日期路径
        String dateDitStr = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        File dateDir = new File(path, dateDitStr);
        if(!dateDir.exists())
            dateDir.mkdir();

        //优化文件名
        String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + UUID.randomUUID().toString().replace("-", "");
        String extension = FilenameUtils.getExtension(upload.getOriginalFilename());
        filename = filename + "." + extension;

        //文件上传
        upload.transferTo(new File(dateDir, filename));
        return "success";
    }

    @RequestMapping("/uploadFile")
    public String uploadFile(MultipartFile aaa, HttpServletRequest request) throws Exception {
        //获取服务器更改路径
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File dir = new File(path);
        if (!dir.exists())
            dir.mkdir();

        //文件处理
        //获取文件名 getOriginalFilename获取文件原始名
        String filename = aaa.getOriginalFilename();
        //文件上传
        aaa.transferTo(new File(path, filename));
        return "success";
    }

    @RequestMapping("/uploadFileOld")
    public String uploadFileOld(HttpServletRequest request) throws Exception {
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File dir = new File(path);
        if (!dir.exists())
            dir.mkdir();
        //创建一个工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //解析request对象，获取上传文件
        ServletFileUpload upload = new ServletFileUpload(factory);

        //解析request
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem item : fileItems) {
            if (item.isFormField()) {
                //普通字段
            } else {
                //文件处理
                //获取文件名
                String filename = item.getName();

                //文件上传
                item.write(new File(path, filename));
                //删除临时文件---大于10mb时
                item.delete();
            }
        }

        return "success";
    }

}
