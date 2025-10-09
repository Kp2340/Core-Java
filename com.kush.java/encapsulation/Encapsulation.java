package encapsulation;

import java.util.List;

public class Encapsulation {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.setId("1");
        candidate.setName("Kush Patel");
        candidate.setRole("Software Engineer");
        candidate.setEmail("kushpatel2354@gmail.com");
        candidate.setPhone("+91 8141676345");
        candidate.setLocation("Ahmedabad, India");
        candidate.setLinkedin("linkedin.com/in/kushpatel2343");
        candidate.setGithub("github.com/Kp2340");
        candidate.setExperience("9 months intern");
        candidate.setSkill("Java, React, C++");
        candidate.setTopSkills(List.of("Java", "Spring", "React"));

        System.out.println("Candidate Details:");
        System.out.println("ID: " + candidate.getId());
        System.out.println("Name: " + candidate.getName());
        System.out.println("Role: " + candidate.getRole());
        System.out.println("Email: " + candidate.getEmail());
        System.out.println("Phone: " + candidate.getPhone());
        System.out.println("Location: " + candidate.getLocation());
        System.out.println("LinkedIn: " + candidate.getLinkedin());
        System.out.println("GitHub: " + candidate.getGithub());
        System.out.println("Experience: " + candidate.getExperience());
        System.out.println("Skills: " + candidate.getSkill());
        System.out.println("Top Skills: " + candidate.getTopSkills());
    }
}
//Output:
//Candidate Details:
//ID: 1
//Name: Kush Patel
//Role: Software Engineer
//Email: kushpatel2354@gmail.com
//Phone: +91 8141676345
//Location: Ahmedabad, India
//LinkedIn: linkedin.com/in/kushpatel2343
//GitHub: github.com/Kp2340
//Experience: 9 months intern
//Skills: Java, React, C++
//Top Skills: [Java, Spring, React]