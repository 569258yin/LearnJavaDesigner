package com.yh.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{
	
	private ArrayList<IProject> projectList = new ArrayList<>();
	
	private int currentItem = 0;
	
	public ProjectIterator(ArrayList<IProject> projectList) {
		super();
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if(this.currentItem >= projectList.size() ||
				this.projectList.get(this.currentItem) == null){
			b = false;
		}
		return b;
	}

	@Override
	public IProject next() {
		return this.projectList.get(this.currentItem++);
	}

}
