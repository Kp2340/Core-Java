package encapsulation;

import java.util.List;

public class Candidate {
    private String id;
    private String name;
    private String role;
    private String email;
    private String phone;
    private String location;
    private String linkedin;
    private String github;
    private String experience;
    private String skill;
    private List<String> topSkills;

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getRole() {return role;}

    public void setRole(String role) {this.role = role;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getLinkedin() {return linkedin;}

    public void setLinkedin(String linkedin) {this.linkedin = linkedin;}

    public String getGithub() {return github;}

    public void setGithub(String github) {this.github = github;}

    public String getExperience() {return experience;}

    public void setExperience(String experience) {this.experience = experience;}

    public String getSkill() {return skill;}

    public void setSkill(String skill) {this.skill = skill;}

    public List<String> getTopSkills() {return topSkills;}

    public void setTopSkills(List<String> topSkills) {this.topSkills = topSkills;}

}