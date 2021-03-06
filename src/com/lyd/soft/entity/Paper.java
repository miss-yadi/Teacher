package com.lyd.soft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * 论文情况表
 * @author LYD
 *
 */
@Entity
@Table(name = "T_PAPER")
public class Paper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7329573250769325789L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true)
	private Integer id;	
	
	@OneToOne
	@JoinColumn(name="TEACHER_ID")
	private Teacher teacher;	
	
	@Column(name = "TITLE")
	@NotEmpty(message="{paper.title.not.empty}")
	private String title;			//论文名称
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "PUBLISH_DATE")
	@NotEmpty(message="{paper.publish.date.not.empty}")
	private Date publishDate;		//发表时间
	
	@Column(name = "WORD_COUNT")
	private Integer wordCount;		//字数
	
	@Column(name = "AUTHOR")
	private String author;			//作者顺序
	
	@Column(name = "PERIODICAL_LEVEL")
	@NotEmpty(message="{paper.periodical.level.not.empty}")
	private String periodicalLevel;	//期刊级别
	
	@Column(name = "PERIODICAL_NAME")
	@NotEmpty(message="{paper.periodical.name.not.empty}")
	private String periodicalName;	//期刊名称
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "CREATE_DATE")
	private Date createDate;		//创建时间
	
	@Column(name = "IS_DELETE")
	private Integer isDelete;		//删除

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getWordCount() {
		return wordCount;
	}

	public void setWordCount(Integer wordCount) {
		this.wordCount = wordCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPeriodicalLevel() {
		return periodicalLevel;
	}

	public void setPeriodicalLevel(String periodicalLevel) {
		this.periodicalLevel = periodicalLevel;
	}

	public String getPeriodicalName() {
		return periodicalName;
	}

	public void setPeriodicalName(String periodicalName) {
		this.periodicalName = periodicalName;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
