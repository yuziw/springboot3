package com.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author Lurenc
 * @create 2021-07-13 21:41
 */
@Controller
@RequestMapping("down")
public class dowmload {
@RequestMapping("download")
    public  String download(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
    //得到文件夹路径
   String realpath= request.getSession().getServletContext().getRealPath("/download");
   //读取文件
    FileInputStream fis = new FileInputStream(new File(realpath, fileName));
    //设置响应格式
    response.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode(fileName, "utf-8"));
   //将输出的内容传给客户端
    ServletOutputStream so = response.getOutputStream();
    //文件的复制
    IOUtils.copy(fis, so);
    fis.close();
    so.close();
    return null;
}
}
