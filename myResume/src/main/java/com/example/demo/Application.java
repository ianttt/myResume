package com.example.demo;

import java.util.Date;

import javax.servlet.annotation.WebServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.utils.Me;


@SpringBootApplication
@RestController
public class Application  {
	
	public static void main(String[] args) {
		SpringApplication.run(Application .class, args);
		System.out.println("_____跑起来了______");
	}
	
	
	
	@RequestMapping("/")
	public String index(){
		return "请通过127.0.0.1:8080/index.html打开";
	}
	@RequestMapping("/information")
	public Me information() {
		Me me=new Me("魏建国","男","本科","太原科技大学华科学院","信息管理与信息系统");
			String s = me.toString();
		return me;
	}
	@RequestMapping("/skill")
	public String skill() {
		String one="Java基础";
		String two="熟悉oracle 数据库 mysql 数据库";
		String three="了解spring,springMVC,mybatis等框架，可以自己使用";
		String four="会一些前端技能:html5,css,ajax";
		String five="会使用Tomcat,svn 在学习spring boot";
		String skill=one+two+three+four+five;
		return skill;
	}
	@RequestMapping("/project")
	public String project() {
		String one="智能机器人";
		String two="电信采集";
		String three="俄罗斯方块游戏";
		String four="网上商城";
		String project=one+two+three+four;
		return project;
	}
	@RequestMapping("/inSchool")
	public String inSchool() {
		String inSchool="在校期间获得过两次奖学金，三次院级表彰，当过学习委员，参加过社团活动，有勤工俭学，假期兼职的经历";
		
		return inSchool;
	}
}