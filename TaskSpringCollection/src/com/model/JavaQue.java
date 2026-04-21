package com.model;

import java.util.Iterator;
import java.util.List;

public class JavaQue 
{
	private int qid;
	private String qsubject;
	private String qname;
	private List<String> answer;
	
	
	 // by using constructor injection
	
	public JavaQue() {

	}

	public JavaQue(int id,String qsubject, String qname, List<String> answer) {
		super();
		this.qid = id;
		this.qname = qname;
		this.qsubject = qsubject;
		this.answer = answer;
	}

/*	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	
	public String getQsubject() {
		return qsubject;
	}
	public void setQsubject(String qsubject) {
		this.qsubject = qsubject;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
*/	
	public void display()
	{
		System.out.println("QueID: "+ qid);
		System.out.println("QSub: "+qsubject);
		System.out.println("Que: "+qname);
		System.out.println("Answer is Here: ");
		
		Iterator<String> itr = answer.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
}
