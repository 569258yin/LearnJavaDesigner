package com.yh.iterator;

public class Boss {
	public static void main(String[] args) {
		IProject project = new Project();
		
		project.add("1", 1, 100);
		
		for (int i = 0; i < 100; i++) {
			project.add("1"+i, 1 * i, 100*i);
		}
		
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()){
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
		
	}
}
