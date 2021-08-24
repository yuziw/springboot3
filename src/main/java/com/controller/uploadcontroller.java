package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author Lurenc
 * @create 2021-07-13 21:00
 */
@Controller
@RequestMapping("file")
public class uploadcontroller {

    @RequestMapping("upload")
    public String  upload(MultipartFile aa, HttpServletRequest request) throws IOException {

    //动态获取upload路径
        String realpath=request.getSession().getServletContext().getRealPath("/upload");
    //上传文件改名
        String fileName = UUID.randomUUID().toString().replace("-", "");
        //上传的源文件名
        String name = aa.getOriginalFilename();
        //文件后缀
        String hz = name.substring(name.lastIndexOf('.'));
        //创建日期类型的文件夹
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dur = sdf.format(new Date());
        new File(realpath,dur).mkdir();
        aa.transferTo(new File(realpath+"/"+dur,fileName+hz));
        return "index";
    }

}
