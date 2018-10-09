package seedu.address.model.template;

import java.util.ArrayList;

/**
 * A template which specifies the categories and layout for the resume,
 * and which tags are to be included.
 */
public class Template {

    private ArrayList<ResumeSection> sections;

    public Template() {
        this.sections = new ArrayList<ResumeSection>();
    }

    public void addSection(String title, String category, String[] tags) {
        this.sections.add(new ResumeSection(title, category, tags));
    }

    public ArrayList<ResumeSection> getSections() {
        return new ArrayList<ResumeSection>(sections);
    }
}
