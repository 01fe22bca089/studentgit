class student_course_info {


    public void stud_info(){


        String[] courses = {"Devops", "C#", "Machine Learning"};
    
        int[] marks = {85, 80, 90};


        
        for (int i = 0; i < courses.length; i++) {
            
                
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }
}
